package com.codeqube.springjparelationships.repositories;

import com.codeqube.springjparelationships.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepository extends JpaRepository<SocialUser, Long> {
}
