import java.util.Random;

public class RandomNumbers {

    int max = 0;
    int min = 0;

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getRandomNumbers();
        System.out.println(randomNumbers);
        randomNumbers.getMax(randomNumbers.max);
        System.out.println("The largest number is: " + randomNumbers.max);
        randomNumbers.getMin(randomNumbers.min);
        System.out.println("The smallest number is: " + randomNumbers.min);
    }

    public int[] getRandomNumbers() {
        int[] result = new int[2];
        Random random = new Random();
        int sum = 0;
        while (sum < 5000){
            int num = random.nextInt(31);
            System.out.println(num);
            sum = sum + num;
            int min = getMin(num);
            result[0] = min;
            int max = getMax(num);
            result[1] = max;
        }
        System.out.println(sum);
        return result;
    }

    public int getMax(int number){
        if(number>max){
            max = number;
        }
        return max;
    }

    public int getMin(int number){
        if (number < min){
            min = number;
        }
        return min;
    }
}