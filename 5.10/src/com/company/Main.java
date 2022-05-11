package com.company;

import java.util.ArrayList;

public class Main {
    //
    public static void main(String[] args) {
	    for (int i = 500;i<=650;i= i+10){
            System.out.println(i+ "'");
        }
        int j = 500;
        while (j<=650){
            System.out.println(j);
            j= j+10;
        }
        int u = 500;
        do{
            System.out.print(u+" ");
            u= u+10;
        }while (u<=650);
        // 2 зв:вивід усіх значеннь менше 5000 послідовність 2а-1 перше а =2
        for(int a = 2;a<5000;a = 2*a-1){
            System.out.println("Друге завдання "+a);
        }
        //3 завдання:Створити програму виводу у консоль усіх додатніх дільників числа
        //10 (дільники – цілі числа, які ділять число 10 без залишку)
        int e = 10;
        int i = 1;
        for (; i<=e; i++) {
            if(e%i==0){
                System.out.println("3 завдання "+i);
            }
        }
        // Створити циклічну програму визначення факторіалу числа 10 використовуючи оператори циклів for та while.
        int n,f;
        f = 1;
        n = 10;
        for(int h=1; h<=n; h++) {
            f = f*h;
        }
        System.out.println("4 завдання"+n+"! = "+f);


        int p,l;
        l = 1;
        p = 10;
        while(p>=1){
            l=l*p;
            p--;
        }
        System.out.println("4 завдання:10! = "+l);
        //5 зв. Створити циклічну програму підрахунку кількості співпадінь симетричних комбінацій цифр на електронному годиннику (наприклад 03:30).









    }
}
