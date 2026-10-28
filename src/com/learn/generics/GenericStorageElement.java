package com.learn.generics;

public class GenericStorageElement<T> {

        private T storeElement;

        public GenericStorageElement(T storeElement) {
            this.storeElement = storeElement;
        }

        public T getStoreElement() {
            return storeElement;
        }

        public static void main(String[] args) {

            GenericStorageElement<String> s1 = new GenericStorageElement<>("Hello Java");
            System.out.println(s1.getStoreElement());

            GenericStorageElement<Integer> s2 = new GenericStorageElement<>(100);
            System.out.println(s2.getStoreElement());

            GenericStorageElement<Double> s3 = new GenericStorageElement<>(25.5);
            System.out.println(s3.getStoreElement());
        }
    }

