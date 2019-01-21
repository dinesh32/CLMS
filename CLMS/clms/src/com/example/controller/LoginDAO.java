/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.common.DBConnection;
import com.example.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class LoginDAO {
   public  static int verifylogin(Login ob){
       int status=0;
       try{
           Connection con=DBConnection.getConnection();
           String sql="select * from login where username=? and password=?";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1, ob.getUsername());
           pst.setString(2, ob.getPassword());
           ResultSet rs=pst.executeQuery();
           while(rs.next()){
           status=1;
       }
       }catch(Exception ex){
               System.out.println(ex);
               }
       return status;
           
       }
   } 
    

