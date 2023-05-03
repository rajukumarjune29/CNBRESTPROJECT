package com.cnb.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cnb.school.bean.ImageBean;
import com.cnb.school.model.Image;
import com.cnb.school.service.ISchoolService;


@RestController
@RequestMapping("/school-module")
public class SchoolController {

	@Autowired
	private ISchoolService schoolService;
	@PostMapping("/upload-image")
	public ResponseEntity<?> uploadImage(@RequestParam("imageFile") MultipartFile imageFile,
			@RequestParam("imageName") String imageName, @RequestParam("imageDescription") String imageDescription,
			@RequestParam("imageTitle") String imageTitle) {
		ImageBean image = new ImageBean();
		image.setImageName(imageName);
		image.setImageDescription(imageDescription);
		image.setImageTitle(imageTitle);
		image.setImageFile(imageFile);
		String result =schoolService.uploadImage(image);
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
	
	@GetMapping("/images")
	public ResponseEntity<?> fetchImages() {
		List<Image> images=schoolService.fetchImages();
		
		return new ResponseEntity<List<Image>>(images,HttpStatus.OK);
		
	}
}
