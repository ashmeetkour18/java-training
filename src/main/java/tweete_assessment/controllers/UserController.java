package tweete_assessment.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import tweete_assessment.entity.User;
import tweete_assessment.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tweete_assessment.exceptions.CommonException;
import tweete_assessment.exceptions.ErrorException;
import tweete_assessment.utility.Utility;

import java.util.stream.Collectors;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;
  @Value("${follower.allowed}")
    boolean allowed;
    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView registerUser(@RequestBody MultiValueMap<String, String> requestBodyMap) {
        String email = requestBodyMap.get("email").get(0);
        String name = requestBodyMap.get("name").get(0);
        String password = requestBodyMap.get("password").get(0);
        ModelAndView modelAndView = new ModelAndView("login");
        User userByEmail = userDao.findByEmail(email);
        if (userByEmail.getEmail() == null) {
            boolean validEmail = Utility.isValidEmail(email);
            boolean b = Utility.containsInvalidChars(name);
            System.out.println(b + "-----------------");
            if (validEmail && b && password.length() > 3) {
                User user = new User(name, email, password);
                userDao.saveUser(user);
                return modelAndView;
            }
            throw new CommonException("invalid type of email or password ", HttpStatus.BAD_REQUEST);

        }
        throw new CommonException("Already registered email ", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/fetchUser")
    ModelAndView fetchUser(@RequestParam String email) {
        User user = userDao.findByEmail(email);
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.getModel().put("users", userDao.findAll().stream().filter(user_ -> user_.getId() != user.getId()).collect(Collectors.toList()));
        modelAndView.getModel().put("userEmail", email);
        modelAndView.getModel().put("allowed",allowed);
        modelAndView.getModel().put("passwordUser", user.getPassword());
        return modelAndView;
    }

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView login(@RequestBody MultiValueMap<String, String> map) {
        String email = map.get("email").get(0);
        String password = map.get("password").get(0);
        if (Utility.isValidEmail(email)) {
            User user = userDao.findByEmail(email);
            if (user != null && email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                ModelAndView modelAndView = new ModelAndView("profile");
                modelAndView.getModel().put("name", user.getName());
                modelAndView.getModel().put("email", user.getEmail());
                modelAndView.getModel().put("password", user.getPassword());
                return modelAndView;
            }
        }
        throw new CommonException("No Data Match", HttpStatus.BAD_REQUEST);
    }
/*

    @PutMapping("/update")
    private ResponseEntity<String> updateRecord(@RequestBody Map<String, String> requestBodyMap) {
        String email = requestBodyMap.get("email");
        String name = requestBodyMap.get("name");
        String password = requestBodyMap.get("password");
        if (!Utility.containsInvalidChars(name)) {
            return new ResponseEntity<>("name contains invalid characters",
                    HttpStatus.BAD_REQUEST);
        } else if (userProfile.containsKey(email) && userProfile.get(email).getPassword().equals(password)) {
            User user = userProfile.get(email);
            String currName = user.getName();
            if (currName.equals(name)) {
                return new ResponseEntity<>("No change rquired",
                        HttpStatus.OK);
            } else {
                user.setName(name);
                userProfile.put(email, user);
                return new ResponseEntity<>("update successful",
                        HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("User doesn't exist",
                HttpStatus.NOT_FOUND);

    }
*/


}
