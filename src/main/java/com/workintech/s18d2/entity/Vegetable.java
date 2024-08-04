package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vegetable", schema = "fsweb")
public class Vegetable extends Plant{

    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;
}
