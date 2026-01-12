package com.project.officeManagement.practices;

import java.util.LinkedHashSet;

public class TryLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<>();
        name.add("Omar");
        name.add("Tanvir");
        name.add("Omar");
        name.add("Banna");
        name.add("omar");

        System.out.println("Print from LinkedHashSet = " + name);

    }
}
