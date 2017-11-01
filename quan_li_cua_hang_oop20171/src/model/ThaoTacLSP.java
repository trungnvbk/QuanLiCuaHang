package model;

import java.io.UnsupportedEncodingException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ThaoTacLSP {

    public ArrayList<LoaiSanPham> getAll() {
        ArrayList<LoaiSanPham> listLSP = new ArrayList<>();
        try {
            Statement stmt = new Connect().getConnect().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *FROM loai_san_pham");
            while (rs.next()) {
                LoaiSanPham loaiSanPham = new LoaiSanPham();
                loaiSanPham.setMa_LSP(rs.getString("Ma_LSP"));
                loaiSanPham.setTen_LSP(rs.getString("Ten_LSP"));
                listLSP.add(loaiSanPham);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listLSP;
    }

    public boolean addData(LoaiSanPham loaiSanPham) {
        ArrayList<LoaiSanPham> listLSP = getAll();
        int test = 0;
        for (LoaiSanPham lsp : listLSP) {
            if (loaiSanPham.getMa_LSP().equals(lsp.getMa_LSP())) {
                test = 1;
            }
        }
        if (test == 0) {
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
    
    public boolean updateLoaiSanPham(LoaiSanPham loaiSanPham){
        ArrayList<LoaiSanPham> listLSP = getAll();
        int test = 0;
        for (LoaiSanPham lsp : listLSP) {
            if (loaiSanPham.getTen_LSP().equals(lsp.getTen_LSP())) {
                test = 1;
            }
        }
        //test = 0 tuc la lsp nhap vao kho co trong csdl. luu y chi so sanh maLSP
        if(test == 0){
            String sql = "UPDATE loai_san_pham SET Ten_LSP = ? WHERE Ma_LSP = ?";
            try{
                PreparedStatement pstmt = new Connect().getConnect().prepareStatement(sql);
                pstmt.setString(1, loaiSanPham.getTen_LSP());
                pstmt.setString(2, loaiSanPham.getMa_LSP());
                pstmt.executeUpdate();
                return true;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ThaoTacLSP thaoTacLSP = new ThaoTacLSP();
        System.out.println("\'trung nguyen\'");
        System.out.println("Đĩa được củ hành sé");
    }
}
