package webapp.appLayer;

public class User {
    public boolean isValidUserCredentials(String userName,String userPassword){
        if (userName.equals("abraham34@hotmail.fr") && userPassword.equals("test123")){
            return true;
        }
        return false;
    }
}
