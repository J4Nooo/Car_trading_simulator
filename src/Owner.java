import java.util.ArrayList;
import java.util.Random;

public class Owner {

    private static final Double DEFAULT_WALLET_STATUS = 60000.0;
    Double wallet;
    Double tax = 0.02;
    ArrayList<Car> garage;
    ArrayList<Customer> customers;


    public Owner(){
        this.wallet = DEFAULT_WALLET_STATUS;
        garage = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void buy(Car car, Customer customer){
        this.wallet -= car.Wartosc;
        this.wallet -= tax * car.Wartosc;
        garage.add(car);
        customers.add(customer);
        customers.add(customer);
    }

    public void sell(Car car, Customer customer){
        this.wallet += car.Wartosc;
        this.wallet -= tax * car.Wartosc;
        garage.remove(car);
        customers.add(customer);
        customers.add(customer);
    }

//    public Double repairCost(Car car, String mechanik, Double repairCost){
//        return
//                switch (mechanik){
//                    case "Janusz":
//                        repairCost = 0.1* car.Wartosc;
//                        break;
//
//                }
//    }

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

            }
            case "Marian" -> {
                Random random = new Random();
                int chance = random.nextInt(10);
                if (chance == 0) {
                    System.out.println("Marian zachlał wczoraj i nie naprawi samochodu. Janusz to ogarnie");
                    wallet -= repairCost(car, "Janusz");
                } else {
                    wallet -= repairCost(car, mechanik);
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
                }
            }
        }
    }
}
