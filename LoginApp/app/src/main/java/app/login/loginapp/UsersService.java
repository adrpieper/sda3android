package app.login.loginapp;

import android.content.res.Resources;

import java.util.HashMap;

/**
 * Created by Przemysław on 2017-04-22.
 */

public class UsersService {

    public HashMap<String, String> hashMapWithUsers = new HashMap<>();
    private Resources resources;

    public UsersService(Resources resources) {
        this.resources = resources;
    }

    public void load() {
        String[] stringArray = resources.getStringArray(R.array.UserAndPasswordMap);
        for (int i=0; i<stringArray.length; i+=2) {
            hashMapWithUsers.put(stringArray[i], stringArray[i + 1]);
        }
    }
}
