package cl.clubhipico.clubhipico_rsalazar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import cl.clubhipico.clubhipico_rsalazar.util.DataBaseUtil;
import cl.clubhipico.clubhipico_rsalazar.util.DocumentoCSV;

public class PruebaItwall {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String pathC = "C:\\test\\caballos.csv";
		String pathJ = "C:\\test\\jinetes.csv";
		String[] columnasC = {"RUT", "DV", "NOMBRE", "SEXO", "PESO"};
		String[] columnasJ = {"RUT", "DV", "NOMBRE", "SEXO", "PESO", "CABALLO"};
		List<HashMap<String, Object>> caballoList;
		List<HashMap<String, Object>> jineteList;
		try {
			caballoList = DocumentoCSV.readFile(pathC, columnasC,true);
			jineteList = DocumentoCSV.readFile(pathJ, columnasJ,true);

			String insert;
			DataBaseUtil db = new DataBaseUtil();
			for (HashMap<String,Object> caballo:caballoList) {
				insert = "INSERT INTO caballo (RUT,DV,NOMBRE,SEXO,PESO) VALUES ("
						+ "'"+caballo.get("RUT")+"',"
						+ "'"+caballo.get("DV")+"',"
		        		+ "'"+caballo.get("NOMBRE")+"',"
		        		+ "'"+caballo.get("SEXO")+"',"
		        		+ "'"+caballo.get("PESO")+"');";
				db.executarQuery(insert);
			}
	        
			insert="";
			
			for (HashMap<String,Object> jinete:jineteList) {
				insert = "INSERT INTO jinete (RUT,DV,NOMBRE,SEXO,PESO,CABALLO) VALUES ("
						+ "'"+jinete.get("RUT")+"',"
						+ "'"+jinete.get("DV")+"',"
		        		+ "'"+jinete.get("NOMBRE")+"',"
		        		+ "'"+jinete.get("SEXO")+"',"
		        		+ "'"+jinete.get("PESO")+"',"
		        		+ "'"+jinete.get("CABALLO")+"');";
		        db.executarQuery(insert);
			}
			
			String query = "SELECT j.nombre NOMBRE_JINETE, j.RUT RUT_JINETE, c.nombre NOMBRE_CABALLO, c.rut RUT_CABALLO FROM `jinete` j, `caballo` c WHERE c.RUT = j.caballo;"; 
	        ResultSet resultset = db.select(query);
	        
	        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\test\\caballo_salida.csv"));
	        
	        while (resultset.next()) {
	        	bw.write(resultset.getString("RUT_JINETE")+";");
	        	bw.write(resultset.getString("NOMBRE_JINETE")+";");
	        	bw.write(resultset.getString("RUT_CABALLO")+";");
	        	bw.write(resultset.getString("NOMBRE_CABALLO")+";");
	        	bw.newLine();

	        }
	        
			bw.close();
	
	        System.out.println("Fin");
	        
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
