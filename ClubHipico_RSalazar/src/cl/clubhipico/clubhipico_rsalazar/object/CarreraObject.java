package cl.clubhipico.clubhipico_rsalazar.object;

public class CarreraObject{
	//Globales
	private String nombre;
	private int distancia;
	private PistaObject pista;
	private CaballoObject caballo1;
	private CaballoObject caballo2;
	private CaballoObject caballo3;
	private TipoApuestaObject tipoApuesta;
	private ApostadorObject apostador;
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setDistancia(int distancia){
		this.distancia=distancia;
	}
	public int getDistancia(){
		return this.distancia;
	}
	public void setPista(PistaObject pista){
		this.pista=pista;
	}
	public PistaObject getPista(){
		return this.pista;
	}
	public void setCaballo1(CaballoObject caballo1){
		this.caballo1=caballo1;
	}
	public CaballoObject getCaballo1(){
		return this.caballo1;
	}
	public void setCaballo2(CaballoObject caballo2){
		this.caballo2=caballo2;
	}
	public CaballoObject getCaballo2(){
		return this.caballo2;
	}
	public void setCaballo3(CaballoObject caballo3){
		this.caballo3=caballo3;
	}
	public CaballoObject getCaballo3(){
		return this.caballo3;
	}
	public void setTipoApuesta(TipoApuestaObject tipoApuesta){
		this.tipoApuesta=tipoApuesta;
	}
	public TipoApuestaObject getTipoApuesta(){
		return this.tipoApuesta;
	}
	public void setApostador(ApostadorObject apostador){
		this.apostador=apostador;
	}
	public ApostadorObject getApostador(){
		return this.apostador;
	}
}