import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fcfs fcfs = new Fcfs();
        Scanner teclado = new Scanner(System.in);

        int opcao;
        int processos;

        System.out.print("Digite o numero de processos:");
        processos = teclado.nextInt();
        System.out.println("---- OPCOES ----" +
                "\n1- Atribuicao Automatica" +
                "\n2- Atribuicao Manual");
        opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                fcfs.definirProcessosETempo(opcao, processos);
        }
    }

}
