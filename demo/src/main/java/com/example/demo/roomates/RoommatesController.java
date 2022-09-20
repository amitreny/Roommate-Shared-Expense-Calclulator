package com.example.demo.roomates;


import com.example.demo.sharedexp.Share;
import com.example.demo.sharedexp.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/roommates")
public class RoommatesController {

    private final RoommatesService roommatesService;

    @Autowired
    public RoommatesController(RoommatesService roommatesService) {
        this.roommatesService = roommatesService;
    }

    @GetMapping
    public List<Share> getShares() {
        return roommatesService.getRoommates();
    }
}
