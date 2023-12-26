package fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numUm = terminal.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numDois = terminal.nextInt();

        try{
            contar(numUm, numDois);
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMsg());
        }
    }

    static void contar(int um, int dois ) throws ParametrosInvalidosException {
        if (um > dois) {
            throw new ParametrosInvalidosException("ALERTA! O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = dois - um;
        for(int qtd = 0; qtd <= contagem; qtd++){
            System.out.println("Imprimindo o numero "+um++);
        }
    }
}
