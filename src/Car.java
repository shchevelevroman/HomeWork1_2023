public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand == null  ? "default" : brand;
        this.model = model == null  || model.isEmpty() ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? engineVolume : 1.5;
        this.color = color == null || color.isEmpty() ? "Белый" : color;
        this.year = year <= 0 ? year : 2000;
        this.country = country == null  || country.isEmpty() ? "default" : country;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year + " года выпуска, " + " сборка - " + country + ", цвет кузова - " + color + ", объем двтигателя " + engineVolume;
    }
}
