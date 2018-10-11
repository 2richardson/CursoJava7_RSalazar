package cl.clubhipico.clubhipico_rsalazar.object;

import cl.clubhipico.clubhipico_rsalazar.object.enums.SexoEnum;

/*public final class AnimalObject {
 * Si colocamos el modificador final no podra ser heredada*/
public class AnimalObject {

	private String nombre;
	private double peso;
	private int rut;
	private char dv;
	private SexoEnum sexo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public char getDv() {
		return dv;
	}
	public void setDv(char dv) {
		this.dv = dv;
	}
	public SexoEnum getSexo() {
		return sexo;
	}
	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "AnimalObject [nombre=" + nombre + ", peso=" + peso + ", rut=" + rut + ", dv=" + dv + ", sexo=" + sexo
				+ "]";
	}
	
	
	
}
