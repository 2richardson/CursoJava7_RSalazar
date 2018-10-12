package cl.clubhipico.clubhipico_rsalazar.util;

import java.util.List;

import cl.clubhipico.clubhipico_rsalazar.controller.BaseController;

public class DataBaseUtil<T> implements BaseController<T>{

	@Override
	public boolean insert(T object) {
		// TODO Auto-generated method stub
		System.out.println("Insert ");
		return true;
	}

	@Override
	public boolean update(T object) {
		// TODO Auto-generated method stub
		System.out.println("update ");
		return true;
	}

	@Override
	public boolean delete(T object) {
		// TODO Auto-generated method stub
		System.out.println("delete ");
		return true;
	}

	@Override
	public T select(T object) {
		// TODO Auto-generated method stub
		System.out.println("select ");
		return null;
	}

	@Override
	public List<T> list(T object) {
		// TODO Auto-generated method stub
		System.out.println("list ");
		return null;
	}

	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		System.out.println("list ");
		return null;
	}
	
}
