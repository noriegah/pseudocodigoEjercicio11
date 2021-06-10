import java.util.*;

public class Practica11 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int contadorseg=0;
    int contaPares=0;
    int contaImpares=0;
    int acuPares=0;
    int num;
    int contaMayor=0;
    int contaMenor=0;
    for (int i=1; i<=10;i++){
        num=((int)(Math.random()*37));
        System.out.println(i+" Numero Aleatorio "+num);
        if (num%2==0 & num!=0) {
            contaPares+=1;
            acuPares+=1;
        }else{
            if(num%2==1 & num!=0){
                contaImpares+=1;
            }
        }
        if(i==1){
            contaMayor=num;
            contaMenor=num;
        }else if (num>contaMayor){
            contaMayor=num;
        }
        if(num>12 & num<25){
            contadorseg+=1;
        }
    }
    double promedioPares=acuPares/contaPares;
    System.out.println("a) El número de números impares es: "+contaImpares);
    System.out.println("b) El promedio de los número pares es: "+promedioPares);
    System.out.println("c) Números que estan en la segunda docena "+contadorseg);
    System.out.println("d) El número mayor es: "+contaMayor);
}
}