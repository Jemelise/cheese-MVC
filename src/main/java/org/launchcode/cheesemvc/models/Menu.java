package org.launchcode.cheesemvc.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, message="Must not be empty")
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    public void addItem(Cheese item){
        cheeses.add(item);
    }

    public Menu(String name){
        this.name = name;

    }

    public Menu(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void removeCheese(Cheese omOm) { this.cheeses.remove(omOm);}
}
