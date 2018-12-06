package cl.clubhipico.clubhipico_rsalazar.controller;

import java.util.List;

/*Interface que se utilizara para definir las acciones sobre la base 
 * de datos.
 * Usa GENERICOS (T) para poder reutilizarla y restringirla en su uso a un 
 * tipo de terminado.
 */
public interface BaseController<T> {
	
	public boolean insert(T object);
	public boolean update(T object);
	public boolean delete(T object);
	public T select(T object);
	public List<T> list(T object);
	public List<T> list();

}
