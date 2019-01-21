/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.common.DBConnection;
import com.example.model.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class MemberDAO {
     public void insertData(Member ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into member(name,address,gender,mobile,email,membership,img)values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getName());
            pst.setString(2, ob.getAddress());
           
            pst.setString(3, ob.getGender());
             pst.setLong(4, ob.getMobile());
            pst.setString(5, ob.getEmail());
            pst.setString(6,ob.getMembership());
            pst.setString(7, ob.getImg());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Record Saved");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}
