package com.cnb.school.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer imageId;
	private String imageName;
	private String imageUrl;
	private String imageDescription;
	private String imageTitle;	
}
