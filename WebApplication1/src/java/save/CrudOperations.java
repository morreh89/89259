/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author james
 */
public class CrudOperations {
        private int student_no;
    private String first_name;
    private String last_name;
    private String gender;
    private String programme;

    //Setters
    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    //Getters
    public int getStudent_no() {
        return student_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public String getProgramme() {
        return programme;
    }
    
    //Methods
    public int processGender(String g)
    {
    if (g.equalsIgnoreCase("Male")){
    return 1;}return 0;
    }
    public boolean save(){
       PreparedStatement pst = null;        
        
       Connection con=new DBConnector().connector();
       try{
       pst=con.prepareStatement("INSERT INTO student_details (student_id,First_name,Last_name,gender,program) VALUES(?,?,?,?,?)");
            pst.setInt(1,getStudent_no());
            pst.setString(2, getFirst_name());
            pst.setString(3, getLast_name());
            pst.setInt(4,processGender(getGender()));
            pst.setString(5,getProgramme());
            pst.executeUpdate();
            return true;
       }catch(SQLException ex){
           System.out.println("Error"+ex.getMessage());
           return false;
       }
    }
       public boolean removeRecord(){
        PreparedStatement pst=null;
        Connection con=new DBConnector().connector();
        try{
            pst=con.prepareStatement("DELETE FROM student_details WHERE student_id=?");
            pst.setInt(1,getStudent_no());
            pst.executeUpdate();
        return true;
        }catch(SQLException e){
        System.out.println("Error"+e.getMessage());
        return false;
        }
    }
    public boolean UpdateRecord(){
        PreparedStatement pst = null;        
        
       Connection con=new DBConnector().connector();
       
       try{
       pst=con.prepareStatement("UPDATE student_details SET First_name= ?, Last_name= ?, gender=?, program=? WHERE student_id= ?");
            
            pst.setString(1, getFirst_name());
            pst.setString(2, getLast_name());
            pst.setInt(3,processGender(getGender()));
            pst.setString(4,getProgramme());
            pst.setInt(5,getStudent_no());
            pst.executeUpdate();
           
            return true;
       }catch(SQLException ex){
           System.out.println("Error: "+ex.getMessage());
           return false;
       }
    }
}

