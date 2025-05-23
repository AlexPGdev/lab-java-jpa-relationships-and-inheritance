package com.ironhack.lab.demo.nurse;

import com.ironhack.lab.model.enums.MemberStatus;
import com.ironhack.lab.model.nurse.Association;
import com.ironhack.lab.model.nurse.Division;
import com.ironhack.lab.model.nurse.Member;
import com.ironhack.lab.repository.nurse.AssociationRepository;
import com.ironhack.lab.repository.nurse.DivisionRepository;
import com.ironhack.lab.repository.nurse.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@Profile("dev")
public class DataLoader implements CommandLineRunner {

    private final AssociationRepository associationRepository;
    private final DivisionRepository divisionRepository;
    private final MemberRepository memberRepository;

    public DataLoader(AssociationRepository associationRepository, DivisionRepository divisionRepository, MemberRepository memberRepository) {
        this.associationRepository = associationRepository;
        this.divisionRepository = divisionRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(String... args) {

        System.out.println("Loading data...");

        Association association = new Association();
        association.setName("Nurse Association of Spain");
        association.setDivisions(List.of());

        associationRepository.save(association);

        divisionRepository.save(new Division("Madrid Central", "Madrid", "Ana", null, association));
        divisionRepository.save(new Division("Northern Hills", "Basque Country", "Marta", null, association));
        divisionRepository.save(new Division("Southern Health", "Andalusia", "Lucia", null, association));
        divisionRepository.save(new Division("Valencia Vital", "Valencia", "Laura", null, association));
        divisionRepository.save(new Division("Western Care", "Extremadura", "Carmen", null, association));
        divisionRepository.save(new Division("Catalonia Core", "Catalonia", "Sara", null, association));
        divisionRepository.save(new Division("Galicia Green", "Galicia", "Patricia", null, association));

        Member alice = new Member("Alice Fernandez", MemberStatus.ACTIVE, LocalDate.of(2025, 1, 10), null);
        Member bob = new Member("Bob Martinez", MemberStatus.LAPSED, LocalDate.of(2023, 12, 1), null);
        Member clara = new Member("Clara Ruiz", MemberStatus.ACTIVE, LocalDate.of(2025, 4, 15), null);
        Member dan = new Member("Dan Sanchez", MemberStatus.ACTIVE, LocalDate.of(2025, 4, 15), null);
        Member eli = new Member("Eli Fernandez", MemberStatus.ACTIVE, LocalDate.of(2025, 4, 15), null);
        Member fran = new Member("Fran Fernandez", MemberStatus.ACTIVE, LocalDate.of(2025, 4, 15), null);
        Member george = new Member("George Fernandez", MemberStatus.ACTIVE, LocalDate.of(2025, 4, 15), null);

        alice.setDivision(divisionRepository.findById(1L).get());
        bob.setDivision(divisionRepository.findById(2L).get());
        clara.setDivision(divisionRepository.findById(3L).get());
        dan.setDivision(divisionRepository.findById(4L).get());
        eli.setDivision(divisionRepository.findById(5L).get());
        fran.setDivision(divisionRepository.findById(6L).get());
        george.setDivision(divisionRepository.findById(7L).get());

        memberRepository.saveAll(List.of(alice, bob, clara, dan, eli, fran, george));

        System.out.println("Data loaded successfully");
    }
}

