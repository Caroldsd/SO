import java.util.Random;
import java.util.Scanner;

public class Fcfs {
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    int vetorFcfs [];
    int numeroProcessos;
    int tempoExecucao [];
    int tempoEspera [];

    public void definirProcessosETempo(int numeroProcessos){
        tempoExecucao = new int [numeroProcessos];
        tempoEspera = new int [numeroProcessos];
        for (int i = 0; i < numeroProcessos; i++){
                System.out.println("Digite o tempo de execucao do processo:");
                tempoExecucao [i] = teclado.nextInt();
            } else {
                tempoExecucao [i] = random.nextInt(10) + 1;
            }
        }
        imprimirVetor();
    }
    /*
    SJF PREMPTIVO - TEMPO RESTANTE
    PROCESSO MAIS CURTO PRIMEIRO

    SJF NAO PREMPTIVO - MAIS CURTO PRIMEIRO E EXECUTA O PROCESSO ATE O FIM

    IF NA LISTA DE PROCESSOS

    VARIAVEL DE CONTROLE DE MENOR TEMPO DE EXECUCAO / TEMPO RESTANTE
     */
    public void definirProcessosETempo(int numeroProcessos){
        tempoExecucao = new int [numeroProcessos];
        tempoEspera = new int [numeroProcessos];
        for (int i = 0; i < numeroProcessos; i++){
            if (){
                System.out.println("Digite o tempo de execucao do processo:");
                tempoExecucao [i] = teclado.nextInt();
            } else {
                tempoExecucao [i] = random.nextInt(10) + 1;
            }
        }
        imprimirVetor();
    }

    public void imprimirVetor(){
        for (int i = 0; i < numeroProcessos; i++){
            System.out.println(tempoExecucao[i]);
        }
    }

   /* public void manualAutomatico(){
        System.out.println("\n1- Manual" +
                "\n2- Automatico");
        int opcao = teclado.nextInt();
        if (opcao ==1){
            for (int i = 0; i < tempoProcessos; i++){
                vetorFcfs [i] = teclado.nextInt();
            }
        }
        if (opcao == 2){

        }
    }

    */
}
