package com.leige.pojo;

public class Son {
    private int id;
    private String username;
    private Father father;

    public Son(){}

    public Son(int id, String username, Father father) {
        this.id = id;
        this.username = username;
        this.father = father;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Son{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", father=" + father +
                '}';
    }
}
