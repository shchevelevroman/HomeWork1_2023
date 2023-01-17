public class Main {

    public static void main(String[] args) {
        System.out.println("Task1");
        Car car1 = new Car("Lada","Granta",1.7,"Желтый",2015,"Россия");
        car1.setBrand("Lada");
        car1.setModel("Granta");
        car1.setYear(2015);
        car1.setCountry("Россия");
        car1.setColor("Желтый");
        car1.setEngineVolume(1.7);


        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия");
        car2.setBrand("Audi");
        car2.setModel("A8 50 L TDI quattro");
        car2.setYear(2020);
        car2.setCountry("Германия");
        car2.setColor("Черный");
        car2.setEngineVolume(3.0);

        Car car3 = new Car("BMW","Z8",3.0,"Черный",2021,"Германия");
        car3.setBrand("BMW");
        car3.setModel("Z8");
        car3.setYear(2021);
        car3.setCountry("Германия");
        car3.setColor("Черный");
        car3.setEngineVolume(3.0);

        Car car4 = new Car("Kia","Kia",2.4,"Красный",2018,"Южная Корея");
        car4.setBrand("Kia");
        car4.setModel("Sportage 4-го поколения");
        car4.setYear(2018);
        car4.setCountry("Южная Корея");
        car4.setColor("Красный");
        car4.setEngineVolume(2.4);

        Car car5 = new Car("Hyundai", "Avante",1.6,"Оранжевый",2016,"Южная Корея");
        car5.setBrand("Hyundai");
        car5.setModel("Avante");
        car5.setYear(2016);
        car5.setCountry("Южная Корея");
        car5.setColor("Оранжевый");
        car5.setEngineVolume(1.6);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}