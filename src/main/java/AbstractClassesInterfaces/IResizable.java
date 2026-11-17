package AbstractClassesInterfaces;

public interface IResizable extends IChangeable {
    int resize(int coefficient);
    void doubleSize();
    default int defaultMethod(){
        return 10;
    }
}
