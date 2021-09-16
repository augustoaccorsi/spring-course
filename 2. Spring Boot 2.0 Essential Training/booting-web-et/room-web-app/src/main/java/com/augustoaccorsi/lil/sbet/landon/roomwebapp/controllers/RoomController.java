package com.augustoaccorsi.lil.sbet.landon.roomwebapp.controllers;

import com.augustoaccorsi.lil.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private static final List<Room> rooms = new ArrayList<>();
    static {
        for(int i=0; i<10; i++){
            rooms.add(new Room(i, "Room"+1, "R"+1, "Q"));
        }
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}
