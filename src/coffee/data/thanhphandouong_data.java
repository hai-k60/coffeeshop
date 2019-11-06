/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import coffee.model.douong;
import coffee.model.nguyenlieu;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.Debug;

/**
 *
 * @author An Le Ha
 */
public class thanhphandouong_data {
    public static int insertThanhphan(int id_douong, int id_nguyenlieu, int luong )
    {
        int kq = -1;
        String querry = "INSERT INTO thanhphandouong (id_douong, id_nguyenlieu, luong) VALUES (?,?,?)";
        Connection connection = openConnection(); 
        try {
           PreparedStatement ps = (PreparedStatement) connection.prepareStatement(querry);
           ps.setInt(1, id_douong);
           ps.setInt(2, id_nguyenlieu);
           ps.setInt(3, luong);
           kq = ps.executeUpdate();
           return kq;
        }
        catch (Exception e){
            e.printStackTrace();
        
        }
        return kq;
    }
    public static int getid_nguyenlieu(String tennguyenlieu)
    {
        int kq =0 ;
        String querry = "SELECT * FROM nguyenlieu WHERE tennguyenlieu =?";
        Connection connection = openConnection(); 
        try {
           nguyenlieu p = new nguyenlieu();            
           PreparedStatement ps = (PreparedStatement) connection.prepareStatement(querry);
           ps.setString(1, tennguyenlieu);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
                p.setId_nguyenlieu(rs.getInt("id_nguyenlieu"));
                kq = p.getId_nguyenlieu() ;
                return kq;
           }
        }
        catch (Exception e){
            e.printStackTrace();
       
        }
        return kq;
    }
    public static void loadThanhphantoJtable(DefaultTableModel myModel)
    {
        Connection connection = openConnection();
        String sql = "SELECT * FROM thanhphandouong";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);//Cbi truy van
            ResultSet rs = ps.executeQuery(); // thuc thi truy van
            while(rs.next())// doc du lieu
            {
                Vector vector = new Vector();
                nguyenlieu p = new nguyenlieu();
                p.setId_nguyenlieu(rs.getInt("id_nguyenlieu"));
                p.setTennguyenlieu(nguyenlieu_data.getnguyenlieu(rs.getInt("id_nguyenlieu")));
                
                // dua vao vector
                vector.add(p.getTennguyenlieu());
                vector.add(rs.getString("luong"));

                // dua vector vao model
                myModel.addRow(vector);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}