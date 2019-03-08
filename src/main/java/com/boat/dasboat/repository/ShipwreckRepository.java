package com.boat.dasboat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.dasboat.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
