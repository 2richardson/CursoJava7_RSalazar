package cl.clubhipico.clubhipico_rsalazar.controller;

import java.util.List;

public interface BaseController<T> {
	
	public boolean insert(T object);
	public boolean update(T object);
	public boolean delete(T object);
	public T select(T object);
	public List<T> list(T object);
	public List<T> list();
	/* Las llaves <> indican que el metodo lista 
	 * <T> se utiliza para definir acciones sobre la base de datos. Usa genericos (T, V, etc.)
	 * Permite reutilizar o restringir 
	 *  */
	
}
