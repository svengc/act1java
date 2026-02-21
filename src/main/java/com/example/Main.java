package com.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId("001");
        product1.setName("Sala");
        product1.setPrice(1000000);
        product1.setStock(2);
        System.out.println();
        Product product2 = new Product();
        product2.setId("002");
        product2.setName("Mueble");
        product2.setPrice(250000);
        product2.setStock(5);

        System.out.println(product1.getId());
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.getStock());
        System.out.println();
        System.out.println(product2.getId());
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.getStock());
        System.out.println();
        System.out.println(product1.toString());
        System.out.println();
        System.out.println(product2.toString());
    }
}