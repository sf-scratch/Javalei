package com.leige.pojo;

import java.util.List;

public class Father {
    private int id;
    private String password;
    private List<Son> sons;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Son> getSons() {
        return sons;
    }

    public void setSons(List<Son> sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "Father{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", sons=" + sons +
                '}';
    }
}
