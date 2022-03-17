package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        int c =  a/b;
        int v = a%b;
        System.out.println("результат ділення "+c);
        System.out.println("результат остачі "+v);
            /* Завдання 2 */
        int r = 23;
        int n = r%10;
        int x = (r/10)%10;
        System.out.println("Сума цифр "+(n+x));
            /* Завдання 3 */
     double j = 10.6;
     System.out.println(Math.round(j));
    }
}
