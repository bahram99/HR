package Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    public Connection connection;

    public Employee(Connection con){
        this.connection = con;
    }

    public List<Products> select(){
        try {
            Statement state = connection.createStatement();
            ResultSet res = state.executeQuery("select Productid,ProductName from Products");
            List arr = new ArrayList();
            while (res.next()) {
                Products pro = new Products();
                pro.setId(res.getInt("Productid"));
                pro.setPro_name(res.getString("ProductName"));
                arr.add(pro);
            }
            return arr;
        } catch (SQLException e) {
            System.out.println("error "+e.getMessage());
            return null;
        }
    }
}
