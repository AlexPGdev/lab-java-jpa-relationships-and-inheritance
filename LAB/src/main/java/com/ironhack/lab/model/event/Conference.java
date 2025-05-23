package com.ironhack.lab.model.event;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private Set<Speaker> speakers = new HashSet<>();

    public Conference() {
    }

    public Conference(String title, LocalDate date, Integer length, String location, Set<Guest> guests, Set<Speaker> speakers) {
        super(title, date, length, location, guests);
        this.speakers = speakers;
    }

    public Set<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Set<Speaker> speakers) {
        this.speakers = speakers;
    }

}
