package ItemsToStudy;

public class Name {
    public static boolean validate(String username) {

        if(username.length()>=6 && username.length()<20){
            return true;
        }
        if(username.contains(".") || username.matches("^[a-z][A-Z][a-z][0-9]")){
            return true;
        }
        if(!username.endsWith(".")){
            return true;
        }
            throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        System.out.println(validate("Robert.Domek")); // Valid username, returns true
        System.out.println(validate("Robert Domek")); // Invalid username, returns false
    }
}
