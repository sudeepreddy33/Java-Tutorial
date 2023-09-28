package com.sudeep.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudeep.security.model.ImageData;

@Repository
public interface ImageDataRepository  extends JpaRepository<ImageData, Integer>{

	Optional<ImageData> findByName(String fileName);
}
