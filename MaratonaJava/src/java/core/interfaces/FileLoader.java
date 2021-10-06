package java.core.interfaces;

public class FileLoader implements Loader,RemoveLoader{
    @Override
    public void load() {
        System.out.println("loading Files...");

    }

    @Override
    public void remove() {
        System.out.println("Removing Files...");

    }
}
