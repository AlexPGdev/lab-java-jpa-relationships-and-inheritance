package com.ironhack.lab.repository.event;

import com.ironhack.lab.model.event.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
