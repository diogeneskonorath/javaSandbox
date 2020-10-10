package com.diogeneskonorath.core.threads;

import java.util.Random;

public class ThreadB extends Thread{
    private final int tempoDeEspera = 500;
    public void run(){
        try {
            while(true){
                generateRandomEvenNumber();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void generateRandomEvenNumber() throws InterruptedException {
            Random random =  new Random();
            int number = random.nextInt();
            if(number %2 == 0){
                System.out.println("Numero par: "+number);
            }else{
                number+=1;
                System.out.println("Numero par: "+number);
            }
            sleep(tempoDeEspera);
    }
}
