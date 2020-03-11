package com.sreyreach_sem.demopet;

public class Model {

    int image;
    String pet_name;
    String pet_age;
    String pet_type;
    String pet_price;

    public Model(int image, String pet_name, String pet_age, String pet_type, String pet_price) {

        this.image = image;
        this.pet_name = pet_name;
        this.pet_age = pet_age;
        this.pet_type = pet_type;
        this.pet_price = pet_price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_age() {
        return pet_age;
    }

    public void setPet_age(String pet_age) {
        this.pet_age = pet_age;
    }

    public String getPet_type() {
        return pet_type;
    }

    public void setPet_type(String pet_type) {
        this.pet_type = pet_type;
    }

    public String getPet_price() {
        return pet_price;
    }

    public void setPet_price(String pet_price) {
        this.pet_price = pet_price;
    }
}
