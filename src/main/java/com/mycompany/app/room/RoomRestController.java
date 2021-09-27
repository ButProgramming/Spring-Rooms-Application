package com.mycompany.app.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomRestController {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/get_rooms")
    public List<Room> getRoom() {
        List<Room> roomList = new ArrayList<>();
        roomRepository.findAll().forEach(it -> roomList.add(it));
        return roomList;
    }

}
