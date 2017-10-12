/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class LoaiSanPham {
    private String ma_LSP;
    private String ten_LSP;

    public String getMa_LSP() {
        return ma_LSP;
    }

    public void setMa_LSP(String ma_LSP) {
        this.ma_LSP = ma_LSP;
    }

    public String getTen_LSP() {
        return ten_LSP;
    }

    public void setTen_LSP(String ten_LSP) {
        this.ten_LSP = ten_LSP;
    }

    public LoaiSanPham() {
    }

    public LoaiSanPham(String ma_LSP, String ten_LSP) {
        this.ma_LSP = ma_LSP;
        this.ten_LSP = ten_LSP;
    }
    
    
}
