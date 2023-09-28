package com.sudeep.security.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sudeep.security.model.FiletoFolderDirectory;
import com.sudeep.security.model.ImageData;
import com.sudeep.security.repository.FiletoFolderRepository;
import com.sudeep.security.repository.ImageDataRepository;
import com.sudeep.security.util.ImageDataUtil;

@Service
public class ImageDataService {

	@Autowired
	ImageDataRepository repo;
	
	@Autowired
	FiletoFolderRepository ffRepo;
	
	final String Path = "/Users/rajasudeepreddyyalla/Desktop/Misc/";

	public String uploadImage(MultipartFile file) throws IOException {

		ImageData imageData = repo.save(ImageData.builder()
				.name(file.getOriginalFilename())
				.type(file.getContentType())
				.imageData(ImageDataUtil.compressByteArray(file.getBytes()))
				.build());

		if (imageData != null) {

			return "File:::: " + file.getOriginalFilename() + " is successfully saved";
		} else {

		}
		return "File:::: " + file.getOriginalFilename() + " is not saved";
	}

	public byte[] findByName(String fileName) {

		Optional<ImageData> imageData = repo.findByName(fileName);

		return ImageDataUtil.decompressByteArray(imageData.get().getImageData());
	}
	
	public String uploadImagetoFileSystem(MultipartFile file) throws IOException {
		
		String FilePath = Path + file.getOriginalFilename();

		FiletoFolderDirectory fileSystemData = ffRepo.save(FiletoFolderDirectory.builder()
				.name(file.getOriginalFilename())
				.type(file.getContentType())
				.folderPath(FilePath)
				.build());
		
		file.transferTo(new File(FilePath));

		if (fileSystemData != null) {

			return "File:::: " + file.getOriginalFilename() + " is successfully saved";
		} else {

		}
		return "File:::: " + file.getOriginalFilename() + " is not saved";
	}
	
	public byte[] findByNameFolderPath(String fileName) throws IOException {

		Optional<FiletoFolderDirectory> imageData = ffRepo.findByName(fileName);
		
		String filePath = imageData.get().getFolderPath();

		byte[] fileBytes = Files.readAllBytes(new File(filePath).toPath());
		
		return fileBytes;
	}

}
