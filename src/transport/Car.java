package transport;

public class Car {
    final String brand;
    final String model;
    private double engineVolume;
    private String color;
    final int year;
    final String country;

    private String transmission;
    final String bodyType;
    private String registrationNumber;
    final int numberOfSeats;

    private String seasonTires;
    private boolean seasonTiresTest() {
        int mouth = 5;
        if (mouth >= 3 || mouth <= 10) {
            seasonTires = "summerTires";
        } else {
            seasonTires = "winterTires";
        }
    }
    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String seasonTires) {
        this.brand = brand == null  ? "default" : brand;
        this.model = model == null  || model.isEmpty() ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? engineVolume : 1.5;
        this.color = color == null || color.isEmpty() ? "Белый" : color;
        this.year = year <= 0 ? year : 2000;
        this.country = country == null  || country.isEmpty() ? "default" : country;
        this.transmission = transmission == null  || transmission.isEmpty() ? "default" : transmission;
        this.bodyType = bodyType == null  || bodyType.isEmpty() ? "default" : bodyType;
        this.registrationNumber = registrationNumber == null  || registrationNumber.isEmpty() ? "default" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 ? numberOfSeats : 1; // требует корректировки, должно отображаться некорректное значение
        this.seasonTires = seasonTires;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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


    public String getCountry() {
        return country;
    }



    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String isSeasonTires() {
        return seasonTires;
    }

    public void setSeasonTires(String seasonTires) {
        this.seasonTires = seasonTires;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year + " года выпуска, " + " сборка - " + country + ", цвет кузова - " + color + ", объем двтигателя " + engineVolume;
    }
}
