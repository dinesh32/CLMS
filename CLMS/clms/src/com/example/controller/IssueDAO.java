/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.controller;

import net.proteanit.sql.DbUtils;//method of jar file 

import com.example.common.DBConnection;
import com.example.model.Book;
import com.example.model.Issue;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class IssueDAO {
    public void insertData(Issue ob) {
        try {
            Connection con = DBConnection.getConnection();
            //String sql = "insert into issue(mid,bid,issuedate,returndate,status)values(?,?,?,?,?)";
            String sql = "insert into issue(mid,bid,issuedate,returndate,status)values(?,?,'2008-11-11','2014-11-11',?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, ob.getMid());
            pst.setInt(2, ob.getBid());
           // pst.setDate(3, (Date) ob.getIssuedate());
          // pst.setDate(3,"2008-11-11");
           // pst.setDate(4, (Date) ob.getReturndate());
            pst.setBoolean(3, ob.isStatus());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Book Issued Sucessfully ");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
    //Take data from database
    public ArrayList<Issue> fetchData() {
        ArrayList<Issue> list = new ArrayList();
        try{
            Connection con=DBConnection.getConnection();
            String sql="select * from issue";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                Issue ob=new Issue();
                ob.setMid(rs.getInt("mid"));
                ob.setBid(rs.getInt("bid"));
                java.util.Date issuedate = new Date(rs.getDate("issue").getTime());
               
                ob.setIssuedate(issuedate);
                 java.util.Date returndate = new Date(rs.getDate("return").getTime());
                 ob.setReturndate(returndate);
               
                ob.setStatus(false);
                
               
                list.add(ob);
                
            }
        }catch(Exception e){
            System.out.println(e);
            
        }
        return list;
    }
}
