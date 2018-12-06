package cl.clubhipico.clubhipico_rsalazar;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.util.DocumentoCSV;


public class ClubhipicoFileMain {
	
	public static void main(String[] args) {
		
		String path = "C:\\test\\caballos.csv";
		String[] columnas = {"RUT", "DV", "NOMBRE", "SEXO", "PESO"};
		
		List<HashMap<String, Object>> caballoList;
		
		try {
			
			caballoList = DocumentoCSV.readFile(path, columnas,true);
			
			
			System.out.println("Contenido archivo");
			//System.out.println(caballoList);
			System.out.println(caballoList);
			//DocumentoCSV.writteFile("/tmp/caballosalida.txt", caballoList, true);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\test\\caballo_salida.csv"));
		
			for (HashMap<String,Object> caballo:caballoList) {
				bw.write(caballo.get("RUT").toString()+";");
				bw.write(caballo.get("NOMBRE").toString()+";");
				bw.write(caballo.get("PESO").toString()+";");
				bw.newLine();
			}
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}