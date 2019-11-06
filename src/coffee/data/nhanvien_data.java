/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import coffee.model.nhanvien;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MyPC
 */
public class nhanvien_data {
    //HIen thi du lieu nhan vien tu sql len employees_pannel
    public void GetDataNhanvien(DefaultTableModel myModel)
    {
        Connection connection = openConnection();//Mo ket noi
        String sql="SELECT * FROM nhanvien"; //Chuoi truy van CSDL
        try{
            PreparedStatement ps = connection.prepareStatement(sql);//Chuan bi truy van
            ResultSet rs = ps.executeQuery();//Thuc thi truy van
            while(rs.next())//Doc du lieu
            {
                
                nhanvien nv = new nhanvien();
                nv.setId_nhanvien(rs.getInt("id_nhanvien"));
                nv.setHoten(rs.getString("hoten"));
                nv.setDiachi(rs.getString("diachi"));
                nv.setChucvu(rs.getString("chucvu"));
                nv.setUsername(rs.getString("username"));
                nv.setPassword(rs.getString("password"));
                nv.setSodienthoai(rs.getString("sodienthoai"));
                
                //Dua du lieu nhanvien vao vector
                Vector vector = new Vector();
                vector.add(nv.getId_nhanvien());
                vector.add(nv.getHoten());
                vector.add(nv.getDiachi());
                vector.add(nv.getChucvu());
                vector.add(nv.getUsername());
                vector.add(nv.getPassword());
                vector.add(nv.getSodienthoai());
                
                //Dua vector vao model
                myModel.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Ham Add du lieu len mysql khi bam nut New
        public void addEmployees(String txtHoten, String txtDiachi, String txtChucvu, String txtUsername, String txtPassword, String txtSodienthoai)
        {
        String querry = "INSERT INTO nhanvien (hoten, diachi, chucvu, username, password, sodienthoai) VALUES (?,?,?,?,?,?)";
        Connection connection = openConnection(); //Mo ket noi
        try{
            PreparedStatement ps = connection.prepareStatement(querry); //Chuan bi truy van
            ps.setString(1, txtHoten);
            ps.setString(2, txtDiachi);
            ps.setString(3, txtChucvu);
            ps.setString(4, txtUsername);
            ps.setString(5, txtPassword);
            ps.setString(6, txtSodienthoai);
            ps.execute();//Thuc thi truy va
        } catch (Exception e) {
            e.printStackTrace();
            }
        }
     // Ham Delete du lieu nhan vien mysql khi bam Delete
        public void delEmployees(int id){
            String querry = "DELETE FROM nhanvien WHERE id_nhanvien= (?)";
            Connection connection = openConnection();//Mo ket noi
        try{
            PreparedStatement ps = connection.prepareStatement(querry);//Chuan bi truy van
            //int row = table_nguyenlieu.getSelectedRow();
            ps.setInt(1, id);
            ps.execute();//Thuc thi truy van 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     // Ham Update du lieu nhan vien vao my sql
        public static int modEmployees(String txtHoten, String txtDiachi, String txtChucvu, String txtUsername,  String txtSodienthoai, int id_nhanvien){
        int kq = -1;
        String querry = "UPDATE nhanvien SET hoten = ?, diachi = ?, chucvu = ?, username = ?, sodienthoai =?  WHERE id_nhanvien = ?";
        Connection connection = openConnection();//Mo ket noi
        try{
            PreparedStatement ps = connection.prepareStatement(querry);//Chuan bi truy van
            //int row = table_nguyenlieu.getSelectedRow();
    
            ps.setString(1, txtHoten);
            ps.setString(2, txtDiachi);
            ps.setString(3, txtChucvu);
            ps.setString(4, txtUsername);
            ps.setString(5, txtSodienthoai);
            ps.setInt(6, id_nhanvien);
            kq = ps.executeUpdate();//Thuc thi truy van  
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
            return kq;
        }
    }
       
}
