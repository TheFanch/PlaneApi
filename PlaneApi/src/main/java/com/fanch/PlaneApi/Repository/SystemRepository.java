package com.fanch.PlaneApi.Repository;

import com.fanch.PlaneApi.models.System;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemRepository extends JpaRepository<System, Long> {
}
