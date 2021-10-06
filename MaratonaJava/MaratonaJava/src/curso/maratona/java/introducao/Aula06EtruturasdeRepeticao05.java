package curso.maratona.java.introducao;

public class Aula06EtruturasdeRepeticao05 {
    public static void main(String[] args) {

        double valoTotal = 30000;
        for (int parcela  = (int)  valoTotal; parcela  >= 1 ; parcela --) {
            double valorParcela  = valoTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);

        }
    }
}

