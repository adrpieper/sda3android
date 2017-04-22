package app.login.loginapp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-04-22.
 */

public class Logins {

    private Map<String, String> logins;

   public Logins() {

       logins = new HashMap<>();
       logins.put("adam", "pomidor");
       logins.put("jola","slonce");
       logins.put("ala", "kot");

   }

    public Map<String, String> getLogins() {
        return logins;
    }
}
