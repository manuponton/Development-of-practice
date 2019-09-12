/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import java.sql.SQLException;
import java.util.Date;
import jdbcdemo.db.Demo;
import jdbcdemo.db.DemoImpl;

/**
 *
 * @author docente
 */
public class JdbcDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Demo demo=new Demo();
       demo.setId(1);
       demo.setName("Jocelyn");
       demo.setLastName("Martinez");
       demo.setBirthDay(new Date());
        DemoImpl.update(demo);
    }
    
}
