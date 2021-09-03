import java.util.ArrayList;
import java.util.List;

public class Client {
    List<CreditCard> creditCards;
    String clientName;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public void addCreditCard(CreditCard cardNumber){

        if(creditCards == null){
            creditCards = new ArrayList<>();
        }
        creditCards.add(cardNumber);
    }

    public List<CreditCard> getCreditCards(){
        return creditCards;
    }
}
