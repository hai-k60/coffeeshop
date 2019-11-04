/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.model;

/**
 *
 * @author MyPC
 */
public class nhanvien {
    private int id_nhanvien;
    private String hoten;
    private String diachi;
    private String chucvu;
    private String username;
    private String password;    
    private String sodienthoai;    

    public nhanvien(int id_nhanvien, String hoten, String diachi, String chucvu, String username, String password, String sodienthoai) {
        this.id_nhanvien = id_nhanvien;
        this.hoten = hoten;
        this.diachi = diachi;
        this.chucvu = chucvu;
        this.username = username;
        this.password = password;
        this.sodienthoai = sodienthoai;
    }

    public nhanvien() {
    }

    public int getId_nhanvien() {
        return id_nhanvien;
    }

    public void setId_nhanvien(int id_nhanvien) {
        this.id_nhanvien = id_nhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    
}
