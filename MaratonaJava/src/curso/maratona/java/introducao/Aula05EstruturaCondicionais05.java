package curso.maratona.java.introducao;

public class Aula05EstruturaCondicionais05 {
    public static void main(String[] args) {
        byte dia = 5;
        //pode colocar char,int,byte, short, emun,string
        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("segunda");
                break;
            case 3 :
                System.out.println("terça");
                break;
            case 4 :
                System.out.println("quarta");
                break;
            case 5 :
                System.out.println("quinta");
                break;
            case 6 :
                System.out.println("sexta");
                break;
            case 7 :
                System.out.println("sabado");
                break;
            default:
                System.out.println("invalido!");
                break;
        }


                char sexo = 'M';
                 switch (sexo){
                     case'M':
                         System.out.println("homem");
                         break;
                     case 'F':
                         System.out.println("mulher");
                         break;
                 }
    }
}
