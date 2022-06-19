package finalproject;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.security.MessageDigest;

/**
 *
 * @author ErikE
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
   
    

        
  

    
    
    
    
    public static void main(String[] args)throws Exception {
        // Variable Declarations for user name and password
        
        UserInfo user1 = new UserInfo();
        Scanner scnr = new Scanner(System.in);
        String userName = "none";
        String userPassword = "none";
        FileInputStream credentials = null;
        int numAttempts =  3;
        String userPasswordHash = "";
        
        while (numAttempts > 0){
            System.out.println("Enter username or \"q\" to exit: ");
            userName = scnr.nextLine();
            if (userName.equals("q")){
                System.out.println("System exiting. Thank You!");
                return;
            }
            System.out.println("Enter password:");
            userPassword = scnr.nextLine();

             //Input File Stream
            Scanner inFS = null;
            credentials = new FileInputStream("credentialsfile.txt");
            inFS = new Scanner(credentials);

            //Determines if the credentials file contains additional lines of input. 
            while (inFS.hasNextLine()){
                String nextLine = inFS.nextLine();
                if (nextLine.contains(userName)){
                    user1.setUserCredentialStr(nextLine);
                    
                    

                    //Test credential String via user class and local.
                    //System.out.println(user1.getUserCredentialStr());
                    //System.out.println(userCredStr);
                    
                    
                    String[] parsedString = user1.getUserCredentialStr().split("\\t");
                    //Testing correct parsing of credetials file string. 
                    //System.out.println(parsedString[0]);
                    //System.out.println(parsedString[1]);
                    //System.out.println(parsedString[2]);
                    //System.out.println(parsedString[3]);
                    user1.setUserRole(parsedString[3]);

                    String original = userPassword;  //Replace "password" with the actual password inputted by the user
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(original.getBytes());
                    byte[] digest = md.digest();
                    StringBuffer sb = new StringBuffer();
                        for (byte b : digest) {
                                sb.append(String.format("%02x", b & 0xff));
                        }
                    userPasswordHash = sb.toString();
                }
            }
            //Follows this path if both the username and userpassword hash are correct. 
            if (user1.getUserCredentialStr().contains(userName) && user1.getUserCredentialStr().contains(userPasswordHash)){
                //Determine user role by parsing string for last entry.
                FileInputStream outputFile = null;
                Scanner outFS = null;
                outputFile = new FileInputStream(user1.getUserRole() + ".txt");
                outFS = new Scanner(outputFile);
                while(outFS.hasNextLine()){
                    System.out.println();
                    System.out.print(outFS.nextLine());
                }
                System.out.println();

            }
            //Follows this path if username or password hash are not correct, and allows
            //user to retry input.
            else if (!user1.getUserCredentialStr().contains(userName) || !user1.getUserCredentialStr().contains(userPasswordHash)){
                System.out.println();
                System.out.println("Incorrect username or password.");
                System.out.println((numAttempts - 1) + " attempts remaining.\n");
                numAttempts--;
            }



            

        }
        System.out.println("Too many failed attempts.");
        System.out.println("System exiting.");
    }
}
        
    
           

   
