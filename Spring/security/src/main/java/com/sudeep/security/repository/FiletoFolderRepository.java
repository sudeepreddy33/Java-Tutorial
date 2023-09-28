package com.sudeep.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudeep.security.model.FiletoFolderDirectory;

@Repository
public interface FiletoFolderRepository  extends JpaRepository<FiletoFolderDirectory, Integer>{

	Optional<FiletoFolderDirectory> findByName(String fileName);
}
