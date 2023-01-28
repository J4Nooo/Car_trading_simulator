
import java.util.ArrayList;

public class Base {
    public static void main(String[] args){
        ArrayList<Car> bazaSamochodow = new ArrayList<>();
        Car car1 = new Car(250000.0, "Audi", 943.0, "Czarny","Premium", true, true, true, true, true);
        Car car2 = new Car(200000.0, "BMW", 532.0, "Srebrny","Premium", true, true, true, true, true);
        Car car3 = new Car(150000.0, "Mercedes", 9821.0, "Biały","Premium", true, true, true, true, true);
        Car car4 = new Car(100000.0, "Volkswagen", 2094.0, "Czarny","Standard", true, true, true, true, true);
        Car car5 = new Car(50000.0, "Opel", 82384.0, "Czarny","Standard", false, true, true, true, true);
        Car car6 = new Car(25000.0, "Toyota", 121947.0, "Biały","Budget", true, false, true, true, true);
        Car car7 = new Car(10000.0, "BMW", 419284.0, "Zielony","Budget", true, true, false, true, true);
        Car car8 = new Car(5000.0, "Skoda", 306284.0, "Niebieski","Budget", true, true, false, false, true);
        Car car9 = new Car(3250000.0, "Pagani", 21.0, "Czerwony","Premium", true, true, true, true, true);
        Car car10 = new Car(80000.0, "Skoda", 3042.0, "Biały","Standard", true, true, true, true, true);
        Car car11 = new Car(130000.0, "Hyundai", 376.0, "Szary","Standard", true, true, true, true, true);
        Car car12 = new Car(170000.0, "Ford", 11947.0, "Niebieski","Premium", true, true, true, true, true);
        Car car13 = new Car(30000.0, "Nissan", 110284.0, "Czarny","Standard", true, true, true, true, false);
        Car car14 = new Car(67000.0, "Peugeot", 120206.0, "Fioletowy","Premium", true, true, true, true, true);
        Car car15 = new Car(32000.0, "Citroen", 290927.0, "Szary","Budget", true, true, true, false, true);
        Car car16 = new Car(90000.0, "Skoda", 257384.0, "Srebrny","Standard", true, true, true, true, true);
        Car car17 = new Car(15000.0, "Toyota", 321935.0, "Biały","Budget", true, true, true, false, true);
        Car car18 = new Car(8000.0, "Opel", 330195.0, "Szary","Budget", true, true, false, true, true);
        Car car19 = new Car(19000.0, "Volkswagen", 201294.0, "Niebieski","Budget", true, false, true, true, true);
        Car car20 = new Car(37000.0, "Mercedes", 121294.0, "Srebrny","Standard", false, true, true, true, true);
        Car car21 = new Car(46000.0, "BMW", 61294.0, "Czarny","Standard", true, true, true, true, false);
        Car car22 = new Car(400000.0, "Audi", 3.0, "Zielony","Premium", true, true, true, true, true);

        bazaSamochodow.add(car1);
        bazaSamochodow.add(car2);
        bazaSamochodow.add(car3);
        bazaSamochodow.add(car4);
        bazaSamochodow.add(car5);
        bazaSamochodow.add(car6);
        bazaSamochodow.add(car7);
        bazaSamochodow.add(car8);
        bazaSamochodow.add(car9);
        bazaSamochodow.add(car10);
        bazaSamochodow.add(car11);
        bazaSamochodow.add(car12);
        bazaSamochodow.add(car13);
        bazaSamochodow.add(car14);
        bazaSamochodow.add(car15);
        bazaSamochodow.add(car16);
        bazaSamochodow.add(car17);
        bazaSamochodow.add(car18);
        bazaSamochodow.add(car19);
        bazaSamochodow.add(car20);
        bazaSamochodow.add(car21);
        bazaSamochodow.add(car22);

        String pierwszy = bazaSamochodow.get(0).toString();
        String drugi = bazaSamochodow.get(1).toString();

        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(car3.Wartosc);

    }
}

