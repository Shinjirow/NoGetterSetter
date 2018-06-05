package example2;

public class Main extends Object {

    public void run() {
        Position aPosition = new Position(100);

        System.out.println(aPosition);

        Position anotherPosition = new Position(-300);

        if (anotherPosition.isNegativeValue()) {
            anotherPosition.flip();
        }
        System.out.println(anotherPosition);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
