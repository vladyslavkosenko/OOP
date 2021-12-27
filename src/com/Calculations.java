package com;

import java.util.Arrays;

public class Calculations {

    public void fillArrayPaired(int... a) {
        System.out.println("1. Заповнити масив тільки парними числами");
        int[] b = new int[a.length];
        for (int s = 1; s < a.length; s++) {

            if ((a[s] % 2) == 0) b[s] = a[s];
            else

                b[s] = a[s] + 1;
        }
        for (int j = 1; j < b.length; j++) {
            System.out.println(b[j]);
        }

    }

    public void fillRandom(int... a) {
        System.out.println("2. Заповнити масив рандомними числами");
        int[] b = new int[10];
        for (int s = 1; s < a.length; s++) {
            b[s] = a[s];
            System.out.println(b[s]);
        }


    }

    public void mean(int... a) {
        System.out.println("3. Вивести середнє значення масиву");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        System.out.println("sum " + sum / a.length);

    }

    public void sumMultiplesThree(int... a) {
        System.out.println("4. Вивести суму всіх значень кратних 3");
        int sumValues = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                sumValues = sumValues + a[i];
            }

        }
        System.out.println(sumValues);

    }

    public void sumPaired(int... a) {
        System.out.println("5. Вивести значення всіх парних індексів масиву");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println(+a[i]);
            }

        }
    }

    public void ascendingOrder(int... a) {
        System.out.println("6. Просортувати масив в порядку зростання");
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a);
            System.out.println(a[i]);
        }

    }

    public void smallestValue(int... a) {
        System.out.println("7. Вивести найменше значення в масиві");
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min)
                min = a[i];
        }
        System.out.println(+min);
    }

    public void greaterImportance(int... a) {
        System.out.println("8. Вивести найбільше значення масиву");
        int max = a[9];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max)
                max = a[i];
        }
        System.out.println(max);


    }

    public void sumPairedValues(int... a) {
        System.out.println("9. Вивести суму значень всіх парних індексів");
        int sumIndex = 0;
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                sumIndex = sumIndex + a[i];
            }
        }
        System.out.println(sumIndex);
    }

    public void firstTwentyASCI(int... a) {
        System.out.println("10. Вивести перших 20 символів з таблиці ASCI");
        char ch = 32;
        for (int i = 0; i < 20; i++) {
            System.out.print(ch++);

        }

    }


}



