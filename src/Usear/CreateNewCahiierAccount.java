/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usear;

abstract public class CreateNewCahiierAccount {
    
     private String username;
     private String password;

    
     abstract public void createAccount();
    
     public String getUsername() {
        return username;
    }
      
     public String getPassword() {
        return password;
    }
     
    public void setUsername(String username) {
        this.username = username;
    }

  
    public void setPassword(String password) {
        this.password = password;
    }

     
   
}