package com.cnb.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadFileHelper {

	public String uploadFile(MultipartFile file, String filename, String uploadDir) {
		Boolean flag = false;
		String path = uploadDir + File.separator + file.getOriginalFilename();
		try {
			long result = Files.copy(file.getInputStream(), Paths.get(path), StandardCopyOption.REPLACE_EXISTING);
			flag = true;
		} catch (IOException e) {

			e.printStackTrace();
		}
		if (flag)
			return path;
		return "Exception occured while coping the file";
	}

	public byte[] getImageByPath(String path) {
		byte[] bytesFile = null;
		try {
			 bytesFile =  Files.readAllBytes(Paths.get(path));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		return bytesFile;
	}
}
