package tweete_assessment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tweete_assessment.dao.TweeterDao;
import tweete_assessment.dao.UserDao;
import tweete_assessment.entity.Tweet;
import tweete_assessment.entity.User;
import tweete_assessment.exceptions.CommonException;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@RestController
public class TweetController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private TweeterDao tweeterDao;

    @GetMapping("/tweets")
    ModelAndView getTweets(@RequestParam String email) {
        User user = userDao.findByEmail(email);
        List<Tweet> tweets = tweeterDao.findAllTweets(user.getId());
        ModelAndView modelAndView = new ModelAndView("tweets");
        modelAndView.getModel().put("tweets", tweets);
        modelAndView.getModel().put("name", email);
        return modelAndView;
    }

    @PostMapping(value = "/tweet", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView postTweet(@RequestBody MultiValueMap<String, String> tweetBody) {
        String email = tweetBody.get("email").get(0);
        String password = tweetBody.get("password").get(0);
        String tweet = tweetBody.get("tweet").get(0);
        if (email != "" && password != "" && tweet != "") {
            User user = userDao.findByEmail(email);
            if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                Tweet tweet1 = new Tweet(tweet, Timestamp.from(Instant.now()), user);
                ModelAndView modelAndView = new ModelAndView("success");
                tweeterDao.saveTweet(tweet1);

                return modelAndView;
            }
            throw new CommonException("email or password not matched try again", HttpStatus.NOT_FOUND);

        }
        throw new CommonException("invalid data ", HttpStatus.BAD_REQUEST);
    }
}

