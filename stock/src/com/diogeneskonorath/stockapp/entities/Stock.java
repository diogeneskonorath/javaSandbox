package com.diogeneskonorath.stockapp.entities;

public class Stock {
    public String productName;
    public int productQuantity;
    public double productPrice;

    public double totalValueInStock(){
        return productPrice * productQuantity;
    }

    public String addProductsInStock(int quantity){
        this.productQuantity += quantity;
        return "product added to stock";
    }

    public String removeProductsInStock(int quantity){
        this.productQuantity -= quantity;
        return "product removed from stock";
    }

    @Override
    public String toString() {
        return  "Product Name= " + productName +
                ", Product in Stock= " + productQuantity +
                ", Price= " + String.format("%.2f", productPrice) +
                ", Total: " + String.format("%.2f", totalValueInStock());
    }
}
