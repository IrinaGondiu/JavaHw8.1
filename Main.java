import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = randomNumber(10, 99);
            System.out.print(number[i] + " ");
        }

        String result = "Возрастающая последовательность";
        for (int i = 0; i < number.length; i++) {
            if (i > 0 && number[i - 1] >= number[i]) {
                result = "Не возрастающая последовательность";
                break;
            }
        }
        System.out.print(result);
    }

    public static int randomNumber(int min, int max) {

        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;

    }
}






