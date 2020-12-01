import java.util.Random;

public class Calc {

    int[] N = {1, 10, 50, 100, 500, 1000, 5000, 10000 };
    public void start(int run) {
        IntOnlyArrayList ioal = new IntOnlyArrayList();
        for (int i = 0; i < run; i++) {
            ioal.add(i);
        }
        for (int i = 0; i < run; i++) {
            ioal.remove(i);
        }

        System.out.println("**********************************************\n");

    }

/*
    public int randomNumber() {
        int numberToReturn;
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        numberToReturn = (int) (Math.random() * range) + min;

        return numberToReturn;
    }
*/


}
