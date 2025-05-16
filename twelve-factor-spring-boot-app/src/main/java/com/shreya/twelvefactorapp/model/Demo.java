package com.shreya.twelvefactorapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Demo {
    @Id
    private int id;
    private String name;
}
