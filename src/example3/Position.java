package example3;

public class Position extends Object {
    private Integer x;

    public Position(Integer x) {
        this.x = x;

        return;
    }

    public Position convertToAbsoluteValue() {
        return new Position(this.x < 0 ? -x : x);
    }

    @Override
    public String toString() {
        StringBuilder aBuffer = new StringBuilder();
        aBuffer.append("x = ");
        aBuffer.append(this.x);
        return aBuffer.toString();
    }
}
