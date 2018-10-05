package cl.clubhipico.clubhipico_rsalazar;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.object.CarreraObject;
import cl.clubhipico.clubhipico_rsalazar.object.JineteObject;
import cl.clubhipico.clubhipico_rsalazar.object.PersonaObject;

public class ClubHipicoMain {
	public static void main (String[] args){
		CarreraObject carrera = new CarreraObject();
		System.out.println("Carrera Object: "+carrera);
		CaballoObject caballo = new CaballoObject();
		System.out.println("Caballo Object: "+caballo);
		CaballoObject caballo2 = new CaballoObject();
		caballo2.setNombre("La vieja confiable");
		caballo2.setPeso(500);
		caballo2.setRut("32168479851");
		caballo2.setSexo(1);
		System.out.println("Caballo Object: "+caballo2);
		
		JineteObject jinete = new JineteObject();
		jinete.setNombre("Juan Perez");
		jinete.setCaballo(caballo2);
		
		System.out.println("Jinete Object: "+jinete);
		
		//Polimorfismo
		PersonaObject persona = jinete;
		PersonaObject persona2 = new JineteObject();
		//JineteObject jinete8= new PersonaObject(); //error de jerarquia inversa (solo un sentido)
		
		
	}
	
}
