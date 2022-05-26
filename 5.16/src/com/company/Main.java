package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        //Створити програму, яка виводитиме у консоль випадкове натуральне число з проміжку [-20; 20].
//        int z,x,r,t;
//        z= -20;
//        x= 20;
//        System.out.println("Ex.1 ");
//        int arrayA[] = new int[20];
//        for (int i = 0 ; i < 20; i++) {
//            arrayA[i] = (int) Math.round(Math.random() * (x-z)  + z);
//            System.out.print(" "+arrayA[i]);
//
//        }
//        int plus = 0;
//
//        for (int i = 0; i < arrayA.length ; i++) {
//            if(arrayA[i] > 0){
//                plus++;
//            }
//        }
//        int[] arrplus = new int[plus];
//
//        int countplus= 0;
//
//        for (int i = 0; i < arrayA.length ; i++) {
//            if(arrayA[i] > 0){
//                arrplus[countplus] = arrayA[i];
//                countplus++;
//            }
//        }
//        System.out.println(" ");
//        for (int i = 0; i < arrplus.length ; i++) {
//            System.out.print(" "+arrplus[i]);
//        }
//
//








// Створити програму визначення та виводу у консоль площі та периметру прямокутного трикутника, якщо довжина катетів складає 3 та 4.
//        int a,b,c,S,P;
//        a= 3;
//        b= 4;
//        S= (a*b)*1/2;
//        System.out.println("Ex.2)Площа: "+S);
//        System.out.println("Введіть третю сторону ");
//        Scanner side = new Scanner(System.in);
//        if(side.hasNextInt()) {
//            c = side.nextInt();
//            P= a+b+c;
//            System.out.println("Периметр: "+P);
//        }
//Створити програму визначення та виводу у консоль значення з кількістю цифр у випадково згенерованому числі з проміжку [0; 101).
//        String e,v1,v2;
//        char a0,a1,a2;
//        System.out.println("Ex.3 ");
//        int arrayD[] = new int[1];
//        for (int n = 0 ; n < 101; n++) {
//            arrayD[n] = (int) Math.round(Math.random() * 101);
//            System.out.println(" "+arrayD[n]);
//
//             e = Arrays.toString(arrayD);
//            if(e.length()==3) {
//                a0 = e.charAt(0);
//                System.out.println("1");
//
//
//            }else if(e.length()==2){
//                a0 = e.charAt(0);
//                a1 = e.charAt(1);
//                a2 = e.charAt(2);
//                v1 = a0+""+a1+""+a2;
//                System.out.println("3");
//
//            }else{
//                System.out.println("2 ");
//            }
//
//
//        }
//Створити прототип гри «лотерея». Суть полягає у відгадуванні
//правильної послідовності трьох випадково згенерованих цілих чисел з проміжку [1;
//3]. Обмежити користувача 2-двома спробами.

        String[] mas = { "123", "132", "213", "231", "321", "312" };
        int n = (int) (Math.random() * 6);
        String Randomsequence = mas[n];
        String nameUser;
        int i = 0;
        int j = 3;
        while (i != 2) {
            i++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Попробуй вгадати послідовність чисел від 1 до 3");
            if (sc.hasNext()) {
                nameUser = sc.next();
                if (nameUser.length() > 3) {
                    System.out.println("Ви ввели  більше 3 цифр");
                } else if (nameUser.length() < 3) {
                    System.out.println("Ви ввели  менше 3 цифр");
                } else {
                    if (nameUser.equalsIgnoreCase(Randomsequence)) {
                        System.out.println("Вітаємо, ВИ вгадали!");
                        break;
                    } else {
                        System.out.println("Ви не вгадали! У вас залишилось спроб:" + (2 - i));
                    }
                }
            } else {
                System.out.println("Ви ввели не цифри");
            } j--;
        }































    }
}
