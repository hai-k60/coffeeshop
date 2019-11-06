/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MyPC
 */
public class order_data {
    //Ham check sdt khach hang
    public int checkKhachhang(String sodienthoai){
        int count=0;
        Connection connection= openConnection();//mo ket noi
        String sql="SELECT COUNT(*) FROM coffeeshop.khachhang WHERE sodienthoai=\""+sodienthoai+"\"";
        try{
            PreparedStatement ps = connection.prepareCall(sql);//chuan bi ket noi
            ResultSet rs = ps.executeQuery();//Thuc thi truy van
            rs.next();
            count=rs.getInt("COUNT(*)");//check so dien thoai khach hang
        } catch(Exception e){
            e.printStackTrace();
        }
        return count;
    }
    
    //Ham add khach hang moi
    public void addKhachhang(String sodienthoai, String hoten){
        Connection connection= openConnection();//mo ket noi
        String sql="INSERT INTO `coffeeshop`.`khachhang` (hoten, sodienthoai, diemtichluy) VALUES ('"+hoten+"', '"+sodienthoai+"', '0')";
        try{
            PreparedStatement ps = connection.prepareCall(sql);//chuan bi ket noi
            ps.execute();//Thuc thi truy van
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
     //Ham add khach hang moi
    public String[] getKhachhang(String sodienthoai){
        String[] data= new String[]{"","","0"};
        Connection connection= openConnection();//mo ket noi
        String sql="select hoten,sodienthoai,diemtichluy from coffeeshop.khachhang where sodienthoai=\""+sodienthoai+"\"";
        try{
            PreparedStatement ps = connection.prepareCall(sql);//chuan bi ket noi
            ResultSet rs = ps.executeQuery();//Thuc thi truy van
            rs.next();
            data[0]=rs.getString("hoten");
            data[1]=rs.getString("sodienthoai");
            data[2]=rs.getString("diemtichluy");
        } catch(Exception e){
            e.printStackTrace();
        }
        return data;
        
    }
    
}
