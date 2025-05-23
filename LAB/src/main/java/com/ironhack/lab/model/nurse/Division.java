package com.ironhack.lab.model.nurse;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;
    private String president;

    @OneToMany(mappedBy = "division", fetch = FetchType.LAZY)
    private List<Member> members;

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    public Division() {
    }

    public Division(String name, String district, String president, List<Member> members, Association association) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
        this.association = association;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
