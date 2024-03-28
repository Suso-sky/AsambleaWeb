package com.asamblea.web.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserModel{

    @Id
    private Long userId;
    
    @Column
    private String password;

    @Column
    private  boolean isAdmin;

    /*private RoleModel role = getRole(isAdmin);

    public RoleModel getRole(boolean isAdmin){
        if(isAdmin){
            return new AdminModel();
        }else{
            return new OwnerModel();
        }
    }
    
    public RoleModel getRole() {return role;}

    public void setRole(RoleModel role) {this.role = role;}

    */

    public boolean getIsAdmin() { return this.isAdmin; }

    public void setIsAdmin(boolean admin) {this.isAdmin=admin;}

    public Long getUserId(){return userId;}

    public void setUsername(Long userId){this.userId = userId;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}
}