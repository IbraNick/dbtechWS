package dbdemo;

import de.htwberlin.dbtech.utils.DbCred;
import de.htwberlin.dbtech.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Belegungsservice {
    static Connection connection;
 public static void main(String[] args) {
     JdbcUtils.loadDriver("oracle.jdbc.driver.OracleDriver");
     connection = null;
     try {
         connection = JdbcUtils.getConnectionViaDriverManager(
                 DbCred.url,
                 DbCred.user, DbCred.password);
     }  catch (Exception e) {
         e.printStackTrace();
     }



     JdbcUtils.closeConnection(connection);
 }

 /*
 public void fillUpDatabase() {
     try (PreparedStatement statement = connection.prepareStatement(
             ""
     )){

     }

 }
 */


}