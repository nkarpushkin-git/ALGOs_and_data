package Lesson_2.HomeWork;

import Lesson_2.MyArr;

public class MainHW {

    final int max = 100; // Максимальное число для диапазона от 0 до max
    final int rnd = rnd(max);
    int[] arr = new int[SIZE];

    private static int SIZE = 100000;

    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

//    public static void info(MyArr arr) {
//        System.out.println("Выводим массив: ");
//        for (int j = 0; j < SIZE; j++) {
//            System.out.print(arr[j] + " ");
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        int[] arr = new int[SIZE];
        MyArr myArr = new MyArr(arr, SIZE);


        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = rnd(5);
        }

        System.out.println("массив до удаления: ");

        myArr.info();
        int del = 1;
        System.out.println("Удаляем число: " + del);
        myArr.delete(del);
        System.out.println("массив после удаления: ");

        myArr.info();
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - time));

        int ins = 10;
        System.out.println("Вставляем число: " + ins);
        myArr.insert(ins);
        myArr.info();

        myArr.findValue(10);

        System.out.println("массив после пузырьковой сортировки: ");
        myArr.sortBubble();
        myArr.info();
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - time));
//
//        System.out.println("Удаляем все ноли:");
//        myArr.deleteAll(0);
//        myArr.info();

    }
}
