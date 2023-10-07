package org.example;

public class Main {
    public static void main(String[] args) {
        double[] num = {2.0, 15.0, 5.0, -2, 1.5, -12, -62, 36.2, 7.0, -1, 11, 2, 9.5, -15, 22.0};
        boolean negative = false;
        double positive = 0.0;
        int i = 0;
        for (double math : num ) {
            if (negative && math > 0){
                positive += math;
                i++;
            }
            if (math < 0){
                negative = true;
            }

        }
        System.out.println("check: " + positive + "/" + i);
        System.out.println("-----------");
                        //dz na soobr
        double n = num.length;
        for (int j = 0; j < n - 1; j++) {
            int minIndex = j;
            for (int k = j+ 1; k < n; k++) {
                if (num[k]<num[minIndex]){
                    minIndex = k;

                }
                
            }
            double temp = num[minIndex];
            num[minIndex] = num[j];
            num[j] = temp;

            System.out.print("Итерация " + (j + 1) + ": ");
            for (double element : num) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.print("Отсортированный массив: ");
        for (double element : num) {
            System.out.print(element + " ");
        }

    }
}