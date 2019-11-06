/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.model;

/**
 *
 * @author An Le Ha
 */
public class thanhphandouong {
    private int id_douong;
    private int id_nguyenlieu;
    private int luong;
    public thanhphandouong(int id_douong, int id_nguyenlieu, int luong) {
    this.id_douong = id_douong;
    this.id_nguyenlieu = id_nguyenlieu;
    this.luong = luong;
    }    
    public thanhphandouong()
            {}
    public int getId_douong() {
        return id_douong;
    }

    public void setId_douong(int id_douong) {
        this.id_douong = id_douong;
    }

    public int getId_nguyenlieu() {
        return id_nguyenlieu;
    }

    public void setId_nguyenlieu(int id_nguyenlieu) {
        this.id_nguyenlieu = id_nguyenlieu;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
}
