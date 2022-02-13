package dev.ogabek.java.model;

public class Department {

    private final int photo;
    private final String title;

    public Department(int photo, String title) {
        this.photo = photo;
        this.title = title;
    }

    public int getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }
}
