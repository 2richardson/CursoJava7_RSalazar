package cl.clubhipico.clubhipico_rsalazar.object;

import java.util.ArrayList;
import java.util.List;

import cl.clubhipico.clubhipico_rsalazar.object.enums.PistaEnum;

public class CarreraObject {

	/*propiedades globales de la clase, visibles en toda la clase. 
	 * Para acceder se antepone this. */
	private String nombre;
	private int distancia;
	private PistaEnum pista;
	private List<CaballoObject> caballoList;
	private TipoApuestaObject tipoApuesta;
	private ApostadorObject apostador;
	
	public CarreraObject() {
		this.caballoList=new ArrayList<CaballoObject>();
	}
	
	//permite definir un valor string a nombre 
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	/*retorna el valor de la propiedad nombre*/
	public String getNombre() {
		return this.nombre; //no es extrictamente necesario el this si no existe una propiedad local nombre,  se recomienda
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public PistaEnum getPista() {
		return pista;
	}

	public void setPista(PistaEnum pista) {
		this.pista = pista;
	}


	public TipoApuestaObject getTipoApuesta() {
		return tipoApuesta;
	}

	public void setTipoApuesta(TipoApuestaObject tipoApuesta) {
		this.tipoApuesta = tipoApuesta;
	}

	public ApostadorObject getApostador() {
		return apostador;
	}

	public void setApostador(ApostadorObject apostador) {
		this.apostador = apostador;
	}

	public List<CaballoObject> getCaballoList() {
		return caballoList;
	}

	public void setCaballoList(List<CaballoObject> caballoList) {
		this.caballoList = caballoList;
	}

	@Override
	public String toString() {
		return "CarreraObject [nombre=" + nombre + ", distancia=" + distancia + ", pista=" + pista + ", caballoList="
				+ caballoList + ", tipoApuesta=" + tipoApuesta + ", apostador=" + apostador + "]";
	}

	
	
	
	
	
	
	
}
