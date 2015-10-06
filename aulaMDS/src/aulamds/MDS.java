package aulamds;

import java.util.Scanner;

public class MDS {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cons;
        double val, tot;
        
        System.out.println("Entre com o consumo em quilowatts:");
        cons = leitor.nextInt();
        System.out.println("Entre com o valor do quilowatt:");
        val = leitor.nextDouble();
        
        tot = (val * cons) * 0.9;
        
        System.out.println("O valor total será R$"+ tot);
    }
}
