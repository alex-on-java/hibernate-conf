package ru.buyanov.conf.hibernate.domain.task;

import lombok.Data;
import ru.buyanov.conf.hibernate.domain.Project;
import ru.buyanov.conf.hibernate.domain.Sprint;
import ru.buyanov.conf.hibernate.domain.User;

import javax.persistence.*;
import java.util.List;

/**
 * @author A.Buyanov 02.04.2017.
 */
@Entity
@Data
public class Task {
    @Id
    @GeneratedValue
    int id;

    String name;

    @ManyToOne
    Project project;

    @ManyToOne
    User creator;

    @ManyToOne
    User assignee;

    @ManyToOne
    Sprint sprint;

    @ManyToOne
    Type type;

    @ManyToOne
    Status status;

    @ManyToOne
    Priority priority;

    @OneToMany
    List<Comment> comments;
}
