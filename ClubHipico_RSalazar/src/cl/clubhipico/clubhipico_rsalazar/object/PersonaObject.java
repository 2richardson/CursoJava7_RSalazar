package cl.clubhipico.clubhipico_rsalazar.object;

public class PersonaObject extends AnimalObject{
	private String profesion;
	private String mail;
	
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "PersonaObject [profesion=" + profesion + ", mail=" + mail + "]";
	}
	
}
