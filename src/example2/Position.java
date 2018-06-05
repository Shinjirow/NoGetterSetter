package example2;

public class Position extends Object {
    private Integer x;

    public Position(Integer x) {
        this.x = x;

        return;
    }

    public Boolean isNegativeValue() {
        return this.x < 0;
    }

    public void flip() {
        this.x *= -1;

        return;
    }

    @Override
    public String toString() {
        StringBuilder aBuffer = new StringBuilder();
        aBuffer.append("x = ");
        aBuffer.append(this.x);
        return aBuffer.toString();
    }
}
