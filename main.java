package HomeWork6;

public class main {


    public static void main(String[] args) {
        Tools[] tools = new Tools[3];
        tools[0] = new Guitar();
        tools[1] = new Drum();
        tools[2] = new Pipe();
        for (int i = 0; i < tools.length; i++) {
            tools[i].play();
        }
        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        snakesAndLadders.rollDice();

    }
}
