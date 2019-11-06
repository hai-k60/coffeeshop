/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import coffee.model.douong;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import coffeeshop.menu_panel;
import static coffee.data.connectdata.openConnection;
/**
 *
 * @author An Le Ha
 */
public class douong_data {
    
    
    //Ham dong ket noi CSDL

    public static void LoadDatatoJTable(DefaultTableModel myModel)
    {
        Connection connection = openConnection();
        String sql = "SELECT * FROM douong";// chuỗi truy vấn CSDL
        try{
            PreparedStatement ps = connection.prepareStatement(sql);//Cbi truy van
            ResultSet rs = ps.executeQuery(); // thuc thi truy van
            while(rs.next())// doc du lieu
            {
                Vector vector = new Vector();
                douong p = new douong();
                p.setId_douong(rs.getInt("id_douong"));// du lieu doc duoc dua ve id_douong
               p.setTendouong(rs.getString("tendouong"));
                p.setLoaidouong(rs.getString("loaidouong"));
                p.setGia(rs.getInt("gia"));
                p.setDonvi(rs.getString("donvi"));
                // dua vao vector
                vector.add(p.getId_douong());
                vector.add(p.getTendouong());
                vector.add(p.getLoaidouong());
                vector.add(p.getGia());
                vector.add(p.getDonvi());
                // dua vector vao model
                myModel.addRow(vector);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    public static int insertDoUong(String douong, String loaidouong, int gia, String donvi)// throws SQLException
    {
            int kq = -1;
            String querry = "INSERT INTO douong (tendouong, loaidouong, gia, donvi) VALUES (?,?,?,?)";
            Connection connection = openConnection();
        try {
           PreparedStatement ps = (PreparedStatement) connection.prepareStatement(querry);
           ps.setString(1, douong);
           ps.setString(2, loaidouong);
           ps.setInt(3, gia);
           ps.setString(4, donvi);
           kq = ps.executeUpdate();
           return kq;
        }
        catch (Exception e){
            e.printStackTrace();
        
        }
        return kq;
      
    }
    public static int deleteDouong(int id_douong)
    {
        int kq = -1;
        Connection connection = openConnection();
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement("DELETE FROM douong WHERE id_douong=?");
            ps.setInt(1, id_douong);
            kq = ps.executeUpdate();
            return kq;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return kq;
    }
    public static int updateDoUong(int id_douong, String douong, String loaidouong, int gia, String donvi)// throws SQLException
    {
            int kq = -1;
            String querry = "UPDATE douong SET tendouong=?, loaidouong=?, gia=?, donvi=? WHERE id_douong=?";
            Connection connection = openConnection();
        try {
           PreparedStatement ps = (PreparedStatement) connection.prepareStatement(querry);
           ps.setString(1, douong);
           ps.setString(2, loaidouong);
           ps.setInt(3, gia);
           ps.setString(4, donvi);
           ps.setInt(5, id_douong);
           kq = ps.executeUpdate();
           return kq;
        }
        catch (Exception e){
            e.printStackTrace();
        
        }
        return kq;
      
    }
}
