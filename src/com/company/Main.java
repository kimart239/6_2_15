package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	/*
	Напишите программу, которая прочитает из System.in последовательность целых чисел,
	разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях,
	 и затем выведет получившуюся последовательность в обратном порядке в System.out.

	 Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

	 Все import объявлены за вас.
	 Пример ввода: 1 2 3 4 5 6 7 8 9 10
	 Пример вывода: 10 8 6 4 2
	 */
        int count = 0;
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            if (count%2 != 0) {
                arr.addFirst(sc.nextInt());
            } else {
                sc.nextInt();
            }
            count++;
        }
        for (Integer a: arr) {
            System.out.println(a.intValue());
        }

    }
}
