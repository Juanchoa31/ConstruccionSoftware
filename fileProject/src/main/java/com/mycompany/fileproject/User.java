package com.mycompany.fileproject;

public class User {
    private String userName;
    private String email;
    private String fullName;

    public User(String userName, String email, String fullName) {
        this.userName = userName;
        this.email = email;
        this.fullName = fullName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getInfo(){
        return this.getUserName() + " - " + this.getFullName() + " - " + this.getEmail();
    }
}
