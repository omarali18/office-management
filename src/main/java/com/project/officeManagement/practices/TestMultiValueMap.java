package com.project.officeManagement.practices;

import org.apache.catalina.users.SparseUserDatabase;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;

public class TestMultiValueMap {

    public static void main(String[] args) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
    //    parans.put("fruits", new Arraylist<>());
        params.add("id", "1");
        params.add("id", "2");
        params.add("name", "Omar");
        params.add("name", "Ali");



        // Get 1 value
        String firstId = params.getFirst("id"); // "1"

        // Get all values using single key
        List<String> allIds = params.get("name");

        System.out.println("Print from Multi value Map = " + firstId);
        System.out.println("Print from Multi value Map all = " + allIds);
    }




}
