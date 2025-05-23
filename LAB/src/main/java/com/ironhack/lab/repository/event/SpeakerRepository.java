package com.ironhack.lab.repository.event;

import com.ironhack.lab.model.event.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
