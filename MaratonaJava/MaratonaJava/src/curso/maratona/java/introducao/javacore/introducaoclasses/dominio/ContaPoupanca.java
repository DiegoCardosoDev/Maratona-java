package curso.maratona.java.introducao.javacore.introducaoclasses.dominio;

public class ContaPoupanca extends Conta{


    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque no  valor: " + "R$" + valor + " Reais" + " Efetuado com Sucesso");
        } else {
            System.out.println("Saque não efetuado, Saldo Disponível: " + "R$ " + saldo + " Reais" );
        }

    }

}
