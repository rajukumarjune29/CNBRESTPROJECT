package com.cnb.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class ImageVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String imageName;
	private String imageDescription;
	private MultipartFile ImageFile;
	private String imageCategory;
	
	
	public ImageVo() {
		super();
	}


	public ImageVo(String imageName, String imageDescription, MultipartFile imageFile, String imageCategory) {
		super();
		this.imageName = imageName;
		this.imageDescription = imageDescription;
		ImageFile = imageFile;
		this.imageCategory = imageCategory;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getImageDescription() {
		return imageDescription;
	}


	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}


	public MultipartFile getImageFile() {
		return ImageFile;
	}


	public void setImageFile(MultipartFile imageFile) {
		ImageFile = imageFile;
	}


	public String getImageCategory() {
		return imageCategory;
	}


	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
	}


	@Override
	public String toString() {
		return "ImageVo [imageName=" + imageName + ", imageDescription=" + imageDescription + ", ImageFile=" + ImageFile
				+ ", imageCategory=" + imageCategory + "]";
	}
	
	

}
