package com.ironhack.lab.model.nurse;

import com.ironhack.lab.model.enums.MemberStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    private LocalDate renewalDate;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    public Member() {
    }

    public Member(String name, MemberStatus status, LocalDate renewalDate, Division division) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.division = division;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

}
