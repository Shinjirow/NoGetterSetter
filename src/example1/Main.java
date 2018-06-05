package example1;

public class Main extends Object {

    public void run() {
        Position aPosition = new Position();
        aPosition.setX(100);

        System.out.printf("x = %d%n", aPosition.getX());

        Position anotherPosition = new Position();
        anotherPosition.setX(-300);

        if (anotherPosition.getX() < 0) {
            anotherPosition.setX(-anotherPosition.getX());
        }

        System.out.printf("x = %d%n", anotherPosition.getX());
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
