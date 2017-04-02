package ru.buyanov.conf.hibernate.domain.task;

import lombok.Data;
import ru.buyanov.conf.hibernate.domain.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author A.Buyanov 02.04.2017.
 */
@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue
    int id;

    String text;

    @ManyToOne
    User author;

    @ManyToOne
    Task task;
}
