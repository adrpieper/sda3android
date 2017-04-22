package app.login.loginapp;



public class UserService {


    public boolean checkUser(String name, String password) {
        return "admin".equals(name) && "admin".equals(password);
    }
}
