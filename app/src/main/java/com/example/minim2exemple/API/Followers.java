package com.example.minim2exemple.API;

public class Followers {
    String name;
    String image;

    public Followers(String name, String image) {
        this.name = name;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String languaje) {
        this.image = languaje;
    }
}
