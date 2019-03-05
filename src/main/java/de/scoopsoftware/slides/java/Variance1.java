package de.scoopsoftware.slides.java;

import java.util.Arrays;
import java.util.List;

public class Variance1 {
    static class Animal {
        final String name;

        Animal(String name) {
            this.name = name;
        }

        void feed() {
            System.out.println("$name is no longer hungry");
        }
    }

    static class Cat extends Animal {
        String hairColor;

        Cat(String name) {
            this(name, null);
        }
        Cat(String name, String hairColor) {
            super(name);
            this.hairColor = hairColor;
        }
    }

    static interface Producer<T> {
        T get(String name);
    }

    static class Herd<T extends Animal> implements Producer<T> {
        private final List<T> list;

        Herd(List<T> list) {
            this.list = list;
        }

        @Override
        public T get(String name) {
            return list.stream().filter(a -> a.name == name).findFirst().orElse(null);
        }
    }

    static void feedByName(String name, Herd<Animal> herd) {
        herd.get(name).feed();
    }


    public static void main(String[] args) {
        Herd<Animal> animals = new Herd<>(Arrays.asList(
                new Animal("Unicorn"), new Animal("Godzilla")
        ));

        Herd<Cat> cats = new Herd<>(Arrays.asList(
                new Cat("Nala"), new Cat("Sammy", "orange")
        ));

        feedByName("Godzilla", animals);
//        feedByName("Sammy", cats);    // compile error: Wrong 2nd argument type.
    }
}
