package org.example;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://frdkwo65orb7.us-east-1.psdb.cloud/java_curso?sslMode=VERIFY_IDENTITY",
                    "drdsceloaufr",
                    "pscale_pw_Oxf6VWb9M5EqkKbHNGTX4ir2VDutQutYAlnKm4r4ozw");
            Statement stnt = conn.createStatement();
            ResultSet resultado = stnt.executeQuery("SELECT * FROM productos");

            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }
            resultado.close();
            stnt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
