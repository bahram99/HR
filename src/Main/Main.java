package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] arg) {
        DB_connection db = new DB_connection();
        db.open();

        Employee a = new Employee(db.getConnect());
        for (Products item : a.select()) {
            System.out.println("the id is ==> "+item.getId()+" names => "+item.getPro_name());
        }
    }
}
