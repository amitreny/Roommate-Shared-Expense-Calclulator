package com.example.demo.sharedexp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareService {

    private final ShareRepository shareRepository;

    @Autowired
    public ShareService(ShareRepository shareRepository) {
        this.shareRepository = shareRepository;
    }

    public List<Share> getShares() {
        return shareRepository.findAll();
    }
}
