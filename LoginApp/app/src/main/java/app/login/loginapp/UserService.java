package app.login.loginapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by RENT on 2017-04-22.
 */

public class UserService {
    private List<UserLogin> userList;

    public UserService(){
        userList = new ArrayList<>();
    }

    public void addUser(UserLogin user){
        userList.add(user);
    }

    public boolean checkUser(String login, String pass){
        boolean checkUser = false;
        Iterator<UserLogin> i = userList.iterator();
        UserLogin user = new UserLogin(login,pass);
        while(i.hasNext()){
            UserLogin userCheck = i.next();
            if(user.equals(userCheck)){
                checkUser = true;
            }
        }

        return checkUser;
    }

}
