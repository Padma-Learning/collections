package com.learn.method.reference;

public class ConstructorReferenceDemo {

    static void main() {

        ProductInterface productInterface = (name, price) -> new Product(name, price);
        System.out.println(productInterface.getProduct("Apple Mac", 2000));

    }
}
