package curso.maratona.java.introducao;

public class Aula06EtruturasdeRepeticao01 {

    public static void main(String[] args) {
        //while, for, do while
        int count = 0;
        while (count< 10){ //retorna um boolean
            System.out.println(count);
            count++; // icremento 0 a 9

        }count = 0;
        do{//executa pleo menos uma vez
            System.out.println("dentro do while " + count++) ;

        }while (count < 10);

        for (int i = 0;i<10;i++){
            System.out.println("for " + i);

        }
    }
}
