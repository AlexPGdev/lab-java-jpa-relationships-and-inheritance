package com.ironhack.lab.repository.nurse;

import com.ironhack.lab.model.nurse.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Long> {
}
