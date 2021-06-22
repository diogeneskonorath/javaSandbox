package com.diogeneskonorath.stockapp.application;

import com.diogeneskonorath.stockapp.entities.Stock;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Stock stock = new Stock();

        System.out.printf("Enter product data: \n");
        System.out.printf("Product name: ");
        stock.productName = data.nextLine();
        System.out.print("Product price: ");
        stock.productPrice = data.nextDouble();
        System.out.print("Quantity in stock: ");
        stock.productQuantity = data.nextInt();

        System.out.print("\n");
        System.out.print(stock);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = data.nextInt();
        stock.addProductsInStock(quantity);

        System.out.print("");
        System.out.print("Updated stock: " + stock);

        System.out.print("\nEnter the number of products to be removed in stock: ");
        quantity = data.nextInt();
        stock.removeProductsInStock(quantity);

        System.out.print("");
        System.out.print("Updated stock: " + stock);


        data.close();
    }
}
