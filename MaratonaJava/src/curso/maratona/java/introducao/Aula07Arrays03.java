package curso.maratona.java.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //byte,short,int,long,float, e double inicia  0
        //char 'u\0000
        //boolean false
        //string  null
        String[] nomes = new String[3];

        nomes[0] = "Diego";
        nomes[1] = "tania";
        nomes[2] = "tammy";
        nomes[3] = "isaac";
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
            
        }

        nomes = new String[4];

    }
}
