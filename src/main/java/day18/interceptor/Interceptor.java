package day18.interceptor;
/*        System.out.println("[request .getmethod  " + request.getMethod() + "] reques.requestUri " + request.getRequestURI() + " email :" + request.getParameterNames());
 */
import day18.controller.User;
import day18.controller.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class Interceptor implements HandlerInterceptor {
    @Autowired
    UserDao userDao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.getMethod().equals("GET") && !request.getRequestURI().contains("Form")) {
            return validateUser(request.getParameter("email"), request.getParameter("password"));
        }
        /*
        Try using this.
        It should contain the whole query string in the GET request

        * */
        return true;

    }

    public boolean validateUser(String email, String password) {
        User userByEmail = userDao.findByEmail(email);
        return userByEmail.getEmail() != null && password != null && password.equals(userByEmail.getPassword());
    }
}
