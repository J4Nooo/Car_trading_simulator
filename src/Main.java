import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car S3 = new Car(120000.0, "Audi", 30000.0, "Czarny", "Premium",true,true,true,true,true);
        Customer Maniek = new Customer(200000.0,"Mercedes","Audi",false,false);
        Car VW = new Car(19000.0, "Volkswagen", 201294.0, "Niebieski","Budget", true, false, true, true, true);

//        System.out.println(S3.Wartosc);
//        System.out.println(S3.Przebieg);
//        System.out.println(S3.Marka);

//        Scanner Scanner = new Scanner(System.in);
//
//        Double choice = Scanner.nextDouble();
//
//        Switch(choice){
//            case 1:
//                System.out.println("Opcja nr 1");
//                break;

        Owner marek = new Owner();
        System.out.println(marek.wallet);
        marek.buy(S3,Maniek);
        System.out.println(marek.wallet);

        marek.sell(S3,Maniek);
        System.out.println(marek.wallet);
        System.out.println(VW.Zawieszenie);
        marek.repair(VW,"Janusz");
        System.out.println(VW.Zawieszenie);
        System.out.println(marek.wallet);

        }
    }




