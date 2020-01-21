package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Запуск потока - " + Thread.currentThread().getName());
        try {
            for (int i = 1; i < 6; i++) {
                Mythread th = new Mythread("Поток " + i);
                th.start();
                th.setPriority(i);
                th.join(); 
            }
        } catch (Exception e) {

        }
        System.out.println("Завершение поока - " + Thread.currentThread().getName());
    }
}
