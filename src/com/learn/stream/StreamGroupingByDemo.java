package com.learn.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByDemo {

    static void main() {


        List<Product> productList = Arrays.asList(new Product("Apple", 1200),
                new Product("Samsung", 1000), new Product("Nokia", 800),
                new Product("BlackBerry", 1000), new Product("Apple Pro Max", 1500),
                new Product("Mi", 800), new Product("OnePluse", 900));

        Map<Integer,List<Product>> grouingByPriceMap= productList.stream().collect(Collectors.groupingBy(Product::getPrice));
        System.out.println(grouingByPriceMap);

    }
}
