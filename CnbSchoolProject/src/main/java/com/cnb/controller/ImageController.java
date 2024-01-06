package com.cnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cnb.entity.Image;
import com.cnb.model.ImageVo;
import com.cnb.service.IImageService;

@RestController
@RequestMapping("/images-section")
public class ImageController {

	@Autowired
	private IImageService imageService;

	@PostMapping("/image")
	public ResponseEntity<?> uplaodImage(@RequestParam("image") MultipartFile file,
			@RequestParam("imageCategory") String imageCategory,
			@RequestParam("imageDescription") String imageDescription) {
		
		ImageVo imageVo = new ImageVo();
		imageVo.setImageName(file.getOriginalFilename());
		imageVo.setImageCategory(imageCategory);
		imageVo.setImageDescription(imageDescription);
		imageVo.setImageFile(file);
		imageVo = imageService.uploadImage(imageVo);
		return ResponseEntity.ok(imageVo.getImageName());
	}
	
	@GetMapping(value="/image/{id}",produces=MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<?> getImage(@PathVariable("id") Long id){
		return ResponseEntity.ok(imageService.getImage(id));
	}
	@GetMapping(value = "/images")
	public ResponseEntity<?> getImages(){
		 final String hostUrl= ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
		return ResponseEntity.ok(imageService.getImages(hostUrl));
	}
}
