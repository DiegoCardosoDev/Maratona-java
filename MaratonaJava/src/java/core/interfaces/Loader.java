package java.core.interfaces;

public interface Loader {

    int MAX_DATE_SIZE = 10;
    void load ();

    default void checking(){//o corpo de um metodo deuma interface pode ter codigo por defaul
        System.out.println("checking...");


    }
}
