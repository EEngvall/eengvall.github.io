/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author ErikE
 */



public class UserInfo {
    
    String userRole = "";
    String userCredentialStr = "";
    
    //Sets user role for object user1
    public void setUserRole(String role){
        userRole = role;
    }
    
    //Retrieves user role from main method.
    public String getUserRole(){
        return userRole;    
    }
    //Fills credential string from credetial file.
    public void setUserCredentialStr(String credential){
        userCredentialStr = credential;
    }
    //Retrieves credential string.
    public String getUserCredentialStr(){
        return userCredentialStr;
    }
    
}
