package com.codeqube.springjparelationships.repositories;

import com.codeqube.springjparelationships.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfileRepository extends JpaRepository<SocialProfile, Long>  {
}
