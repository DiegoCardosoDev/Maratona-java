package java.core.interfaces;

public class DataBaseLoader implements  Loader, RemoveLoader{
    @Override
    public void load() {
        System.out.println("Loader database...");

    }

    @Override
    public void remove() {
        System.out.println("removing database...");

    }

    @Override
    public   void checking(){
        System.out.println("checking dates...");

    }

}
