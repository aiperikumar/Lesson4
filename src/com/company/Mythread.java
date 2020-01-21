package com.company;

public class Mythread extends Thread{

    public Mythread(String name) {
        super(name);
    }

    public void run(){
        System.out.println("Запуск потока - " + this.getName());
        try {
            System.out.println("Останавливаем поток на 1 секунду - "+ this.getName());
            sleep(1000);}
        catch (InterruptedException ie){}
        System.out.println("Завершение потока - " + this.getName());
    }
}
