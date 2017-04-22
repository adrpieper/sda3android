package app.login.toobasicloginapp;

/**
 * Created by szyms on 4/22/17.
 */

public class UserBase {

    private String validLogin;

    public String getValidLogin() {
        return validLogin;
    }

//    public boolean isValid(String login) {
//
//        if (getValidLogin() == login) {
//
//            // w nowym activity ma się pojawić komunikat o sukcesie logowania
//        }
//        return false;
//    }

    public boolean checkUser(String name, String password) {

        return name.equals("admin") && password.equals("admin");
    }


}
