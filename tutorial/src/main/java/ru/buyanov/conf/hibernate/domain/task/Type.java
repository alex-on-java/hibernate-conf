package ru.buyanov.conf.hibernate.domain.task;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author A.Buyanov 02.04.2017.
 */
@Entity
@Data
public class Type {
    @Id
    @GeneratedValue
    int id;

    String name;

}
