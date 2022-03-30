package com.fanch.PlaneApi.Repository;

import com.fanch.PlaneApi.models.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
}
