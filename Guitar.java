package HomeWork6;

public class Guitar extends Tools {
    int numberOfStrings = 8;
    @Override
    public void play() {
        System.out.println("Играет гитара, с "+numberOfStrings+" струнами");
    }
}
