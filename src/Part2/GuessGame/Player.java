package Part2.GuessGame;

public class Player {
    int number = 0; //comments

    public void guess() {
        number = (int)(Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}
