/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import coffee.model.material;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danhnghia
 */
public class storage_data {
    public void delMaterial(int id){
                String querry = "DELETE FROM nguyenlieu WHERE id_nguyenlieu= (?)";
        
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
    
    public void modMaterial(int id, String amount){
        
        String querry = "UPDATE nguyenlieu SET luong = ? WHERE id_nguyenlieu = ?";
        
        Connection connection = openConnection();//Mo ket noi
        try{
            PreparedStatement ps = connection.prepareStatement(querry);//Chuan bi truy van
            //int row = table_nguyenlieu.getSelectedRow();
            ps.setInt(1, Integer.parseInt(amount));
            ps.setInt(2, id);
            ps.executeUpdate();//Thuc thi truy van
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
     
}
