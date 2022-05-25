package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////Ex.1)З використанням методу concat() класу String скласти речення з
////п’яти окремих слів введених користувачем.
        String w1, w2, w3,w4,w5,wo1,wo2,wo3,wo4;
        System.out.println(" You can write 5 words, write 1-st word");
        Scanner word = new Scanner(System.in);
        if(word.hasNext()) {
            w1 = word.next();
            System.out.println("Write 2-nd word");
            if(word.hasNext()) {
                w2 = word.next();
                System.out.println("Write 3-rd word");
                if(word.hasNext()) {
                    w3 = word.next();
                    System.out.println("Write 4-th word");
                    if(word.hasNext()) {
                        w4 = word.next();
                        System.out.println("Write 5-th word");
                        if(word.hasNext()) {
                            w5 = word.next();
                            wo1 = w1.concat(" "+w2);
                            wo2 = wo1.concat(" "+w3);
                            wo3 = wo2.concat(" "+w4);
                            wo4 = wo3.concat(" "+w5);
                            System.out.println("Ex.1 "+wo4);
                        }

                    }

                }
            }

        }
//  // Створити програму визначення та виведення на екран першої літери п’яти довільно введених користувачем слів із використанням методу
//        //substring(pos1, pos2).
        String l1, l2, l3,l4,l5,le1,le2,le3,le4,le5;
        System.out.println(" You can write 5 words, write 1-st word");
        Scanner letter = new Scanner(System.in);
        if(word.hasNext()) {
            l1 = word.next();
            System.out.println("Write 2-nd word");
            if(word.hasNext()) {
                l2 = word.next();
                System.out.println("Write 3-rd word");
                if(word.hasNext()) {
                    l3 = word.next();
                    System.out.println("Write 4-th word");
                    if(word.hasNext()) {
                        l4 = word.next();
                        System.out.println("Write 5-th word");
                        if(word.hasNext()) {
                            l5 = word.next();
                            le1= l1.substring(0,1);
                            le2= l2.substring(0,1);
                            le3= l3.substring(0,1);
                            le4= l4.substring(0,1);
                            le5= l5.substring(0,1);
                            System.out.println("Ex.2 ");
                            System.out.println(le1);
                            System.out.println(le2);
                            System.out.println(le3);
                            System.out.println(le4);
                            System.out.println(le5);
                        }

                    }

                }
            }

        }


        //Створити програму виводу на екран повідомлення про більше
//                    //дробове число з трьох введених користувачем. Передбачити можливість повідомлення користувача про введення не дробового числа.
//        double q, w, e;
//        System.out.println("Можна ввести 3 дробових числа) Введіть 1 ");
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextDouble()) {
//            q = sc.nextDouble();
//            System.out.println("Введіть 2 ");
//            if (sc.hasNextDouble()) {
//                w = sc.nextDouble();
//                System.out.println("Введіть 3 ");
//                if (sc.hasNextDouble()) {
//                    e = sc.nextDouble();
//                    if(q % 2 != 1 && q % 2 != 0 ){
//                        if(w % 2 != 1 && w % 2 != 0 ){
//                            if(e % 2 != 1 && e % 2 != 0 ){
//
//                                if (q >= w && q >= e) {
//                                    System.out.println(q);
//                                } else if (w >= q && w >= e) {
//                                    System.out.println(w);
//                                } else {
//                                    System.out.println(e);
//                                }
//
//
//                            }else{
//                                System.out.println("ціле");
//                            }
//                        }else{
//                            System.out.println("ціле");
//                        }
//                    }else{
//                        System.out.println("ціле ");
//                    }
//                }
//            }
//            System.out.println(" Дробове");
//
//
//        }else {
//
//            System.out.println("Ви ввели не дробове число");
//
//        }

        //Створити програму перевірки ідентичності двох введених з клавіатури імен без урахування регістру.
//
        String s1, s2;
       Scanner name = new Scanner(System.in);
        System.out.print("Ex.4:Write 2 name:write 1-st name: ");
        if (name.hasNext()) {
            s1 = name.next();
            System.out.println("Ex.4:write 2-nd name ");
            if (name.hasNext()) {
                s2 = name.next();
                if (s1.equalsIgnoreCase(s2)) {
                    System.out.println("Ex.4:equals");
                } else {
                    System.out.println("Ex.4: No equals");
                }
            }
       }
//Створити програму визначення більшого за кількістю символів
//рядка з двох введених користувачем.
        String a1, a2;
        Scanner words = new Scanner(System.in);
        System.out.print("Ex.5:Write 2 words:write 1-st word: ");
        if (words.hasNext()) {
            a1 = words.next();
            System.out.println("Ex.5:write 2-nd name ");
            if (words.hasNext()) {
                a2 = words.next();
                int n = a1.length();
                for (int i = 0; i < n; i++){


                }
                int m = a2.length();
                for (int i = 0; i < n; i++){

                }
                if(n>m){
                    System.out.println("Ex.5:Довше: "+a1);
                }else{
                    System.out.println(("Ex.5:Довше: "+a2));
                }
            }
        }


    }
}
