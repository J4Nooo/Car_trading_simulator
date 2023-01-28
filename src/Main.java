import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Car S3 = new Car(120000.0, "Audi", 30000.0, "Czarny", "Premium",true,true,true,true,true);
//
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
        Owner marek = new Owner("Marek");
        marek.buy(20000.0);
        System.out.println(marek.wallet);

        marek.sell(100000.0);
        System.out.println(marek.wallet);


        }
    }




