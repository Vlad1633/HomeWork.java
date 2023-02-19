package HomeWork6;

public class Home {
    public static void main(String[] args) {
        CounterStrike counterStrike = new CounterStrike();
        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        counterStrike.start();
        counterStrike.move();
        counterStrike.shoot();
        counterStrike.end();
        snakesAndLadders.start();
        snakesAndLadders.rollDice();
        snakesAndLadders.end();
    }
}
