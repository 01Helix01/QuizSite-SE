public class RegisterAccountUI {
    public static String[] alreadyUsedID = {"keksdarl95@yahoo.com", "live@xyzx.org", "apple@xxxx.gov"};
    public static char[] badCharacters = {' ', '=', '+', '&', '!', '<', '>', '^', '%', '?'};

    public static final int minUserID = 8;
    public static final int maxUserID = 22;

    public static final int minPass = 6;
    public static final int maxPass = 18;

    public static boolean checkalreadyUsedID(String userLoginID){
        for(String id : alreadyUsedID) {
            if(userLoginID.equals(id)){
                return true;
            }
        }
        return false;
    }

    public static boolean LoginLength(String userLoginID){
        if(minUserID <= userLoginID.length()  &&  userLoginID.length() <= maxUserID){
            return true;
        }else{
            return false;
        }
    }
    public static boolean check_Pwd_Length(String argPass){
        if(minPass <= argPass.length()  &&  argPass.length() <= maxPass){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkLoginForBadCharacters(String userLoginID){
        for(char c : badCharacters){
            if(userLoginID.indexOf(c) >= 0){
                return true;
            }
        }

        for(char c : userLoginID.toCharArray()){
            if( Character.isISOControl(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean checkMatchingPass(String userPwd1, String userPwd2){
        if( userPwd1.equals(userPwd2) ){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String register(String userLoginID, String argPwd1, String argPwd2){
        if( !LoginLength( userLoginID ) ) {
            return "User ID not long enough";
        }
        if( checkalreadyUsedID( userLoginID ) ) {
            return "Login id exists !!!";
        }
        if( checkLoginForBadCharacters( userLoginID ) ){
            return "User ID is invalid";
        }

        if( !check_Pwd_Length( argPwd1 ) ){
            return "Password too short";
        }

        if( !checkMatchingPass( argPwd1, argPwd2 ) ){
            return "Retyped password does not match";
        }
        return "New Registration Successful";
    }
}
