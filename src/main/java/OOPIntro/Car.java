package OOPIntro;

public class Car {
    private static final int NUMBER_OF_WHEELS = 4;
    private String color;
    private double engineDisplacement;
    private String maker;
    private String model;
    private String price;
    private String licensePlate;

    public static void drive(Car car){
        System.out.printf("%s is driving%n", car.getModel());
    }

    public void ganbajeba(String licenseNumber){
        this.licensePlate = licenseNumber;
    }

    public Car(String color, double engineDisplacement, String maker, String model, String price) {
        this.color = color;
        this.engineDisplacement = engineDisplacement;
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getColor() {
        return String.format("The color of this car is %s", this.color);
    }

    public void setColor(String color) {
        if (!color.equals("white") && !color.equals("black")){
            throw new IllegalArgumentException("Unsupported color");
        }
        else {
            this.color = color;
        }
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        if (Integer.parseInt(price) > 100000 || Integer.parseInt(price) < 0){
            throw new IllegalArgumentException("Invalid price value");
        }

        this.price = price + "$";
    }
}
