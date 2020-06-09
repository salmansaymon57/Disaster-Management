/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Hasnath Jami
 */
class Show2 {
    
    
    private String firstname,lastname;
    private int age;
    private String gender,email,username,password;
    private int phone;

   
    
    
    
     public Show2(String firstname,String lastname,int age,String gender,String email,String username,String password,int phone)
           
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.gender=gender;
        this.email=email;
        this.username=username;
        this.password=password;
        this.phone=phone;
           
        
    }

    Show2(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
      public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPhone() {
        return phone;
    }
    
  
  
    
    
    
   

    
    
    
    
    
    
    
    
    
    
}
