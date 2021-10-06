package curso.maratona.java.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {

        //condicionais
        int idade = 17;
        boolean eAutorizado = idade >= 18;
        if (idade >= 18 ){//se
            System.out.println("de maior, Autorizado!");
        }
        if (!eAutorizado){//se nao
            System.out.println("Nao Autorizado");
        }
    }
}
