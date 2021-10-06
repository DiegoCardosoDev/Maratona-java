package curso.maratona.java.introducao;

public class Aula06EtruturasdeRepeticao04 {
    public static void main(String[] args) {

        double valoTotal = 30000;
        for (int parcela  = 1; parcela  <= valoTotal ; parcela ++) {
            double valorParcela  = valoTotal / parcela;
            if ( parcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }
    }
}

