package com.diogeneskonorath.stockapp.entities;

public class Stock {
    private String productName;
    private int productQuantity;
    private double productPrice;

    public Stock(String productName, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public Stock(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return  "Product Name= " + productName +
                ", Product in Stock= " + productQuantity +
                ", Price= " + String.format("%.2f", productPrice) +
                ", Total: " + String.format("%.2f", totalValueInStock());
    }
}
