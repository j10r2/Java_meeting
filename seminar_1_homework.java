/*      1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        Пункты реализовать в методе main
                *Пункты реализовать в разных методах*/

import java.util.Random;
import java.lang.Math;

public class seminar_1_homework {

    private static int getRandomInt(){
        return new Random().nextInt(-1000, 1000);
    }

    private static int highestOneBit(int number){
        return Integer.toBinaryString(number).length();
    }

    private static int[] getAliquotNumbers(int number){
        int counter = 0;
        int i = number+1;
        while (i < Short.MAX_VALUE){
            if (i % number == 0) {
                counter++;
                i += Math.abs(number);
            }

            else i++;
        }
        int[] resultArray = new int[counter];
        for (int j = 0, k = number + 1; j < counter;){
            if (k % number == 0){
                resultArray[j] = k;
                j ++;
                k += Math.abs(number);
            }
            else k++;
        }
        return resultArray;
    }

    private static int[] getNotAliquotNumbers(int number){
        int counter = 0;
        int i = number-1;
        while (i > Short.MIN_VALUE){
            if (i % number == 0) {
                counter+=(Math.abs(number)-1);
                i -= Math.abs(number);
            }
            else {
                counter++;
                i--;
            }
        }
        int[] resultArray = new int[counter];
        for (int j = 0, k = number - 1; j < counter;){
            if (k % number != 0){
                resultArray[j] = k;
                j ++;
                k --;
            }
            else k--;
        }
        return resultArray;
    }


    public static void main(String[] args) {
        int i = getRandomInt();
        int n = highestOneBit(i);
        System.out.printf("i = %s, n = %s\n", i, n);
        int [] m1 = getAliquotNumbers(i);
        System.out.printf("m1[0] = %s, m1[1] = %s, m1[2] = %s, всего элементов %s\n", m1[0], m1[1], m1[2], m1.length);
        int [] m2 = getNotAliquotNumbers(i);
        System.out.printf("m2[0] = %s, m2[1] = %s, m2[2] = %s, всего элементов %s\n", m2[0], m2[1], m2[2], m2.length);
    }
    }