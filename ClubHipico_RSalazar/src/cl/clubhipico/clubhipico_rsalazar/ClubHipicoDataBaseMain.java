package cl.clubhipico.clubhipico_rsalazar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cl.clubhipico.clubhipico_rsalazar.controller.CarreraController;
import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.object.CarreraObject;
import cl.clubhipico.clubhipico_rsalazar.util.DataBaseUtil;

public class ClubHipicoDataBaseMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException { //En realidad no es recomendable, por que no se esta controlando la excepcion
		
		/*PARA RECIBIR DESDE TECLADO*/
		/*Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
		CarreraController carreraController = new CarreraController(); //controlador con logica
		
		//Pedimos los parametros de entrada de la carrera
		System.out.println ("CLUB HIPICO");
		System.out.println ("===========");
        System.out.print ("Nombre carrera: " );

        String nombreCarrera = entradaEscaner.nextLine ();;

        //Instanciamos el objeto con los datos obtenidos desde el teclado
        CarreraObject carrera = new CarreraObject();
        carrera.setNombre(nombreCarrera);

        //Usamos el controlador
        //accion de insertar
        */
		
		CaballoObject caballo = new CaballoObject();
		caballo.setRut(1);
		caballo.setDv('9');
		caballo.setNombre("Juanito");
		caballo.setPeso(400);
		
		
		/*Insert*/
        String insert = "INSERT INTO CABALLO (RUT,DV,NOMBRE,PESO) "
        		+ "VALUES ("+caballo.getRut()+Math.round((Math.random()*1000000))+","
        		+ "'"+caballo.getDv()+"',"
        		+ "'"+caballo.getNombre()+"',"
        		+ caballo.getPeso()+")";
        
        DataBaseUtil db = new DataBaseUtil();
        db.executarQuery(insert);
               
        
        /*Select*/
        String query = "SELECT * FROM CABALLO"; //No recomendado con *, escribir columnas. 
        ResultSet resultset = db.select(query);
        
        while (resultset.next()) {
        	System.out.println("RUT: "+resultset.getString("RUT")+"    Nombre caballo:"+resultset.getString("NOMBRE"));
        }
        System.out.println("Fin");
        
        
		
	}

}
