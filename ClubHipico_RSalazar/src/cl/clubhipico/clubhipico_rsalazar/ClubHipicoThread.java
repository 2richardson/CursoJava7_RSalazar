package cl.clubhipico.clubhipico_rsalazar;

//public class ClubHipicoThread extends Thread{
public class ClubHipicoThread implements Runnable{ /*extends Thread NO RECOMENDADO POR ORACLE, Se Recomienta implements Runnable*/ 

	private String accion;
	private String nombre;
	
	public ClubHipicoThread(String nombre, String accion) {
		this.accion=accion;
		this.nombre=nombre;
		
	}
	
	public void log(String text) {
		System.out.println("["+this.nombre+"] "+text);
	}
	
	@Override
	public void run() {
		double random = Math.random();
		log("Hola Thread..."+random);
		
		try {
			long segundos = Math.round(2000*random);
			log("Segundos detenidos "+segundos+"...");
			log("Realizando accion "+accion);
			
			Thread.sleep(segundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log("Adios Thread..."+random);		
	}
}