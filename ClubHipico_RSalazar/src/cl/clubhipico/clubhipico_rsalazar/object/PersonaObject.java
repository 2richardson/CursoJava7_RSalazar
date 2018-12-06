package cl.clubhipico.clubhipico_rsalazar.object;

public class PersonaObject extends AnimalObject{

	private String profesion;
	private String email;
	
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonaObject [profesion=" + profesion + ", email=" + email + "]";
	}
	
	
	
}
