package com.mindtree.gooddeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.gooddeed.entity.Superviser;

@Repository
public interface SuperviserRepository  extends JpaRepository<Superviser,Integer>{

}
