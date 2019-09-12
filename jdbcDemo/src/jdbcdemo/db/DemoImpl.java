/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo.db;

import Usuario.JdbcConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author docente
 */
public class DemoImpl {
    
    public static void save(Demo demo) throws ClassNotFoundException, SQLException{
        Connection connect = JdbcConnect.connect();
        PreparedStatement pst = connect.prepareStatement("Insert into "
                + "demo values(?,?,?,?)");
        pst.setInt(1, demo.getId());
        pst.setString(2, demo.getName());
        pst.setString(3, demo.getLastName());
        pst.setTimestamp(4, new Timestamp(demo.getBirthDay().getTime()));
        pst.executeUpdate();
     
    }
     public static void delete(Demo demo) throws ClassNotFoundException, SQLException{
        Connection connect = JdbcConnect.connect();
        PreparedStatement pst = connect.prepareStatement("Delete from "
                + "demo where id=?");
        pst.setInt(1, demo.getId());
       
        pst.executeUpdate();
     
    }
     
      public static void update(Demo demo) throws ClassNotFoundException, SQLException{
        Connection connect = JdbcConnect.connect();
        PreparedStatement pst = connect.prepareStatement("update  "
                + "demo set name =?, lastname=?,birthday=? where id=?");
        pst.setInt(4, demo.getId());
        pst.setString(1, demo.getName());
        pst.setString(2, demo.getLastName());
        pst.setTimestamp(3, new Timestamp(demo.getBirthDay().getTime()));
        pst.executeUpdate();
     
    }
    
}
