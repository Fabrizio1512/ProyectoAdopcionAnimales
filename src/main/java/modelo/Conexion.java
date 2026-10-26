package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Usamos la ruta absoluta exacta para que apunte al mismo archivo con tus tablas
    private static final String URL = "jdbc:sqlite:" + System.getProperty("user.dir").replace("\\", "/") + "/adopciones.db";
    private Connection conexion = null;

    public Connection conectar() {
        try {
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexión exitosa a SQLite.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}