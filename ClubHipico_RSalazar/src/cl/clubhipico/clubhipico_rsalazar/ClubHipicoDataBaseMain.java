package cl.clubhipico.clubhipico_rsalazar;

import java.util.Scanner;

import cl.clubhipico.clubhipico_rsalazar.controller.CarreraController;
import cl.clubhipico.clubhipico_rsalazar.object.CarreraObject;
import cl.clubhipico.clubhipico_rsalazar.object.enums.PistaEnum;
import cl.clubhipico.clubhipico_rsalazar.object.enums.SexoEnum;

public class ClubHipicoDataBaseMain {
	
	private static Scanner entradaEscaner;
	public static void main(String[] args){
		
		entradaEscaner = new Scanner (System.in);
		CarreraController carreraController = new CarreraController(); //controlador con logica
		
		/*Pedimos los parametros de entrada de la carrera*/
		System.out.println ("CLUB HIPICO");
		System.out.println ("===========");
        System.out.print ("Nombre carrera: " );
        String nombreCarrera = entradaEscaner.nextLine ();
        System.out.print ("Distancia carrera: " );
        Integer distanciaCarrera = entradaEscaner.nextInt();
        System.out.println("1.- Pasto");
        System.out.println("2.- Arena");
        System.out.print ("Pista carrera: " );
        int pista = entradaEscaner.nextInt ();
        PistaEnum pistaCarrera;
        if (pista==1) {
        	pistaCarrera = PistaEnum.PASTO;
		}else{
			pistaCarrera = PistaEnum.ARENA;
		}
        /*Instanciamos el objeto con los datos obtenidos desde el teclado*/
        CarreraObject carrera = new CarreraObject();
        carrera.setNombre(nombreCarrera);
		carrera.setDistancia(distanciaCarrera);
		carrera.setPista(pistaCarrera);
        
        
        /*Usamos el controlador*/
        //accion de insertar
        carreraController.insert(carrera);
           
        
        System.out.println("Carrera recibida "+carrera);
 
	}

}
