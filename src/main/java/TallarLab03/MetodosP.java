package TallarLab03;

import java.util.Scanner;

public class MetodosP {
	public Empresa _unnamed_Empresa_;
	public Main _unnamed_Main_;

	public void agregarProductos() {

	}

	public void quitarProductos() {
		throw new UnsupportedOperationException();
	}

	public void agregarCamion() {
		_unnamed_Main_.nuevaLinea(".\\productos",_unnamed_Main_.obtenerTexto());
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

	public static void iniciador(){
		selecionOpciones(4);

	}

	public static void menu() {
		System.out.println(".........{Ingresa Una Opccion }........");
		System.out.println("[1] opcion 1");
		System.out.println("[2] opcion 2");
		System.out.println("[3] opcion 3");
		System.out.println("[4] opcion 4");

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

}