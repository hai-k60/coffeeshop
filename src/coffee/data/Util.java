/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import coffee.model.nhanvien;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author MyPC
 */
public class Util {
    public static Connection connection;
    //Ham ket noi CSDL
    public static synchronized Connection openConnection()
    {
        if(connection!=null)
        {
            return connection;
        }
        else
        {
            String url = "jdbc:mysql://localhost:3306/coffeeshop";
            String user="root";
            String pass="root";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    //Ham dong ket noi CSDL
    public static synchronized void closeConnection()
    {
        try{
            connection.close();
        } catch(Exception e) {
            
        }
        finally{
            connection = null;
        }
    }
    
    //Get data from nhanvien
    public static void GetData(DefaultTableModel myModel)
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
    
}
