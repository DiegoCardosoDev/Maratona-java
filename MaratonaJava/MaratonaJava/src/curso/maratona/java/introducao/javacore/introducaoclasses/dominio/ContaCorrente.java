package curso.maratona.java.introducao.javacore.introducaoclasses.dominio;

public class ContaCorrente extends Conta{

    public float taxaSaque = 10;



    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor   - taxaSaque;
            System.out.println("Saque no  valor: " + "R$" + valor + " Reais" + " Efetuado com Sucesso");
        } else {
            System.out.println("Saque não efetuado, Saldo Disponível: " + "R$ " + saldo + " Reais" );
        }

    }

}
