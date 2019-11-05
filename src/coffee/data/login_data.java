/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.data;

import static coffee.data.connectdata.openConnection;
import com.mysql.jdbc.Connection;
/**
 *
 * @author MyPC
 */
public class login_data {
    //Xac thuc username password
    public void getLogin(){
        Connection connection = openConnection();
        String sql = "SELECT COUNT(*) FROM coffeeshop.nhanvien WHERE username=\"admin\" and password=\"admin\"";
        
    }
}
