import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class gitPractise {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> randomNumbers = loadList(numbers, 20);
        getMin(randomNumbers);
        getEvenNumbers(randomNumbers);
        getMax(randomNumbers);
    }
    public static List<Integer> loadList(List<Integer> numbers, int size) {
        List<Integer> randomNumbers = new ArrayList<>();
        int currentNumber = 0;
        for (int i = 0; i < 20; i++) {
            currentNumber = getRandomMinMax(1, 100);
            randomNumbers.add(currentNumber);
        }
        return randomNumbers;
    }

    public static int getRandomMinMax(int min, int max) {
        Random rnd = new Random();
        int random = rnd.nextInt(max + 1 - min) + min;
        return random;
    }
    public static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }
    public static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static int getEvenNumbers(List<Integer> numbers) {
        int counter=0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}
