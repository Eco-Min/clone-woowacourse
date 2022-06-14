package racing_car.domain;

public class Car {

    private String name;
    private int position;
    public void create(String name) {
        validate(name);
        this.name = name;
        this.position = 0;
    }

    private void validate(String name) {
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

    public void addPosition() {
        this.position += 1;
    }
}
