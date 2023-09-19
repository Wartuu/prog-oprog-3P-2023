import com.sun.source.util.TreeScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("provide size of number array: ");
        Scanner scanner = new Scanner(System.in);

        int sumMinus = 0;
        int sumPlus = 0;
        int numInputMax = scanner.nextInt();
        for (int i = 0; i < numInputMax; i++) {
            System.out.print("number input: ");

            int value = scanner.nextInt();

            if(value > 0) {
                sumPlus += value;
            } else {
                sumMinus += value;
            }
        }

        System.out.println("sum of positive numbers: " + sumPlus);
        System.out.println("sum of negative numbers: " + sumMinus);
    }
}