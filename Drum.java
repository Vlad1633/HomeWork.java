package HomeWork6;



public class Drum extends Tools{
    int size = 30;
    @Override
    public void play() {
        System.out.println("Играет барабан, размер: "+size+" см");
    }
}
