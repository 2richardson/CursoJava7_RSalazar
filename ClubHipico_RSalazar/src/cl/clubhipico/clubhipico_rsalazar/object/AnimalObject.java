package cl.clubhipico.clubhipico_rsalazar.object;

public class AnimalObject {
	private String nombre;
	private int peso;
	private String rut;
	private int sexo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "AnimalObject [nombre=" + nombre + ", peso=" + peso + ", rut="
				+ rut + ", sexo=" + sexo + "]";
	}
	
	
}
