/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapslab;

import java.util.*;

/**
 *
 * @author tduwe
 */
public class Lab2 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Duwe", "Thomas", "123-45-6789");
        Employee e2 = new Employee("Duwe", "Jessica", "987-65-4321");
        Employee e3 = new Employee("Duwe", "Nova", "000-00-0000");
        Employee e4 = new Employee("Duwe", "Dante", "111-11-1111");

        Map<String, Object> map = new HashMap<>();
        map.put("123-45-6789", e1);
        map.put("987-65-4321", e2);
        map.put("000-00-0000", e3);
        map.put("111-11-1111", e4);

        Object o1 = map.get("000-00-0000");
        Object o2 = map.get("123-45-6789");
        Object o3 = map.get("987-65-4321");
        Object o4 = map.get("111-11-1111");
        System.out.println("This is employee 1: " + o1);
        System.out.println("This is employee 2: " + o2);
        System.out.println("This is employee 3: " + o3);
        System.out.println("This is employee 4: " + o4);
        
        System.out.println("_________________________________________________");

        Object o_dante = map.put("000-00-0000", e3);
        System.out.println("Replacing Dante with: " + o_dante);
        
        Object o_nova = map.put("987-65-4321", e4);
        System.out.println("Replacing Nova with: " + o_nova);
        
        Object o_jessica = map.put("123-45-6789", e2);
        System.out.println("Replacing Jessica with: " + o_jessica);
        
        Object o_thomas = map.put("111-11-1111", e1);
        System.out.println("Replacing Thomas with: " + o_thomas);
        System.out.println("_____________________________________________________");
        
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Object person = map.get(key);
            System.out.println(person);
        }

    }
}
