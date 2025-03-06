package com.codeqube.springjparelationships.models;

import jakarta.persistence.*;

@Entity
public class SocialPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private SocialUser socialUser;
}
