package TallarLab03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	public MetodosP _unnamed_MetodosP_;

	public void iniciador() {
		CrearDirectorio();
	}
	public void CrearDirectorio() {
		String ruta = ".\\Camiones";
		Path archivo = Paths.get(ruta);
		String contenido = "";
		try {
			contenido = new String(Files.readAllBytes(archivo));
		} catch (IOException e) {
			System.out.println("El archivo no pudo ser leido");
		}
		System.out.println(contenido);
	}
	public String obtenerTexto(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa un texto para almecenar en el archivo");
		String texto = teclado.next() + teclado.nextLine();
		return texto;

	}
	public void nuevaLinea(String ruta, String contenido) {
		String oldContenido = leerArchivo(ruta);
		crearArchivo(ruta, oldContenido + "\n" + contenido);
	}
	public String leerArchivo(String ruta) {
		Path archivo = Paths.get(ruta);
		String contenido = "";
		try {
			contenido = new String(Files.readAllBytes(archivo));
		} catch (IOException e) {
			System.out.println("El archivo no pudo ser leido");
		}
		return contenido;
	}
	public void crearArchivo(String ruta, String contenido) {
		Path archivo = Paths.get(ruta);
		try {
			Files.write(archivo, contenido.getBytes());
			System.out.println("El archivo fue creado exitosamente");
		} catch (IOException e) {
			System.out.println("El archivo no pudo ser creado");
		}
	}
}