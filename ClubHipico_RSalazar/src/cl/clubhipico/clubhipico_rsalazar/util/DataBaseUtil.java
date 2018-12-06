package cl.clubhipico.clubhipico_rsalazar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBaseUtil<T> {

	private String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private String DB_URL = "jdbc:mariadb://localhost:3306/CursoJava7";
    private Connection conn = null;
    private Statement stmt = null;
    
    public DataBaseUtil() throws ClassNotFoundException, SQLException {
    	    //STEP 2: Register JDBC driver
            Class.forName(this.JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Conectando a la batos...");
            conn = DriverManager.getConnection(this.DB_URL, "root", "");
            System.out.println("Coneccion exitosa...");

            //STEP 4: Execute a query
            stmt = conn.createStatement();
        
    }
    
	
	public void executarQuery(String sql) throws SQLException {
		stmt.executeUpdate(sql);
	}
	
	public ResultSet select(String query) throws SQLException {
		return stmt.executeQuery(query);
	}
	public void close() throws SQLException {
		conn.close();
	}
	 
	

}
