package com.example.project;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class Dog implements Serializable {


    private String name;
    private UUID uuid;
    private int age;
    private ArrayList<Dog> friends;

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
        this.uuid = UUID.randomUUID();
        friends = new ArrayList<>();
    }

    public Dog(String name){
        this.name=name;
        this.age=0;
        this.uuid = UUID.randomUUID();
        friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Dog> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Dog> friends) {
        this.friends = friends;
    }

    public void addFriend(Dog friend) {
        this.friends.add(friend);
    }
}
