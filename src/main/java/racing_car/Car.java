package racing_car;

public class Car {

    private String name;
    private int position;
    public void create(String name) {
        isValid(name);
        this.name = name;
        this.position = 0;
    }

    private void isValid(String name) {
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (name.contains(" ")) {
            throw new IllegalArgumentException();
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void setPosition(int position) {
        this.position += position;
    }

    public void addPosition() {
        setPosition(1);
    }
}
