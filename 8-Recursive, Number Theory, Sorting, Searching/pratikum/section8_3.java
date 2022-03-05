import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class section8_3 {
    public static void minMax(int[] temp) {
        int max = temp[0];
        int min = temp[0];
        int indexMin = 0, indexMax = 0;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                indexMax = i;
            }

            else if (temp[i] < min) {
                min = temp[i];
                indexMin = i;
            }
        }
        System.out.println("min: " + min + " index: " + indexMin);
        System.out.println("min: " + max + " index: " + indexMax);
    }

    public static void main(String[] args) {
        int[] temp = { 5, 7, 4, -2, -1, 8 };
        minMax(temp);
    }

}