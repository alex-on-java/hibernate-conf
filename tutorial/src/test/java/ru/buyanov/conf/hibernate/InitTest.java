package ru.buyanov.conf.hibernate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import ru.buyanov.conf.hibernate.domain.Sprint;

/**
 * @author A.Buyanov 02.04.2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class InitTest {
    @Autowired
    private TestEntityManager entityManager;


    @Before
    public void startUp() {

    }

    @Test
    public void init() {
        // just check that all entities are doing good
    }
}
