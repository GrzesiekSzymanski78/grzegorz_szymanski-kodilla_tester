public class SimpleArray {

    public static void main(String[] args) {

        String animals [] = new String[5];
        animals [0] = "dog";
        animals [1] = "cat";
        animals [2] = "cow";
        animals [3] = "horse";
        animals [4] = "bear";

        String animal = animals [2];
        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
