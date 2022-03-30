package com.fanch.PlaneApi.Repository;

import com.fanch.PlaneApi.models.Faction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactionRepository extends JpaRepository<Faction, Long> {
}
