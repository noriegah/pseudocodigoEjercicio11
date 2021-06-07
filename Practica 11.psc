Algoritmo a_b_c_d_e
	contadorseg=0
	contaPares=0
	contaImpares=0
	acuPares=0
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		num=Aleatorio(0,36)
		Escribir i ".Número Aleatorio " num
		Si num mod 2=0 y num<>0 Entonces
			contaPares=contaPares+1
			acuPares=acuPares+1
		SiNo
			Si num mod 2=1 y num<>0
				contaImpares=contaImpares+1
			FinSi
		FinSi
		si i=1 Entonces
			contaMayor=num
			contaMenor=num
		SiNo
			si num>contaMayor Entonces
				contaMayor=num
			FinSi
		FinSi
		Si num>12 y num<25 Entonces
			contadorseg=contadorseg+1
		FinSi
	Fin Para
	promedioPares=acuPares/contaPares
	Escribir "a) El número de números impares es: " contaImpares
	Escribir "b) El promedio de los números pares es: " promedioPares
	Escribir "c) Números que estan en la segunda docena: " contadorseg
	Escribir "d) El número mayor es: " contaMayor
FinAlgoritmo
