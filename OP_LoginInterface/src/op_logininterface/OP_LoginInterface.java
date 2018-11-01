
package op_logininterface;
import java.util.*;

public class OP_LoginInterface {

    private static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {       
        String Username, Password;
        String EU, EP;
      
        System.out.println("Welcome Pleace create a user account");
        Username = CUser();
        Password = CPass();
        
        System.out.println("Enter Your Username and Password: ");
        System.out.print("Username: ");
        EU = kb.next();
        System.out.print("Password: ");
        EP = kb.next();
        
        if(EU.equals(Username) && EP.equals(Password)){
            
            System.out.println("Login Successful");
        
        } else {
            
            System.out.println("Login Unsuccesful");
        }
        
    }
    
    public static String CUser() {
        String CU;
        
        System.out.print("Enter a Username: ");
        CU = kb.next();
        
        return CU;
                
    }
    public static String CPass() {
        String CP;
        
        System.out.print("Enter a Password: ");
        CP = kb.next();
        
        return CP;
                
    }
    
    
}
