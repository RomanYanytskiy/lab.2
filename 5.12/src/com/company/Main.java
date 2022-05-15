package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // 1 зв.. Створити масив непарних чисел від 1 до 99 та вивести його елементи стовпчик. Перед початком створення масиву необхідно врахувати якого він буде
        //розміру.
        System.out.println("Ex.1");
        int array[] = new int[50];
        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
            array[j] = i;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.println( array[i]);
        //2 Ex.Створити масив з 20 випадкових цілих чисел з відрізку [0; 9] та
        //вивести його у консоль. Замінити кожен елемент з непарним індексом на нуль. Оновлений масив також вивести у консоль.
        System.out.println("Ex.2 ");
        int counter = 0;
        int arrayA[] = new int[20];
        for (int i = 0; i < 20; i++) {

            arrayA[i] = (int) Math.round(Math.random() * 9);
        }

        for (int i = 0; i < 20; i++) {

            System.out.print(arrayA[i] + " ");
        }
        for (int i = 0; i < 20; i++) {
            if (arrayA[i] % 2 == 0) {
                System.out.print(arrayA[i]);
            } else {
                System.out.print(0);
            }
        }
// Ex.3 :Створити 3 масиви наповнити їх від 0 до 5(5 цифер) знайти для кожного арифметичне і порівняти їх між собою.
        System.out.println(" ");
        System.out.println("Ex.3");
        int arrayQ[] = new int[5];
        System.out.println(" ");
        System.out.println("1: ");
        for (int i = 0; i < 5; i++) {
            arrayQ[i] = (int) Math.round(Math.random() * 5);

            System.out.print(arrayQ[i]);
        }
        int result = 0;
        for (int Q : arrayQ) {
            result += Q;
        }
        System.out.println(" arrayQ " + result / arrayQ.length);


        int arrayW[] = new int[5];
        System.out.println(" ");
        System.out.println("2: ");
        for (int i = 0; i < 5; i++) {
            arrayW[i] = (int) Math.round(Math.random() * 5);

            System.out.print(arrayW[i]);
        }
        int result1 = 0;
        for (int W : arrayW) {
            result1 += W;
        }
        System.out.println(" arrayW " + result1 / arrayW.length);


        int arrayE[] = new int[5];
        System.out.println(" ");
        System.out.println("3: ");
        for (int i = 0; i < 5; i++) {
            arrayE[i] = (int) Math.round(Math.random() * 5);

            System.out.print(arrayE[i]);
        }
        int result2 = 0;
        for (int E : arrayE) {
            result2 += E;
        }
        System.out.println(" arrayE " + result2 / arrayE.length);


        if (result / arrayQ.length > result1 / arrayW.length) {
            if (result / arrayQ.length > result2 / arrayE.length) {
                System.out.println("Q " + result / arrayQ.length);
            }
        } else if (result1 / arrayW.length > result2 / arrayE.length) {
            System.out.println("W " + result1 / arrayW.length);

        } else {
            System.out.println("E " + result2 / arrayE.length);
        }
//Завдання 4: створити  2 масиви та наповнити 10 випадковими цілими числами від (0;10) а також створити 3 масив
// котрий міститиме в собі суму 1 і 2 масивів з і-тими елементами
        System.out.println("Ex.4 ");
        int[] arrayZ = new int[10];
        int[] arrayX = new int[10];
        int[] arrayG = new int[arrayZ.length];
        System.out.println(" 1 масив: ");
        for (int i = 0, j = 0; i < 10; i++, j++) {
            arrayZ[i] = (int) Math.round(Math.random() * 9);
            System.out.print(arrayZ[i]);

        }
        System.out.println("  ");
        System.out.println("2 масив: ");
        for (int j = 0; j < 10; j++) {
            arrayX[j] = (int) Math.round(Math.random() * 9);
            System.out.print(arrayX[j]);
        }

        System.out.println(" ");
        System.out.println("3 (сума 1 і 2) ");
        for (int g = 0; g < arrayZ.length; ++g) {
            arrayG[g] = arrayZ[g]+arrayX[g];
            System.out.print(" "+arrayG[g]);

        }


        //Ex.5:Створити масив з 15 випадкових елементів з відрізку [0; 10].
        // Вивести масив на екран. Підрахувати скільки в масиві парних елементів та сповістити про
        //це користувача.
        System.out.println(" ");
        System.out.println("Ex.5");
        int []arrayO  = new int[15];

        System.out.println(" ");
        System.out.println("1: ");
        for (int i = 0; i < 15; i++) {
           arrayO[i] = (int) Math.round(Math.random() * 9);
           System.out.print(" "+arrayO[i]);


        }
        int count = 0;
        System.out.println(" ");
        for(int i=0; i < arrayO.length; i++) {

            if (arrayO[i] % 2 == 0) {
                count = count + 1;
                System.out.println("Counter " + count);
            } else {


            }

        }
        //Створити двовимірний масив з 15 стрічок у яких 1-4 стрічки мають
        //по 5 стовбців, 5-8 стрічки мають по 8 стовбців, 9-12 стрічки мають по 3 стовбці, 13-
        //15 стрічки мають по 9 стовбців. Наповнити масив випадковими значеннями цілих чисел з відрізку [0; 15]
        System.out.println("Ex.6");
        int[][] arrayM = new int[15][];
        arrayM [0] = new int [5];
        arrayM [1] = new int [5];
        arrayM [2] = new int [5];
        arrayM [3] = new int [5];
        arrayM [4] = new int [8];
        arrayM [5] = new int [8];
        arrayM [6] = new int [8];
        arrayM [7] = new int [8];
        arrayM [8] = new int [3];
        arrayM [9] = new int [3];
        arrayM [10] = new int [3];
        arrayM [11] = new int [3];
        arrayM [12] = new int [9];
        arrayM [13] = new int [9];
        arrayM [14] = new int [9];

        for(int i=0;i<arrayM.length;i++){
            for(int j=0;j<arrayM[i].length;j++){
                arrayM[i][j]=(int)(Math.random()*15);
                System.out.print(arrayM[i][j]+" ");
            }
            System.out.println(" ");
        }










    }
}

