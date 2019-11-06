/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import coffee.model.nguyenlieu;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author An Le Ha
 */
public class nguyenlieu_data {
    public static String getnguyenlieu(int id_nguyenlieu)
    {
        String kq = "" ;
        String querry = "SELECT * FROM nguyenlieu WHERE id_nguyenlieu =?";
        Connection connection = openConnection(); 
        try {
           nguyenlieu p = new nguyenlieu();            
           PreparedStatement ps = (PreparedStatement) connection.prepareStatement(querry);
           ps.setInt(1, id_nguyenlieu);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
                p.setTennguyenlieu(rs.getString("tennguyenlieu"));
                kq = p.getTennguyenlieu();
                return kq;
           }
        }
        catch (Exception e){
            e.printStackTrace();
       
        }
        return kq;
    }
}
