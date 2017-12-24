package de.vogella.jpa.eclipselink.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String description;

    @OneToMany(mappedBy = "family")
    private final List<Person> members = new ArrayList<Person>();


    public List<Person> getMembers() {
        return members;
    }

}