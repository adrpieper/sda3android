package app.login.loginapp;

/**
 * Created by Adrian on 2017-04-22.
 */

public class UserService {


    public boolean checkUser(String name, String password) {
        return "admin".equals(name) && "admin".equals(password);
    }
}
