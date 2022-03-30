package com.fanch.PlaneApi.Repository;

import com.fanch.PlaneApi.models.Motorization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorizationRepository extends JpaRepository<Motorization, Long> {
}
