package com.ironhack.lab.model.nurse;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "association", fetch = FetchType.LAZY)
    private List<Division> divisions;

    public Association() {
    }

    public Association(String name, List<Division> divisions) {
        this.name = name;
        this.divisions = divisions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

}
