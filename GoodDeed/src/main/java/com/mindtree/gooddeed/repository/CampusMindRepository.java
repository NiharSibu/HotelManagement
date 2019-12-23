package com.mindtree.gooddeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.gooddeed.entity.CampusMind;

@Repository
public interface CampusMindRepository extends JpaRepository<CampusMind,Integer> {

}
