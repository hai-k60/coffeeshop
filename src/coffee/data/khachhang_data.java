/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import com.mysql.jdbc.Connection;
import coffee.model.khachhang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Windows 8.1 pro
 */
public class khachhang_data {
    public void GetDataKhachHang (DefaultTableModel myModel){
        Connection connection= openConnection();
        String sql= "SELECT * FROM khachhang";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);//Chuan bi truy van
            ResultSet rs = ps.executeQuery();//Thuc thi truy van
            while(rs.next())//Doc du lieu
            {
                
                khachhang kh = new khachhang();
                kh.setId_khachhang(rs.getInt("id_khachhang"));
                kh.setHoten(rs.getString("hoten"));
                kh.setSodienthoai(rs.getString("sodienthoai"));
                kh.setDiemtichluy(rs.getString("diemtichluy"));
                
                //Dua du lieu nhanvien vao vector
                Vector vector = new Vector();
                vector.add(kh.getId_khachhang());
                vector.add(kh.getHoten());
                vector.add(kh.getSodienthoai());
                vector.add(kh.getDiemtichluy());
                
                //Dua vector vao model
                myModel.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
