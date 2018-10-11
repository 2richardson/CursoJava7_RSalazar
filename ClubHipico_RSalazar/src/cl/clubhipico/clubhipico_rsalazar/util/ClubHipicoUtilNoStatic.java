package cl.clubhipico.clubhipico_rsalazar.util;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.object.JineteObject;
import cl.clubhipico.clubhipico_rsalazar.object.PersonaObject;
import cl.clubhipico.clubhipico_rsalazar.object.enums.SexoEnum;



/*Clase utilitario con metodos static*/
public class ClubHipicoUtilNoStatic {

	private String tipoMontar = "Clasico";
	public static String tipoMJinete= "Jinete Clasico";

	public static  void montar(JineteObject jinete, CaballoObject caballo) {
		jinete.setCaballo(caballo);
		System.out.println("Jinete "+jinete.getNombre()+ " se monta en caballo "+ caballo.getNombre());
		
		tipoMJinete="DDCDSCDS"; //PERMITIDO, entre static se entienden. 
		//tipoMontar="";//NO PERMITIDO, ya que de un metodo estatico no puedo invocar directamente a una propiedad estatica, ya que el metodo estatico no pertenece a la instancia.
	}
	
	/*Existe una sobrecarga de metodo con respecto al montar Jinete*/
	public  void montar(PersonaObject persona, CaballoObject caballo) {
		System.out.println("Persona "+persona.getNombre()+ " NO se puede montar en caballo "+ caballo.getNombre());
		tipoMontar=""; //PERMITIDO, ya que llamo a una variable global dentro de la misma intancia.
		tipoMJinete="DDCDSCDS"; //Cambia a todas las clases el valor.

	}
	
	/*Existe una sobrecarga del metodo montar, recibiendo arreglos de jinetes y caballos*/
	public  void montar(JineteObject[] jinetes, CaballoObject[] caballos) {

		tipoMJinete="DDCDSCDS"; //Cambia a todas las clases el valor.

		//Validacion
		//Condicional if
		if (jinetes.length==caballos.length) {
			System.out.println("Se han recibido "+jinetes.length+ " jinetes y "+caballos.length+ " caballos");
		
			//Se evalua el arreglo, no un jinete.
			if (jinetes.length==0) {
				System.out.println("Por lo menos se requiere un jinete y un caballo...");
			}
			
			//Accedemos al primer jinete y evaluamos que no sea sexo Masculino, por regla de negocio
			if (jinetes[0].getSexo()!=SexoEnum.MASCULINO) {
				System.out.println("El primer jinete tiene que ser de sexo Masculino...");
			}
			
			
		}else {
			System.out.println("La cantidad de jinetes y caballos no coincide...");
		}
		
	}
	
}