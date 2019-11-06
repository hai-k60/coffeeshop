/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import coffee.model.thongkengay;
import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 8.1 pro
 */
public class thongkengay_data {
        String Thoigian[];
        public int Tongtienngay[];
        int Tongtien[];
        int i=0;
        public void GetDataKhachHang (DefaultTableModel myModel){
        Connection connection= openConnection();
        String sql= "SELECT * FROM donhang";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);//Chuan bi truy van
            ResultSet rs = ps.executeQuery();//Thuc thi truy van
            while(rs.next())//Doc du lieu
            {
                
                thongkengay kh = new thongkengay();
                kh.setThoigian(rs.getString("thoigian"));
                kh.setTongtien(rs.getInt("tongtien"));
                
                Tongtien[i]= kh.getTongtien();
                Thoigian[i]= kh.getThoigian();
                i++;
            }
            //Calendar cal = Calendar.getInstance();
            //if (cal.get(Calendar.HOUR) == 23) {
            for(int j = 0; j < Thoigian.length; j++){
                if (Thoigian[j]== "2019-11-01 00:00:00"){
                    Tongtienngay[0] = Tongtienngay[0] + Tongtien[j];
                }
                if (Thoigian[j]== "2019-11-02 00:00:00"){
                    Tongtienngay[1] = Tongtienngay[1] + Tongtien[j];
                }
                if (Thoigian[j]== "2019-11-03 00:00:00"){
                    Tongtienngay[2] = Tongtienngay[2] + Tongtien[j];
                }
            }
            
            
            //}
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
