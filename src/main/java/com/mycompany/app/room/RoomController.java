package com.mycompany.app.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class RoomController {

    @Autowired
    private RoomService service;

    @GetMapping("/")
    public String showRoomList(Model model) {

        List<Room> listRooms = service.listAll();
        model.addAttribute("listRooms", listRooms);

        return "index";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {

        model.addAttribute("room", new Room());
        model.addAttribute("pageTitle", "Add new room");
        List<String> countries = service.getCountries();
        model.addAttribute("countries", countries);

        return "room_form";
    }

    @PostMapping("/save")
    public String saveRoom(Room room, RedirectAttributes ra) {

        service.save(room);
        ra.addFlashAttribute("message", "The room has been saved successfully.");

        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateRoom(@PathVariable("id") Integer id, @RequestBody String enabledStr, RedirectAttributes ra) {

        System.out.println("/update/{id}");
        boolean enabled = Boolean.parseBoolean(enabledStr);
        service.update(id, enabled);
        ra.addFlashAttribute("message", "The room has been saved successfully.");

        return "redirect:/";
    }

    @GetMapping("/room/{id}")
    public String showRoom(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {

            System.out.println("/room/{id}");
            Room room = service.get(id);
            model.addAttribute("room", room);
            model.addAttribute("nameOfRoom", room.getName());

            return "room";
        } catch (RoomNotFoundException e) {

            System.out.println("/room/{id} catch");
            ra.addFlashAttribute("message", e.getMessage());

            return "redirect:/";
        }
    }


}

