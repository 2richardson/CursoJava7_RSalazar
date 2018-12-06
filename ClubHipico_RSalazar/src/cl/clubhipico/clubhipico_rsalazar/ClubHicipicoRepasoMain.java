package cl.clubhipico.clubhipico_rsalazar;

import java.util.HashMap;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.object.CarreraObject;
import cl.clubhipico.clubhipico_rsalazar.object.enums.SexoEnum;

public class ClubHicipicoRepasoMain {

	public static void main(String[] args) {
		
		//Creamos carrera object
		CarreraObject carrera = new CarreraObject();
		
		//Creamos caballo
		CaballoObject caballo1 = new CaballoObject();
		caballo1.setNombre("Caballo 1");
		caballo1.setSexo(SexoEnum.FEMININO);
		
		//CaballoObject caballo2 = CaballoObject.copy(caballo1);
		CaballoObject caballo2 = new CaballoObject();
		caballo2.setNombre("Caballo 2");
		
		//Informacion carrera
		carrera.setNombre("Carrera repaso");
		carrera.getCaballoList().add(caballo1);
		carrera.getCaballoList().add(caballo2);

		//ERRRO TIPICO. Se cambia el nombre a caballo1 y 2, ya que 2 apunta al objeto caballo1 a nivel de memoria
		System.out.println("Nombre caballo 1:"+caballo1.getNombre());
		System.out.println("Nombre caballo 2:"+caballo2.getNombre());
		
		//Recorriendo la lista de caballos
		for (CaballoObject c: carrera.getCaballoList())
			System.out.println("Nombre caballo 1:"+c.getNombre()); //recuperando el nombre del caballo c
		
		
		HashMap<String, CaballoObject> map = new HashMap<String,CaballoObject>();
		map.put("pista1", caballo1);
		map.put("pista2", caballo2);
		
		System.out.println("Nombre caballo 1:"+map.get("pista1").getNombre());
		System.out.println("Nombre caballo 2:"+map.get("pista2").getNombre());
		
		
		
	}
}
