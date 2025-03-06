import java.io.Console;
public class ConsoleClass {
    public static void main(String[]args){
        Console pass = System.console();
        if(pass==null){
            System.out.println("There is no string in password");
            return;
        }
        char[] newPass = pass.readPassword("Enter your password:");
        String Password = new String(newPass);
        System.out.println("Password entered securely");
        System.out.println(Password);

    }
}