import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {-4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
        getAverage(numbers);
        getZeroElements(numbers);
        getHigherZeroElements(numbers);
        multipleElements(numbers);
    }

    public static void getAverage(int[] numbers) {
        IntStream intStream = Arrays.stream(numbers);
        print(intStream.average());
    }

    public static void getZeroElements(int[] numbers) {
        IntStream intStream = Arrays.stream(numbers);
        print(intStream.filter(x -> x == 0).count());
    }

    public static void getHigherZeroElements(int[] numbers) {
        IntStream intStream = Arrays.stream(numbers);
        print(intStream.filter(x -> x > 0).count());
    }

    public static void multipleElements(int[] numbers) {
        IntStream intStream = Arrays.stream(numbers);
        int number = 10;
        int[] collectionInner = intStream.map(x -> x * number).toArray();
        for (int i:
             collectionInner) {
            print(i);
        }
    }

    public static void print(Object object) {
        System.out.println(object);
    }
}
