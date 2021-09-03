public class CreditCardApp {

    public static void main(String[] args) {

        Client clientOne = new Client("John");
        clientOne.addCreditCard(new CreditCard("12345","343","1223"));
        clientOne.addCreditCard(new CreditCard("12345","343","1223"));
        clientOne.addCreditCard(new CreditCard("12345","343","1223"));
        System.out.println(clientOne.getCreditCards().get(2).creditCardNumber);
        System.out.println(clientOne.getCreditCards().size());
    }
}