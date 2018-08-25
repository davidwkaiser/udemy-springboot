package com.example.db.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;
    @OneToMany(mappedBy = "artist")
    private List<Song> songs;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
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

    private Artist(){
    }

    public Artist(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
