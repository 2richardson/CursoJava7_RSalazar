package cl.clubhipico.clubhipico_rsalazar.controller;

import java.sql.SQLException;
import java.util.List;
import cl.clubhipico.clubhipico_rsalazar.object.CarreraObject;
import cl.clubhipico.clubhipico_rsalazar.util.DataBaseUtil;

public class CarreraController{

	private DataBaseUtil<CarreraObject> database;
	
	public CarreraController() throws ClassNotFoundException, SQLException {
		database = new DataBaseUtil<CarreraObject>();
	}
	
	

	

}
