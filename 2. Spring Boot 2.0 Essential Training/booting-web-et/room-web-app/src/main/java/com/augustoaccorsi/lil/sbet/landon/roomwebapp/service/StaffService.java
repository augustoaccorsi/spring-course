package com.augustoaccorsi.lil.sbet.landon.roomwebapp.service;

import com.augustoaccorsi.lil.sbet.landon.roomwebapp.models.Position;
import com.augustoaccorsi.lil.sbet.landon.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<Staff> staff = new ArrayList<>();

    static{
        staff.add(new Staff(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
        staff.add(new Staff(UUID.randomUUID().toString(), "Jane", "Doe", Position.FRONT_DESK));
        staff.add(new Staff(UUID.randomUUID().toString(), "Oliver", "Handle", Position.SECURITY));
        staff.add(new Staff(UUID.randomUUID().toString(), "Sammy", "Smith", Position.HOUSEKEEPING));
    }

    public List<Staff> getAllStaff(){
        return staff;
    }
}
