package com.diogeneskonorath.rentingroomapp.application;

import com.diogeneskonorath.rentingroomapp.entities.Room;

import java.util.Scanner;

public class RentingApp {
    public static void main(String[] args) {
        Scanner entryData = new Scanner(System.in);
        Room[] rentingRoom = new Room[10];
        int roomsToBeRenting;

        System.out.println("How many rooms will be rented?");
        roomsToBeRenting = entryData.nextInt();

        for (int i=0; i<roomsToBeRenting; i++){
            System.out.println("Rent #"+ i +":");
            entryData.nextLine();
            System.out.println("\nName: ");
            String name = entryData.nextLine();
            System.out.println("\nEmail: ");
            String email = entryData.nextLine();
            System.out.println("\nRoom: ");
            int room = entryData.nextInt();
            rentingRoom[room] = new Room(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i=0; i<rentingRoom.length; i++){
            if (rentingRoom[i] != null){
                System.out.println("Room "+i + ": "+ rentingRoom[i]);
            }
        }
    }
}
