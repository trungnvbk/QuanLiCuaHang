
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ThaoTacAdmin {
    public ArrayList<Admin> getAll() {
        ArrayList<Admin> listAdmin = new ArrayList<>();
        try {
            Statement stmt = new Connect().getConnect().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *FROM admin");
            while (rs.next()) {
                Admin admin = new Admin();
                admin.setUsersname(rs.getString("usersname"));
                admin.setPassword(rs.getString("password"));
                listAdmin.add(admin);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAdmin;
    }
}
