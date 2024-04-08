package com.cnb.school.bean;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ImageBean {
	
	private Integer imageId;
	private String imageName;
	private String imageUrl;
	private String imageDescription;
	private String imageTitle;
	private MultipartFile imageFile;
}
