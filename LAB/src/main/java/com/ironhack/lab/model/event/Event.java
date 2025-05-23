package com.ironhack.lab.model.event;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate date;
    private Integer length;
    private String location;

    @ManyToMany
    @JoinTable(
            name = "event_guest",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "guest_id")
    )
    private Set<Guest> guests = new HashSet<>();

    public Event() {
    }

    public Event(String title, LocalDate date, Integer length, String location, Set<Guest> guests) {
        this.title = title;
        this.date = date;
        this.length = length;
        this.location = location;
        this.guests = guests;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Guest> getGuests() {
        return guests;
    }

    public void setGuests(Set<Guest> guests) {
        this.guests = guests;
    }

}
