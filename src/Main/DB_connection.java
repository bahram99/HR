package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connection {
    public Connection connect;
    public String url ="jdbc:sqlserver://213.233.179.192\\java;database=HR;portNumber=1433";
    public String user = "java";
    public String pass = "Bfarmani9978";

    public Connection getConnect(){
        return connect;
    }

    public boolean open(){
        try {
            this.connect = DriverManager.getConnection(this.url,this.user,this.pass);
            return true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean close(){
        try {
            this.connect.close();
            return true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
