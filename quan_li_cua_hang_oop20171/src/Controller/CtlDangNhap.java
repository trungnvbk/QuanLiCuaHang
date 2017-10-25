/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.Admin;
import model.ThaoTacAdmin;

/**
 *
 * @author Admin
 */
public class CtlDangNhap {
    public boolean DangNhap(String usname, String password){
        ArrayList<Admin> listAdmin = new ThaoTacAdmin().getAll();
        
        for(Admin a: listAdmin){
            if(a.getUsersname().equals(usname) && a.getPassword().equals(password)){
                return true;
            }
        }
        return false;      
    }
}
