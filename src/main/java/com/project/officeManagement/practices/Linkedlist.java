package com.project.officeManagement.practices;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.addFirst("Omar");
//        cars.addLast("Omar");
//        cars.removeFirst();
        cars.removeLast();
//        System.out.println(cars.getFirst());
//        System.out.println(cars.getLast());


        System.out.println("Print from linkedlist = " + cars);
    }

}
