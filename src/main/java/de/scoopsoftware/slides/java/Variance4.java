package de.scoopsoftware.slides.java;

import java.util.ArrayList;
import java.util.List;

public class Variance4 {
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

    static interface Consumer<T> {
        void accept(T value);
    }

    static class Herd<T extends Animal> implements Consumer<T> {
        private final List<T> list = new ArrayList<>();

        @Override
        public void accept(T member) {
            list.add(member);
        }
    }

    static void addGarfield(Herd<? super Cat> herd) {
        herd.accept(new Cat("Garfield", "orange"));
    }

    public static void main(String[] args) {
        Herd<Animal> animals = new Herd<>();
        Herd<Cat> cats = new Herd<>();

        addGarfield(animals);
        addGarfield(cats);
    }
}
