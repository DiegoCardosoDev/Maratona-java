package curso.maratona.java.introducao;

public class Aula06EtruturasdeRepeticao03 {
    public static void main(String[] args) {

        int valoMax = 50;

        for (int i = 0; i < valoMax; i++) {
            if ( i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
