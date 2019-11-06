/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.model;

/**
 *
 * @author Windows 8.1 pro
 */
public class thongkengay {
    private String thoigian;
    private int      tongtien;

    public thongkengay(String thoigian, int tongtien) {
        this.thoigian = thoigian;
        this.tongtien = tongtien;
    }

    public thongkengay() {
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }
    
}
