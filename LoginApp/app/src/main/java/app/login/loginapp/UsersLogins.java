package app.login.loginapp;

        import java.util.HashMap;
        import java.util.Map;

/**
 * Created by RENT on 2017-04-22.
 */

public class UsersLogins {


    private Map<String, String> users = new HashMap<>();

    public void createUsers(){

        users.put("User1", "u1");
        users.put("User2", "u2");
        users.put("User3", "u3");

    }



    public boolean checkUser() {
        for (Map.Entry<String, String> entry : users.entrySet()){
            if (entry.getKey().equals()){
                if(entry.getValue())
            }
        }
        {

        }



    }
}
