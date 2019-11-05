/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import coffee.model.material;
import coffee.model.nhanvien;
import coffeeshop.materials_panel;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danhnghia
 */
public class material_data {
     public void GetMaterialData(DefaultTableModel myModel)
    {
        Connection connection = openConnection();//Mo ket noi
        String sql="SELECT * FROM nguyenlieu"; //Chuoi truy van CSDL
        try{
            PreparedStatement ps = connection.prepareStatement(sql);//Chuan bi truy van
            ResultSet rs = ps.executeQuery();//Thuc thi truy van
            while(rs.next())//Doc du lieu
            {
                
                material mat = new material();
                mat.setId(rs.getInt("id_nguyenlieu"));
                mat.setName(rs.getString("tennguyenlieu"));
                mat.setAmount(rs.getString("luong"));
                mat.setUnit(rs.getString("donvi"));
                
                //Dua du lieu nhanvien vao vector
                Vector vector = new Vector();
                vector.add(mat.getId());
                vector.add(mat.getName());
                vector.add(mat.getAmount());
                vector.add(mat.getUnit());

                //Dua vector vao model
                myModel.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public void addMaterial(String txt_nguyenlieu, String txt_luong, String txt_donvi){
         String querry = "INSERT INTO nguyenlieu (tennguyenlieu, luong, donvi) VALUES (?,?,?)";
        
        Connection connection = openConnection();//Mo ket noi

        try{
            PreparedStatement ps = connection.prepareStatement(querry);//Chuan bi truy van
            ps.setString(1, txt_nguyenlieu);
            ps.setString(2, txt_luong);
            ps.setString(3, (String) txt_donvi);
            ps.execute();//Thuc thi truy van
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
