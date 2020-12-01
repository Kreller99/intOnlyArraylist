import jdk.jfr.Timestamp;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        int[] N = {1, 10, 50, 100, 500, 1000, 5000, 10000 };

        for (int i = 0; i < N.length; i++) {
            long startTime = System.nanoTime();
            calc.start(N[i]);
            long endTime = System.nanoTime();
            long totalTime =  (endTime - startTime);
            //System.out.println(totalTime);
            write(totalTime,N[i]);
        }



        }

    public static void write(long time, int n) {
        System.out.println(time + "  " + n);


/*
        IntOnlyArrayList ioal = new IntOnlyArrayList();
        ioal.add(8);

        ioal.size();

        ioal.remove(66);

        ioal.get(2);
*/

    }
}
