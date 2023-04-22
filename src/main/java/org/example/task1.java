package org.example;
import java.util.ArrayList;
import java.util.Random;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task1 {

        public static void main(String[] args) {
            Random numbers = new Random();
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                int values = numbers.nextInt(-100, 100);
                list1.add(values);
            }
            System.out.printf("Произвольный список целых чисел \t%s\n", list1);
            int i = 0;
            while (i < list1.size()) {
                if (list1.get(i) % 2 == 0) {
                    list1.remove(i);
                }
                else {
                    i++;
                }
            }
            System.out.printf("Список с удаленными четными числами %s", list1);
        }
    }





