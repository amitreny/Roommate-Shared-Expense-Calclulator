package com.example.demo.roomates;


import com.example.demo.sharedexp.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoommatesService {

    private final RoommatesRepository roommatesRepository;

    @Autowired
    public RoommatesService(RoommatesRepository roommatesRepository) {
        this.roommatesRepository = roommatesRepository;
    }

    public List<Share> getRoommates() {
        return roommatesRepository.findAll();
    }
}
