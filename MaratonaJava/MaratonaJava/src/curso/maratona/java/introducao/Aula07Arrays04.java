package curso.maratona.java.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        //byte,short,int,long,float, e double inicia  0
        //char 'u\0000
        //boolean false
        //string  null
        int[] numeros  = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5,6,7};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
            
        }

        for (int num:numeros2 ){
            System.out.println(num);
        }
                
                
    }
}
