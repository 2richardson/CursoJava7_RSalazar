package cl.clubhipico.clubhipico_rsalazar.controller;

import java.util.List;

import cl.clubhipico.clubhipico_rsalazar.object.CarreraObject;
import cl.clubhipico.clubhipico_rsalazar.util.DataBaseUtil;


public class CarreraController implements BaseController<CarreraObject>{

	private DataBaseUtil<CarreraObject> database = new DataBaseUtil<CarreraObject>();
	
	@Override
	public boolean insert(CarreraObject object) {
		// TODO Auto-generated method stub
		return database.insert(object);
	}

	@Override
	public boolean update(CarreraObject object) {
		// TODO Auto-generated method stub
		return database.update(object);
	}

	@Override
	public boolean delete(CarreraObject object) {
		// TODO Auto-generated method stub
		return database.delete(object);
	}

	@Override
	public CarreraObject select(CarreraObject object) {
		// TODO Auto-generated method stub
		return database.select(object);
	}

	@Override
	public List<CarreraObject> list(CarreraObject object) {
		// TODO Auto-generated method stub
		return database.list(object);
	}

	@Override
	public List<CarreraObject> list() {
		// TODO Auto-generated method stub
		return database.list();
	}

}
