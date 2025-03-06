package com.codeqube.springjparelationships.service;

import com.codeqube.springjparelationships.models.SocialUser;
import com.codeqube.springjparelationships.repositories.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {

    @Autowired
    private SocialUserRepository socialUserRepository;


    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    public SocialUser saveUsers(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }
}
