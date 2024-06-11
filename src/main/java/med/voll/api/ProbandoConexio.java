package med.voll.api;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProbandoConexio {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=BASEBRIRESTCSHARP";
        String username = "buman";
        String password = "softwarereal";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (connection != null) {
                System.out.println("Conexión exitosa!");
            } else {
                System.out.println("Fallo la conexión.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

