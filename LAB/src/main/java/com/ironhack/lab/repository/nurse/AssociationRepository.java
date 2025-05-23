package com.ironhack.lab.repository.nurse;

import com.ironhack.lab.model.nurse.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepository extends JpaRepository<Association, Long> {
}
