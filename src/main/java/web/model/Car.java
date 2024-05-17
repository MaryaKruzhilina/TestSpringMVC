package web.model;
public class Car {
    private String model;
    private String carNumber;
    private int release;

    public Car(String model, String carNumber, int release) {
        this.model = model;
        this.carNumber = carNumber;
        this.release = release;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
