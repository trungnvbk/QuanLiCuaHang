/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ThaoTacLSP {
    
    //Statement stmt =  (Statement) new Connect().getConnect();
   
    // Lay thong tin
    public ArrayList<LoaiSanPham> getAll(){
        ArrayList<LoaiSanPham> listLSP = new ArrayList<>();
        
        try{
            Statement stmt = new Connect().getConnect().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *FROM loai_san_pham");
            while(rs.next()){
                LoaiSanPham loaiSanPham = new LoaiSanPham();
                loaiSanPham.setMa_LSP(rs.getString("Ma_LSP"));
                loaiSanPham.setTen_LSP(rs.getString("Ten_LSP"));
                listLSP.add(loaiSanPham);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return listLSP;
    }
    
    public boolean addData(LoaiSanPham loaiSanPham){
        ArrayList<LoaiSanPham> listLSP = getAll();
        int test = 0;
        for(LoaiSanPham lsp: listLSP){
            if(loaiSanPham.getMa_LSP().equals(lsp.getMa_LSP())){
                test = 1;
            }
        }
        if(test == 0){
            String sql = "INSERT INTO `loai_san_pham`(`Ma_LSP`, `Ten_LSP`) VALUES (?,?)";
            try {
                PreparedStatement stmt = new Connect().getConnect().prepareStatement(sql);
                stmt.setString(1, loaiSanPham.getMa_LSP());
                stmt.setString(2, loaiSanPham.getTen_LSP());
                stmt.executeUpdate();
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }   
        }
        return false;
        
        
    }
    public static void main(String[] args) {
        ThaoTacLSP thaoTacLSP = new ThaoTacLSP();
        LoaiSanPham lsp = new LoaiSanPham("LSP03", "Sách");
        thaoTacLSP.addData(lsp);
    }
}
