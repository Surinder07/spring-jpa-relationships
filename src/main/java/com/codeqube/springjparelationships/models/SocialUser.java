package com.codeqube.springjparelationships.models;

import jakarta.persistence.*;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "socialProfile")
    @JoinColumn(name = "social_profile_id")
    private SocialProfile socialProfile;
}
