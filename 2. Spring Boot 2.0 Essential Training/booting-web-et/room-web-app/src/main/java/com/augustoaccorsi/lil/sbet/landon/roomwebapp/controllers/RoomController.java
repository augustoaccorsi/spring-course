package com.augustoaccorsi.lil.sbet.landon.roomwebapp.controllers;

import com.augustoaccorsi.lil.sbet.landon.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
