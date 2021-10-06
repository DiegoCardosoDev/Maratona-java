package curso.maratona.java.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
       //idade  < 15 infantil
        //idade >= 15  && iade < 18 juvenil
        //idade >= 18 = profissional

        String categoria;
        int idade  = 22;
        if (idade  < 15)
            categoria = "infantil";
        else if ( idade >= 15 &&  idade < 18){
            categoria = "jvenil" ;
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
