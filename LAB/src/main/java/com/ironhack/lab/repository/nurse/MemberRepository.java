package com.ironhack.lab.repository.nurse;

import com.ironhack.lab.model.nurse.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
