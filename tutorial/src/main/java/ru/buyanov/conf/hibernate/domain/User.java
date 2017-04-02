package ru.buyanov.conf.hibernate.domain;

import lombok.Data;
import ru.buyanov.conf.hibernate.domain.task.Status;
import ru.buyanov.conf.hibernate.domain.task.Task;
import ru.buyanov.conf.hibernate.domain.task.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author A.Buyanov 02.04.2017.
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    int id;

    String name;

    @OneToMany
    Set<Task> tasks;

    @ManyToMany
    Set<Status> allowedStatuses;

    @ManyToMany
    Set<Type> allowedTypes;

}
