package curso.maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * => operadores aritimeticos
        int  num1 = 10;
        int num2 = 20;
        int resultado = num1 *  num2;
        System.out.println(resultado);

        //% resto da divisao
        int resto = 20 % 7;
        System.out.println(resto);

        // logicos retornam um valor boolean < > <= e >= == !=
        boolean isDezMaiorqueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualdez = 10 == 10;
        boolean isDezdiferenteVinte = 10 != 20;
        boolean isDezdiferentedez = 10 != 10;

        System.out.println("10 é maior que vinte?:" + isDezMaiorqueVinte);
        System.out.println("10 é menor que vinte?:" + isDezMenorQueVinte);
        System.out.println("10 é igual que vinte?:" + isDezIgualVinte);
        System.out.println("10 é igual que dez?:" + isDezIgualdez);
        System.out.println("10 é diferente que vinte?:" + isDezdiferenteVinte);
        System.out.println("10 é diferente que dez?:" + isDezdiferentedez);

        // || (or), &&(and), !(not);
        float salario = 3500F;
        int idade = 29;
        boolean isDentrodaleimenorTrinta  = idade > 30 && salario > 4612;
        boolean maiorQuetrinta = idade < 30 && salario < 3815;

        System.out.println("isDentrodaleimenorTrinta:" + isDentrodaleimenorTrinta);
        System.out.println("isDentrodaleimenorTrinta:" + maiorQuetrinta);


        //coparacao de  conjucao logica
        double valorTotalContaCorrente  = 200;
        double  valorTotalContaPoupanca = 10000;
        double valorPs5 = 5000F;

        boolean  daPracomprar = valorTotalContaCorrente > valorPs5 || valorTotalContaPoupanca > valorPs5;
        System.out.println("da pra comprar? " + daPracomprar );

        // =, +=, -=, /=, %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; //resto

        System.out.println(bonus);

        //++, -- incremento
        int cont = 0;
        cont++;//cont + 1
        System.out.println(cont);



    }
}
