/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;
import net.proteanit.sql.DbUtils;//method of jar file 

import com.example.common.DBConnection;
import com.example.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BookDAO {
    

    public void insertData(Book ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into book(name,isbn,auther,publication,price,category)values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getName());
            pst.setLong(2, ob.getIsbn());
            pst.setString(3, ob.getAuther());
            pst.setString(4, ob.getPublication());
            pst.setFloat(5, ob.getPrice());
            pst.setString(6,ob.getCategory());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Record Saved");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
     public void updateData(Book ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "update book set name=?,isbn=?,auther=?,publication=?,category=? where id=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getName());
            pst.setLong(2, ob.getIsbn());
            pst.setString(3, ob.getAuther());
            pst.setString(4, ob.getPublication());
            pst.setString(5,ob.getCategory());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Record Saved");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

     public void deleteData(Book ob){
         try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from product where id=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
           
            pst.setInt(1, ob.getId());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Record Saved");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
         
         
     }
    public ArrayList<Book> fetchData() {
        ArrayList<Book> list = new ArrayList();
        try{
            Connection con=DBConnection.getConnection();
            String sql="select * from book";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                Book ob=new Book();
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setIsbn(rs.getInt("isbn"));
                ob.setAuther(rs.getString("auther"));
                ob.setPublication(rs.getString("publication"));
                ob.setCategory(rs.getString("category"));
                list.add(ob);
                
            }
        }catch(Exception e){
            System.out.println(e);
            
        }
        return list;
    }
   
    
}
