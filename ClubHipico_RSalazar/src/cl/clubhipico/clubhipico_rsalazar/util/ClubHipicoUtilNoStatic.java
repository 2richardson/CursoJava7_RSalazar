package cl.clubhipico.clubhipico_rsalazar.util;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.object.JineteObject;
import cl.clubhipico.clubhipico_rsalazar.object.PersonaObject;




public class ClubHipicoUtilNoStatic {
	public void montar(JineteObject jinete, CaballoObject caballo){
		jinete.setCaballo(caballo);
		System.out.println("Jinete "+jinete.getNombre()+ " se monta en caballo "+ caballo.getNombre());
	}
	//Sobrecarga
	public void montar(PersonaObject persona, CaballoObject caballo){
		System.out.println("Persona "+persona.getNombre()+ " NO se puede montar en caballo "+ caballo.getNombre());
	}
	//Sobrecarga
	public void montar(JineteObject[] jinetes, CaballoObject[] caballo){
		if (jinetes.length==caballo.length) {
			System.out.println("Recibidos "+jinetes.length+" jinetes, y "+caballo.length+" caballos." );
			if (jinetes.length==0) {
				System.out.println("Se requiere al menos un Jinete y un Caballo");
			}
			if (jinetes[0].getSexo()!=0) {
				System.out.println("El primer Jinete debe ser de sexo Masculino");
			}
		}else{
			System.out.println("Cantidad de jinetes V/S caballos no coincide.");
		}
	}
}