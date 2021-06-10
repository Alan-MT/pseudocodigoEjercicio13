import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int opc = 0;
		double resultado = 0;
		do {
			System.out.println("Menu");
			System.out.println("Eliga la opcion");
			System.out.println("1. Sumar");
			System.out.println("2. Dividir ");
			System.out.println("3. Salir");
			opc = sca.nextInt();
			if (opc>0 && opc<3) {
				System.out.println("Ingrese el primer numero");
				num1 = sca.nextInt();
				System.out.println("Ingrese el segundo numero");
				num2 = sca.nextInt();
				if (opc==1) {
					resultado = num1+num2;
					System.out.println("El resutlado es de: "+resultado);
				}
				if (opc==2) {
					if (num2==0) {
						System.out.println("Nose puede dividir dentro de cero");
					} else {
						resultado = num1/num2;
						System.out.println("El resutlado es de: "+resultado);
					}
				}
			}
		} while (opc!=3);
	}


}

