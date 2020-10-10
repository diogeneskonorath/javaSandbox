package com.diogeneskonorath.core.threads;

import java.util.Random;

public class ThreadA extends Thread {
    private final int tempoDeEspera = 100;
    public void run(){
        try {
            while(true){
                generateRandomOddNumber();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void generateRandomOddNumber() throws InterruptedException {
            Random random =  new Random();
            int number = random.nextInt();
            if(number % 2 ==0){
                number+=1;
                System.out.println("Numero impar: "+number);
            }else{
                System.out.println("Numero impar: "+number);
            }
            sleep(tempoDeEspera);
    }
}
