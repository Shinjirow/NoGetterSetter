package example0;

public class Main extends Object {

    public void run() {
        Position aPosition = new Position();
        aPosition.x = 100;

        System.out.printf("x = %d%n", aPosition.x);

        Position anotherPosition = new Position();
        anotherPosition.x = -300;

        if (anotherPosition.x < 0) {
            anotherPosition.x *= -1;
        }
        System.out.printf("x = %d%n", anotherPosition.x);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
