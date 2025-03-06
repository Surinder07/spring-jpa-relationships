package com.codeqube.springjparelationships.repositories;

import com.codeqube.springjparelationships.models.SocialGroup;
import com.codeqube.springjparelationships.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialGroupRepository extends JpaRepository<SocialGroup, Long> {
}
