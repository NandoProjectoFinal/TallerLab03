package TallarLab03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	public MetodosP _unnamed_MetodosP_;

	public void iniciador() {
		throw new UnsupportedOperationException();
	}
	public void CrearDirectorio() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa nombre de la nueva carpeta");
		String ruta = teclado.next();
		Path directorio = Paths.get(ruta);
		if (Files.exists(directorio)) {
			System.out.println("El directorio ya existe");
		} else {
			try {
				Files.createDirectories(directorio);
				System.out.println("el directorio fue creado exitosamente");
			} catch (IOException e) {
				System.out.println("El directorio no pudo ser creado");

			}

		}
	}

	public static String obtenerRUTA(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la ruta");
		return teclado.next();
	}
	public static String obtenerTexto(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa un texto para almecenar en el archivo");
		String texto = teclado.next() + teclado.nextLine();
		return texto;

	}
}