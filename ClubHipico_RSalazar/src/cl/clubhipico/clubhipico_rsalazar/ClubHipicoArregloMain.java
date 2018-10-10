package cl.clubhipico.clubhipico_rsalazar;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.object.JineteObject;
import cl.clubhipico.clubhipico_rsalazar.object.PersonaObject;
//import cl.clubhipico.clubhipico_rsalazar.util.ClubHipicoUtil;
import cl.clubhipico.clubhipico_rsalazar.utilNoStatic;

public class ClubHipicoArregloMain {
	public static void main(String[] args){
		JineteObject jinete = new JineteObject();
		jinete.setNombre("Juan Perez");
		CaballoObject caballo = new CaballoObject();
		caballo.setNombre("La vieja confiable");
		PersonaObject persona = new PersonaObject();
		persona.setNombre("Andres");
		
		ClubHipicoUtil.montar(jinete,caballo);
		ClubHipicoUtil.montar(persona,caballo);
		
		ClubHipicoUtilNoStatic util = new ClubHipicoUtilNoStatic();
		util.montar(jinetesArray, caballosArray);
		//array
		JineteObject[] jinetesArray = new JineteObject[3];
		jinetesArray[0]= new JineteObject();
		jinetesArray[1]= new JineteObject();
		jinetesArray[2]= new JineteObject();
		
		jinetesArray[0].setNombre("Pepito");
		jinetesArray[1].setNombre("Juanito");
		jinetesArray[2].setNombre("Pedrito");
		
		//otro array
		CaballoObject[]caballoArray = {
				caballo,
				caballo,
				/*caballo*/};
		
		ClubHipicoUtil.montar(jinetesArray, caballoArray);
	}
}
