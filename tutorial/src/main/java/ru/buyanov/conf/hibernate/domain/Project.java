package ru.buyanov.conf.hibernate.domain;

import lombok.Data;
import ru.buyanov.conf.hibernate.domain.task.Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author A.Buyanov 02.04.2017.
 */
@Entity
@Data
public class Project {
    @Id
    @GeneratedValue
    int id;

    String name;

    @OneToMany
    List<Task> tasks;
}
