package aulamds;

import java.util.Scanner;

public class MDS {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        
        System.out.println("Entre com seu número preferido:");
        
        numero = leitor.nextInt();
        
        if (numero% 2 == 0){
            System.out.println(numero +"é par");
        }else{
            System.out.println(numero +"é impar");
        }
    }
}
