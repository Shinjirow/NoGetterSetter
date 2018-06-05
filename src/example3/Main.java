package example3;

public class Main {
    public void run() {
        Position aPosition = new Position(100);

        System.out.println(aPosition);

        Position anotherPosition = new Position(-300);
        Position absolutePosition = anotherPosition.convertToAbsoluteValue();

        System.out.println(absolutePosition);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
