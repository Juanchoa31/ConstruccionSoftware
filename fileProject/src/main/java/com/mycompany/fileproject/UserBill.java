package com.mycompany.fileproject;

public class UserBill {
    private String alias;
    private String name;
    private String email;

    public UserBill(String alias, String name, String email) {
        this.alias = alias;
        this.name = name;
        this.email = email;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
    public String getInfo(){
        return this.getAlias() + " - " + this.getName() + " - " + this.getEmail();
    }
}
