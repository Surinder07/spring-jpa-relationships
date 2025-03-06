package com.codeqube.springjparelationships.repositories;

import com.codeqube.springjparelationships.models.SocialPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialPostRepository extends JpaRepository<SocialPost, Long> {
}
