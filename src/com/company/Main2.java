package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main2 {

    static class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        /*ArrayList<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 10, 8, 5, 12);*/

        /*
        Stream<Integer> middleResult = ints.stream().map(item -> item >= 10 ? item * 2 : item);
        //20 8 5 24

        ArrayList<Integer> result = (ArrayList<Integer>) middleResult.filter(item -> item >= 20).collect(Collectors.toList());

        result.forEach(item -> System.out.println(item));

        ArrayList<Integer> result2 = (ArrayList<Integer>) middleResult.filter(item -> item < 20).collect(Collectors.toList());

        result2.forEach(item -> System.out.println(item));
        */

       /* ArrayList<Integer> result = (ArrayList<Integer>) ints.stream().map(item -> item >= 10 ? item * 2 : item).filter(item -> item >= 20).collect(Collectors.toList());

        ArrayList<Integer> result2 = (ArrayList<Integer>) ints.stream().map(item -> item >= 10 ? item * 2 : item).filter(item -> item < 20).collect(Collectors.toList());*/

        /*ArrayList<Integer> result3 = (ArrayList<Integer>) ints.stream().
                peek(item -> System.out.println("p1 " + item)).
                filter(item -> item <= 10).
                map(item -> item * 2).
                peek(item -> System.out.println("p2 " + item)).
                collect(Collectors.toList());

        System.out.println("\n\n" + result3);*/

        /*
        int sum = ints.stream().reduce((item, summ)->summ+item).get();
        System.out.println(sum);*/


        ArrayList<Cat> cats = new ArrayList<>();

        Collections.addAll(cats,
                new Cat("vasya", 12),
                new Cat("petya", 6));

        /*cats.stream().forEach(item -> {
            if (item.getAge() < 10)
                item.setAge(item.getAge() * 2);
        });
        cats.stream().forEach(item -> System.out.println(item));
         */

       /* cats.stream().filter(item -> item.getAge() < 10).forEach(item->item.setAge(item.getAge() * 2));
        cats.stream().forEach(item -> System.out.println(item));
*/
        ArrayList<Cat> catsResult = (ArrayList<Cat>) cats.stream().sorted(Comparator.comparingInt(c -> c.age)).collect(Collectors.toList());

        catsResult.stream().forEach(item -> System.out.println(item));

        //cats.stream().findFirst();

        //ArrayList<Integer> result = (ArrayList<Integer>) ints.stream().map(item -> item >= 10 ? item * 2 : item).collect(Collectors.toList());
    }
}
