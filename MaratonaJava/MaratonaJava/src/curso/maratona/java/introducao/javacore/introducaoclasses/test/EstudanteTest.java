package curso.maratona.java.introducao.javacore.introducaoclasses.test;

import curso.maratona.java.introducao.javacore.introducaoclasses.dominio.Conta;
import curso.maratona.java.introducao.javacore.introducaoclasses.dominio.ContaCorrente;

public class EstudanteTest {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.setCliente("roberto");
        contaCorrente.setNumConta(12);
        contaCorrente.setCpf("12345");

        contaCorrente.depositar(1000);//deposito
        contaCorrente.sacar(500);
        contaCorrente.sacar(300);

        System.out.println();



    }
}
