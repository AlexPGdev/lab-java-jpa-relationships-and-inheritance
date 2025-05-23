package com.ironhack.lab.repository.event;

import com.ironhack.lab.model.event.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
