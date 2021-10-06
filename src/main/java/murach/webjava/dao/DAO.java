package murach.webjava.dao;

import murach.webjava.business.User;
import murach.webjava.data.UserDB;
//import org.jetbrains.annotations.NotNull;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class DAO {

    public List<User> insert() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> _user = new ArrayList<>();
        // String query = "insert into dbo._user values ("+user.getFirstName()+',' +user.getLastName()+','+user.getEmail()+")";4
        String query = "select *from dbo._user";
        try {

            conn = new UserDB().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                _user.add(new User(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {

        }
        return _user;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        User a = new User("123", "122", "faddd");
        List<User> l = dao.insert();
        System.out.println(l);
    }
}
