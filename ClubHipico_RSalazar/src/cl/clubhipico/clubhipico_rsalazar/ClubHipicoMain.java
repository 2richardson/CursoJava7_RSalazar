package cl.clubhipico.clubhipico_rsalazar;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;
import cl.clubhipico.clubhipico_rsalazar.object.CarreraObject;
import cl.clubhipico.clubhipico_rsalazar.object.JineteObject;
import cl.clubhipico.clubhipico_rsalazar.object.PersonaObject;
import cl.clubhipico.clubhipico_rsalazar.object.enums.SexoEnum;

public class ClubHipicoMain {

	public  void compararCaballo(CaballoObject caballo1, CaballoObject caballo2) {
	
		
	}
	
	/*metodo main, desde donde se inicia el programa*/
	public static void main(String[] args) {
		
		ClubHipicoMain chmain = new ClubHipicoMain();
		chmain.compararCaballo(new CaballoObject(), new CaballoObject());
		
		/*Declarando y inicializando Carrera Object*/
		CarreraObject carrera = new CarreraObject();
		
		/*Imprimiendo por pantalla el objecto carrera Object
		imprime mensaje con informacion de memoria
		Carrera Object:cl.clubhipico.clubhipico_francisco.object.CarreraObject@33909752*/
		System.out.println("Carrera Object:"+carrera);
		
		CaballoObject caballo = new CaballoObject();
		/*Mensaje retorno: Caballo Object:CaballoObject [nombre=null, rut=null, peso=0.0, sexo=null]
		 * Se implemento el metodo toString en CaballoObject, pero no se asignado valores, por ende retorna 
		 * valores por defecto. Si es un object / String, el valor por defecto es null
		 * Si es una variable primitiva numerica es 0
		 */
		System.out.println("Caballo Object:"+caballo);
		
		CaballoObject caballo2 = new CaballoObject();
		caballo2.setNombre("Caballo Juanito Perez");
		caballo2.setPeso(1000);
		caballo2.setRut(12345679);
		caballo2.setSexo(SexoEnum.MASCULINO);
		
		/*Caballo2 Object:AnimalObject [nombre=Caballo Juanito Perez, peso=1000.0, rut=12345679, dv=, sexo=MASCULINO]*/
		System.out.println("Caballo2 Object:" + caballo2);
		
		JineteObject jinete = new JineteObject();
		jinete.setNombre("Pedrito");
		jinete.setCaballo(caballo2);
		System.out.println("Jinete Object:" + jinete);
		
		
		PersonaObject persona = jinete;
		PersonaObject persona2 = new JineteObject();
		/*JineteObject jinete8 = new PersonaObject();*/ //Error por jerarquia herencia. 
		
		
		
		
		

		
		
	}
}
