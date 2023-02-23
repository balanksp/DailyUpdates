package java_practice.practice.productorder;

import java.util.*;

import java.util.stream.Collectors;


public class Map_fromstream {
    public static void main(String[] args) {
       List<String> src = Arrays.asList("bala","kumar","rajan");
      List<String> stored_place = new ArrayList<String>();



      // without using the stream
   for (String na : src) {
        stored_place.add(na.toUpperCase());
                 
    } 

    // using stream
  // src.stream().map(na -> na.toUpperCase()).forEach(i -> System.out.println(i));
  stored_place = src.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
    
      // System.out.println(stored_place);

        src.stream().map(names -> names.length()).forEach(siz -> System.out.println(siz));
        

// multiply by 3 after store in another collection.
List <Integer>    numbers = Arrays.asList(1,2,3);
List<Integer> afterMultiply = new ArrayList<Integer>();

System.out.println("--------multiply tasks------------"); 
  for (Integer numb : numbers) {

    afterMultiply.add(numb*3);
    
  }
  
  afterMultiply = numbers.stream().map(num->num*3).collect(Collectors.toList());
  System.out.println(afterMultiply);




}
}
