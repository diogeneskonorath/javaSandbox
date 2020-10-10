package com.diogeneskonorath.core.main;

import com.diogeneskonorath.core.threads.ThreadA;
import com.diogeneskonorath.core.threads.ThreadB;

public class Main {
    public static void main(String[] Args){
        ThreadA threadOdd = new ThreadA();
        ThreadB threadEven = new ThreadB();

        threadOdd.start();
        threadEven.start();
    }
}
