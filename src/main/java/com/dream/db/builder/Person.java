package com.dream.db.builder;

/**
 * @Author : huzejun
 * @Date: 2021/12/20-0:03
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    public Person() {
    }

    public static class PersonBuilder{
        Person p = new Person();

        public PersonBuilder basicInfo(int id,String name,int age){
            p.id = id;
            p.name = name;
            p.age = age;
            return this;
        }

        public PersonBuilder weight(double weight){
            p.weight = weight;
            return this;
        }

        public PersonBuilder score(int score){
            p.score = score;
            return this;
        }

        public PersonBuilder loc(String street, String roomNo){
            p.loc = new Location(street,roomNo);
            return this;
        }
        public Person build(){
            return p;
        }
    }
}

class Location {
    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
