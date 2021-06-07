Algoritmo Ejercicio13
	Definir opc Como Entero
	Definir num1, num2 Como Entero
	Definir resultado como Real
	Repetir

		
		Escribir "Menu"
		Escribir "Eliga la opcion"
		Escribir "1. Sumar"
		Escribir "2. Dividir "
		Escribir "3. Salir"
		leer opc
		Si opc > 0 Y opc < 3 Entonces
			Escribir "Ingrese el primer numero"
			leer num1
			Escribir "Ingrese el segundo numero"
			leer num2
			Si opc = 1 Entonces
				resultado <- num1+num2
				Escribir "El resutlado es de: " resultado
			Fin Si
			Si opc = 2 Entonces
				Si num2 = 0 Entonces
					Escribir "Nose puede dividir dentro de cero"
				SiNo
					resultado <- num1/num2
					Escribir "El resutlado es de: " resultado
				Fin Si
			FinSi
		Fin Si
	Hasta Que opc = 3
	
	
FinAlgoritmo
