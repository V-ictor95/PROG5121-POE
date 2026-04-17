public class Login {
    
    //private String 1Username;
    
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <=5;
    }
    public boolean checkPasswordComplexity (String password){
        return password != null && password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$].*");
    }
    public String registerUser (String username, String password){
        if (username == null || !(username.contains("_") && username.length() <=5 )) {
            return  """
                   elcome <user first 
                   name>, <user last 
                   name> it is great to 
                   see you agai""";
        } else if (!checkPasswordComplexity(password)){
            return """
                   Username or 
                   password incorrect, 
                   please try again""";
        } else {
            return " The conditions have been met ";
        }
    }
    public boolean checkCellPhoneNumber(String phoneNumber){
        return phoneNumber.matches("^\\+\\d{1,3}\\d{1,10}$");
    }
    
    public boolean loginUser(String username, String password) {
        return password != null && password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$]") && username.contains("_") && username.length() <=5;
    }
    public String returnLoginStatus(boolean loginUser) {
        //return loginUser ? "A successful login" : " A failed login";
        
        
        if (loginUser){
            return "A successful login";
        } else {
            return "A failed login";
        }
    }
}
