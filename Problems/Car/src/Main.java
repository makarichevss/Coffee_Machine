class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        if (speed <= 5) {
            speed = 0;
        } else {
            speed -= 5;
        }
    }
}