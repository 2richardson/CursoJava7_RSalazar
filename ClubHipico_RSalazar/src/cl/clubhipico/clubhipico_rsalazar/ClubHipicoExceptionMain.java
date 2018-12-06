package cl.clubhipico.clubhipico_rsalazar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cl.clubhipico.clubhipico_rsalazar.object.CaballoObject;

public class ClubHipicoExceptionMain {

	
	public static void crearArchivo(String path) {
		File file = new File(path); //C://tmp//clubhipico.csv
		//File file = new File("/tmp/clubhipico.csv"); //C://tmp//clubhipico.csv
		try {
			System.out.println("Creando el archivo ....");
			FileOutputStream fout = new FileOutputStream(file);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error "+e.getMessage());
		}
	}
	
	public static boolean validaNumeroEntero(String numeroStr) {
		try {
			Integer.parseInt(numeroStr);
		
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean validaNumeroEntero2(String numeroStr) throws Exception{
		try {
			Integer.parseInt(numeroStr);
		
			return true;
		}catch (NumberFormatException e) {
			throw new Exception("El numero "+ numeroStr + " no es entero");
		}
	}
	public static void main(String[] args)  {
		
		CaballoObject caballo = new CaballoObject();
		caballo.setNombre("Junanito");
		
		//Se obtienen las properties de la JVM, como sistema operativo, etc
		//System.out.println("Properties :"+System.getProperties());
		
		File file = new File("/tmp/clubhipico.txt"); //C://tmp//clubhipico.csv
		//File file = new File("/tmp/clubhipico.csv"); //C://tmp//clubhipico.csv
		try {
			System.out.println("Abriendo el archivo....");
			FileOutputStream fout = new FileOutputStream(file);
			
			fout.write(caballo.getNombre().getBytes());
			System.out.println("Cerrando el archivo....");
		} catch (FileNotFoundException e) {
			System.out.println("Error "+e.getMessage());
		} catch (IOException e) {
			System.out.println("Error "+e.getMessage());

		}
		
		File fileLectura = new File("/tmp/clubhipico2.txt"); //C://tmp//clubhipico.csv

		try {
			System.out.println("Abriendo el archivo....");
			FileInputStream fin = new FileInputStream(fileLectura);
			
			System.out.println("Cerrando el archivo....");
		} catch (FileNotFoundException e) {
			System.out.println("Error "+e.getMessage());
			crearArchivo(fileLectura.getAbsolutePath());
		}
		
		try {
			String numeroStr = "1234A";
			Integer numero = Integer.parseInt(numeroStr);
		//Que sucede?
			System.out.println("NumeroStr "+numeroStr + " Numero "+numero);
		
		}catch (NumberFormatException e) {
			System.out.println("El string ingresado no es un numero...");
		}
		
		System.out.println("Validacion numero entero:"+validaNumeroEntero("12334A"));
		System.out.println("Validacion numero entero:"+validaNumeroEntero("123345"));
		try {
			System.out.println("Validacion numero entero:"+validaNumeroEntero2("123345A"));
		} catch (Exception e) {
			System.out.println("ERROR validacion 2:+"+e.getMessage());
		}
		
	}
}
