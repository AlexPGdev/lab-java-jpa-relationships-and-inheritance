package com.ironhack.lab.repository.event;

import com.ironhack.lab.model.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
