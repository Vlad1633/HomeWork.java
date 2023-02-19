package HomeWork6;

public class CounterStrike implements ComputerGame{


    @Override
    public void shoot() {
        System.out.println("You shoot!");
    }

    @Override
    public void move() {
        System.out.println("You move!");
    }

    @Override
    public void start() {
        System.out.println("Counter Strike has started!");
    }

    @Override
    public boolean end() {
        System.out.println("End of the game!");
        return false;
    }
}

