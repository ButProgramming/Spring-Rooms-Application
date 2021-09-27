package com.mycompany.app;

import com.mycompany.app.room.Room;
import com.mycompany.app.room.RoomRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RoomRepositoryTests {
    @Autowired
    private RoomRepository repo;

    @Test
    public void testAddNew() {

        Room room = new Room();
        room.setName("12345");
        room.setCountry("Belarus");
        room.setEnabled(true);
        Room savedRoom = repo.save(room);

        Assertions.assertThat(savedRoom).isNotNull();
        Assertions.assertThat(savedRoom.getId()).isGreaterThan(0);

    }

    @Test
    public void testListAll() {

        Iterable<Room> rooms = repo.findAll();
        Assertions.assertThat(rooms).hasSizeGreaterThan(0);

        for (Room room : rooms) {
            System.out.println(room);
        }

    }

    @Test
    public void testGet() {

        Integer roomId = 1;
        Optional<Room> optionalRoom = repo.findById(roomId);
        Assertions.assertThat(optionalRoom).isPresent();
        System.out.println(optionalRoom.get());

    }

}
