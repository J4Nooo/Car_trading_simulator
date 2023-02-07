import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car S3 = new Car(120000.0, "Audi", 30000.0, "Czarny", "Premium",true,true,true,true,true);
        Customer Maniek = new Customer(200000.0,"Mercedes","Audi",false,false);
        Car VW = new Car(19000.0, "Volkswagen", 201294.0, "Niebieski","Budget", true, false, true, true, true);
        Customer Wiesiek = new Customer(100000.0,"BMW","Audi",false, false);

        Scanner scanner = new Scanner(System.in);
        Owner me = new Owner();
        System.out.println("Witaj w symulatorze komisu samochodowego");
        System.out.println("Masz do wyboru:");
        System.out.println("1. Przeglądaj bazę samochodów do kupienia");
        System.out.println("2. Kup samochód");
        System.out.println("3. Przeglądaj bazę posiadanych samochodów");
        System.out.println("4. Napraw samochód");
        System.out.println("5. Przeglądaj bazę potencjalnych klientów");
        System.out.println("6. Sprzedaj samochód klientowi");
        System.out.println("7. Sprawdź stan konta");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 7){
            System.out.print("Wybierz prawidłową opcję 1-7: ");
            choice = scanner.nextInt();
        }
        if (choice == 1){
            me.generateBase();
        }
        if (choice == 2) {
            System.out.println("Wpisz, który samochód chcesz kupić:");
            String answer = scanner.nextLine();
            me.buy(S3); //me.buy(answer)

        }
        if (choice == 3){
            System.out.println(me.garage);
        }
        if (choice == 4){
            System.out.println("Wybierz, u którego mechanika chcesz naprawić samochód:\n1. Janusz\n2. Mariusz\n3. Adrian");
            String choice1;
            choice1 = scanner.nextLine();

            me.repair(S3,choice1);
            System.out.println("Samochód naprawiony");
        }
        if(choice == 5){
            System.out.println(me.customers);
        }
        if(choice == 6){
            me.sell(S3,Maniek);
            System.out.println("Samochód sprzedany");
        }
        if(choice == 7){
            System.out.println("Stan konta: " + me.wallet);
        }
        }
    }




