package app.login.loginapp;

/**
 * Created by RENT on 2017-04-22.
 */

public class UserLogin {
    private String login;
    private String password;

    public UserLogin(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLogin userLogin = (UserLogin) o;

        if (login != null ? !login.equals(userLogin.login) : userLogin.login != null) return false;
        return password != null ? password.equals(userLogin.password) : userLogin.password == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
