package Controller;

import View.FarmUpdateLSP;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.LoaiSanPham;
import model.ThaoTacLSP;

public class ctlLSP {
    public void loadDataToTable(JTable table){
        Vector v = new Vector();
        v.addElement("Mã loại sản phẩm");
        v.addElement("Tên loại sản phẩm");
        ArrayList<LoaiSanPham> listLSP = new ThaoTacLSP().getAll();
        DefaultTableModel defaultTableModel = new DefaultTableModel(v, 0);
        
        for(LoaiSanPham lsp: listLSP){
            Vector row = new Vector();
            row.addElement(lsp.getMa_LSP());
            row.addElement(lsp.getTen_LSP());
            defaultTableModel.addRow(row);
        }
        table.setModel(defaultTableModel);
    }
}
