package com.company;


public class Main {

    public static void main(String[] args) {
        // 1 завдання
        //25<більше: менше >100
        int a = 60;
        int s = 25;
        int v = 100;
        if(s<a){
            if(a<v) System.out.println("зв1:Належить відрізку");
        }
        else System.out.println("зв1:Не належить відрізку");


        //2 завдання : знайти найбільше число з 3-х цифрового
        int [] q= new int [3];
        q[0]= 3;
        q[1]= 7;
        q[2]= 8;
        int[] w = q;
        if(q[0]>q[1]){
            System.out.println(q[0]);
            if(q[0]>q[2]){
                System.out.println(q[0]);
                if(q[1]>q[2]){
                    System.out.println(q[1]);
                }else{
                    System.out.println(q[2]);
                }
            }else{
                System.out.println(q[2]);
            }
        }else {
            System.out.println(q[1]);
        }



        // завдання 3 поверхи з ліфтом через оператор if(без 2 поверху)

        int f = 1;
        int m = 10;
        if (f != m)
            System.out.println("Ви піднялись на 1 поверх ");

        if (f != m)
            System.out.println("Ви піднялись на 3 поверх ");
        if (f != m)
            System.out.println("Ви піднялись на 4 поверх ");
        if (f != m)
            System.out.println("Ви піднялись на 5 поверх ");
        if (f != m)
            System.out.println("Ви піднялись на 6 поверх ");
        if (f != m)
            System.out.println("Ви піднялись на 7 поверх ");
        if (f != m)
            System.out.println("Ви піднялись на 8 поверх ");
        if (f != m)
            System.out.println("Ви піднялись на 9 поверх ");


        if(m>f)
            System.out.println("Ви спустились на 8 поверх");
        if(m>f)
            System.out.println("Ви спустились на 7 поверх");
        if(m>f)
            System.out.println("Ви спустились на 6 поверх");
        if(m>f)
            System.out.println("Ви спустились на 5 поверх");
        if(m>f)
            System.out.println("Ви спустились на 4 поверх");
        if(m>f)
            System.out.println("Ви спустились на 3 поверх");
        if(m>f)
            System.out.println("Ви спустились на 1 поверх");

        //4 завдання погодитись: так + і тд.; відмовитись ні - і тд.
        String answer= "так";
        switch(answer){
            case "так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Погоджуюсь");
                break;
            case "NO":
            case "N":
            case "-":
            case "No":
            case "Ні":
                System.out.println("Відмовляюсь");
                break;
        }
    }
}
