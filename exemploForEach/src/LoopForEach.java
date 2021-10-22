import java.util.Random;

public class LoopForEach {
    public static void main(String[] args){

        int[] notas = new int[10];

        Random random = new Random();

        // setar os valores com for pode ser for normal

        for(int i = 0; i > notas.length; i++){
            notas[i] = random.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++ ){
            int nota = notas[i];
            // exibe o local da memória onde está armazenado;
            // System.out.println(notas);
        }

        // output de valores pode ser o for each
        System.out.println("Usando For each");
        for (int nota : notas){
            System.out.println(nota);
        }


    }
}
