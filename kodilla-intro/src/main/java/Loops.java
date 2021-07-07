public class Loops {

    public static void main(String[] args) {
        Integer numbers[] = new Integer[]{10, 20, 30, 40, 50};
        Integer numbers2[] = new Integer[]{1, 2, 3, 4, 5};

        System.out.println("Suma wszystkich elementów z tablicy wynosi " + arraySum(numbers));
        System.out.println("Suma wszystkich elementów z tablicy wynosi " + arraySum(numbers2));
    }

    public static int arraySum(Integer numbers[]) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}