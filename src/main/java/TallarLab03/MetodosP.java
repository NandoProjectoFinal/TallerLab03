package TallarLab03;

import java.util.Scanner;

import static TallarLab03.GestordeArchivos.leerArchivo;
import static TallarLab03.GestordeArchivos.nuevaLinea;

public class MetodosP {
    public Empresa _unnamed_Empresa_;
    public Main _unnamed_Main_;

	public static void iniciador(){
		seleccion();
	}

	public static void menu() {
		System.out.println(".........{Ingresa Una Opccion }........");
		System.out.println("[1] Agregar Productos");
		System.out.println("[2] Eliminar Productos");
		System.out.println("[3] Agregar Camión");
		System.out.println("[4] Eliminar Camión");
		System.out.println("[5] Cambiar estado de Camión");
		System.out.println("[4] Calcular Valor de Embarque");

	}
	public static int selecionOpciones(int cantOP) {
		int opcion = 0;
		do {
			try {
				menu();
				opcion = validarRangodeNumero(pedirDatoNumerico());
				if (opcion <= 0 || opcion >= cantOP + 1) {
					System.out.println("No existe esa opcion");
					System.out.println("Selecione una correcta");
				}

			} catch (java.util.InputMismatchException e) {
				System.out.println("No es una exprecion numerica");
				System.out.println("Por favor intentelo denuevo");


			}

		} while (opcion <= 0 || opcion >= cantOP + 1);

		return opcion;
	}
		public static void seleccion(){
			switch (selecionOpciones(6)){
				case 1: agregarProductos();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;

			}

		}
	public static int validarRangodeNumero(int numero1) {
		if (numero1 < 0) {
			System.out.println("No se admiten numeros negativos");
		} else if (numero1 > 100) {  // recordar definir un limite
			System.out.println("No se admiten numeros mayores a 100");
			numero1 = -1;

		}
		return numero1;
	}
	public static int pedirDatoNumerico() {
		Scanner teclado = new Scanner(System.in);
		System.out.println(".......[INGRESE UNA ENTRADA VALIDA]......");
		return  teclado.nextInt();
	}
	public static void menuSalida() {
        System.out.println(".........{Desea Repetir proceso}........");
        System.out.println("Desea salir");
        System.out.println("[1] Si");
        System.out.println("[3] no");


    }

    public static void agregarProductos() {
		nuevaLinea(".\\Productos",ingresoDatos());
		System.out.println("La lista queda Asi: ");
		System.out.println(leerArchivo(".\\Productos"));
    }

	public static String ingresarRespuesta(){
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}

	public static String ingresoDatos() {
		System.out.println("Que Tipo de producto desea Agregar");
		String contenido = ingresarRespuesta();
		System.out.println("Ingrese el codigo del Producto");
		contenido = contenido + " "+ ingresarRespuesta();
		return contenido;
	}


	public void quitarProductos() {
        throw new UnsupportedOperationException();
    }

    public void agregarCamion() {
        throw new UnsupportedOperationException();
    }

    public void desvincularCamion() {
        throw new UnsupportedOperationException();
    }

    public boolean cambiarEstadoCamion() {
        throw new UnsupportedOperationException();
    }

    public int calcularValorEmbarque() {
        throw new UnsupportedOperationException();
    }
}