package curso.maratona.java.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Int.double.float,char,long,byte,short,boolean
        int  MinhaIdade = 32;
        float minhaAltura = 1.700F;
        double  MeuPeso = 78.8;
        long  MeuCpf = 37726062886L;
        byte IdadeByte = 32;
        boolean verdadeiro = true;
        boolean falso = false;
        char TipoSanguineo = 'A';
        String name2 = "Diego";
        System.out.println("nome: " + name2 + "\nA idade é: " + MinhaIdade + "\nO Peso é: " + MeuPeso + "\nO Cpf: " + MeuCpf);
        System.out.println("\nO cpf esta ativo? " + verdadeiro);
        System.out.println("Tipo sanguineo: " + TipoSanguineo  +"\nAltura:" + minhaAltura);


    }
}
