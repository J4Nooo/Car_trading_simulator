public class Customer {
    Double budget;
    String pierwszaMarka;
    String drugaMarka;
    Boolean akceptujeUszkodzone;
    Boolean akceptujeNiesprawneZawieszenie;


    Customer(Double budget, String pierwszaMarka, String drugaMarka, Boolean akceptujeUszkodzone, Boolean akceptujeNiesprawneZawieszenie){
        this.budget = budget;
        this.pierwszaMarka = pierwszaMarka;
        this.drugaMarka = drugaMarka;
        this.akceptujeUszkodzone = akceptujeUszkodzone;
        this.akceptujeNiesprawneZawieszenie = akceptujeNiesprawneZawieszenie;
    }
}
