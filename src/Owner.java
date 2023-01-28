public class Owner {

    private static final Double DEFAULT_WALLET_STATUS = 60000.0;
    String nickName;
    Double wallet;

    Double Wartosc;

    public Owner(String nickName){
        this.nickName = nickName;
        this.wallet = DEFAULT_WALLET_STATUS;
    }

    public void buy(Double Wartosc){
        this.wallet -= Wartosc;
    }

    public void sell(Double Wartosc){
        this.wallet += Wartosc;
    }
}
