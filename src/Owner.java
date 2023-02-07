import java.util.ArrayList;
import java.util.Random;

public class Owner {

    private static final Double DEFAULT_WALLET_STATUS = 60000.0;
    Double wallet;
    Double tax = 0.02;
    static ArrayList<Car> garage;
    static ArrayList<Customer> customers;
    Integer moves = 0;


    public Owner(){
        this.wallet = DEFAULT_WALLET_STATUS;
        garage = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void buy(Car car){
        this.wallet -= car.Wartosc;
        this.wallet -= tax * car.Wartosc;
        garage.add(car);
        moves += 1;

    }

    public void sell(Car car, Customer customer){
        this.wallet += car.Wartosc;
        this.wallet -= tax * car.Wartosc;
        garage.remove(car);
        customers.add(customer);
        customers.add(customer);
        moves += 1;
    }


    private Integer repairCost(Car car, String mechanik){
        int cost = 0;
        switch (mechanik) {
            case "Janusz" -> {
                if (car.Segment.equals("Premium")) {
                    if (!car.Silnik) {
                        cost = 20000;
                    }
                    if (!car.Karoseria) {
                        cost = 10000;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 15000;
                    }
                    if (!car.Zawieszenie) {
                        cost = 8000;
                    }
                    if (!car.Hamulce) {
                        cost = 5000;
                    }
                }
                if (car.Segment.equals("Standard")) {
                    if (!car.Silnik) {
                        cost = 10000;
                    }
                    if (!car.Karoseria) {
                        cost = 5000;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 7500;
                    }
                    if (!car.Zawieszenie) {
                        cost = 4000;
                    }
                    if (!car.Hamulce) {
                        cost = 2500;
                    }
                }
                if (car.Segment.equals("Budget")) {
                    if (!car.Silnik) {
                        cost = 5000;
                    }
                    if (!car.Karoseria) {
                        cost = 2500;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 3750;
                    }
                    if (!car.Zawieszenie) {
                        cost = 2000;
                    }
                    if (!car.Hamulce) {
                        cost = 1250;
                    }
                }
            }
            case "Marian" -> {
                if (car.Segment.equals("Premium")) {
                    if (!car.Silnik) {
                        cost = 10000;
                    }
                    if (!car.Karoseria) {
                        cost = 5000;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 7500;
                    }
                    if (!car.Zawieszenie) {
                        cost = 4000;
                    }
                    if (!car.Hamulce) {
                        cost = 2500;
                    }
                }
                if (car.Segment.equals("Standard")) {
                    if (!car.Silnik) {
                        cost = 5000;
                    }
                    if (!car.Karoseria) {
                        cost = 2500;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 3750;
                    }
                    if (!car.Zawieszenie) {
                        cost = 2000;
                    }
                    if (!car.Hamulce) {
                        cost = 1250;
                    }
                }
                if (car.Segment.equals("Budget")) {
                    if (!car.Silnik) {
                        cost = 2500;
                    }
                    if (!car.Karoseria) {
                        cost = 1250;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 1875;
                    }
                    if (!car.Zawieszenie) {
                        cost = 1000;
                    }
                    if (!car.Hamulce) {
                        cost = 625;
                    }
                }
            }
            case "Adrian" -> {
                if (car.Segment.equals("Premium")) {
                    if (!car.Silnik) {
                        cost = 5000;
                    }
                    if (!car.Karoseria) {
                        cost = 2500;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 3750;
                    }
                    if (!car.Zawieszenie) {
                        cost = 2000;
                    }
                    if (!car.Hamulce) {
                        cost = 1250;
                    }
                }
                if (car.Segment.equals("Standard")) {
                    if (!car.Silnik) {
                        cost = 2500;
                    }
                    if (!car.Karoseria) {
                        cost = 1250;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 1875;
                    }
                    if (!car.Zawieszenie) {
                        cost = 1000;
                    }
                    if (!car.Hamulce) {
                        cost = 625;
                    }
                }
                if (car.Segment.equals("Budget")) {
                    if (!car.Silnik) {
                        cost = 1250;
                    }
                    if (!car.Karoseria) {
                        cost = 625;
                    }
                    if (!car.SkrzyniaBiegow) {
                        cost = 936;
                    }
                    if (!car.Zawieszenie) {
                        cost = 500;
                    }
                    if (!car.Hamulce) {
                        cost = 313;
                    }
                }
            }
        }
        return cost;
    }


    public void repair(Car car, String mechanik){
        switch (mechanik) {
            case "Janusz" -> {
                wallet -= repairCost(car, mechanik);
                if(!car.Hamulce){
                    car.Wartosc*=1.1;
                    car.Hamulce = true;
                }
                if(!car.Silnik){
                    car.Wartosc*=2;
                    car.Silnik = true;
                }
                if(!car.Karoseria){
                    car.Wartosc*=1.5;
                    car.Karoseria = true;
                }
                if(!car.Zawieszenie){
                    car.Wartosc*=1.2;
                    car.Zawieszenie = true;
                }
                if(!car.SkrzyniaBiegow){
                    car.Wartosc*=1.5;
                    car.SkrzyniaBiegow = true;
                }
                moves += 1;

            }
            case "Marian" -> {
                Random random = new Random();
                int chance = random.nextInt(10);
                if (chance == 0) {
                    System.out.println("Marian zachlał wczoraj i nie naprawi samochodu. Janusz to ogarnie");
                    wallet -= repairCost(car, "Janusz");
                } else {
                    wallet -= repairCost(car, mechanik);
                    if (!car.Hamulce) {
                        car.Wartosc *= 1.1;
                        car.Hamulce = true;
                    }
                    if (!car.Silnik) {
                        car.Wartosc *= 2;
                        car.Silnik = true;
                    }
                    if (!car.Karoseria) {
                        car.Wartosc *= 1.5;
                        car.Karoseria = true;
                    }
                    if (!car.Zawieszenie) {
                        car.Wartosc *= 1.2;
                        car.Zawieszenie = true;
                    }
                    if (!car.SkrzyniaBiegow) {
                        car.Wartosc *= 1.5;
                        car.SkrzyniaBiegow = true;
                    }
                    moves += 1;
                }
            }
            case "Adrian" -> {
                Random random1 = new Random();
                int chance1 = random1.nextInt(20);
                if (chance1 == 0) {
                    System.out.println("Adrian chyba był wczoraj u Mariana... Trzeba dzwonić po Janusza");
                    wallet -= repairCost(car, "Janusz");
                } else {
                    wallet -= repairCost(car, mechanik);
                    if(!car.Hamulce){
                        car.Wartosc*=1.1;
                        car.Hamulce = true;
                    }
                    if(!car.Silnik){
                        car.Wartosc*=2;
                        car.Silnik = true;
                    }
                    if(!car.Karoseria){
                        car.Wartosc*=1.5;
                        car.Karoseria = true;
                    }
                    if(!car.Zawieszenie){
                        car.Wartosc*=1.2;
                        car.Zawieszenie = true;
                    }
                    if(!car.SkrzyniaBiegow){
                        car.Wartosc*=1.5;
                        car.SkrzyniaBiegow = true;
                    }
                    moves += 1;
                }
            }
        }
    }

    static ArrayList<Car> bazaSamochodow = new ArrayList<>();
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


    public void generateBase() {
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
        for(int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomIndex = random.nextInt(bazaSamochodow.size());
            Car selectedCar = bazaSamochodow.get(randomIndex);
            System.out.println(selectedCar);
        }

    }
}
