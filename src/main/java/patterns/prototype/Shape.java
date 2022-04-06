package patterns.prototype;

public abstract class Shape implements Cloneable {
    String type;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract void draw();
}
