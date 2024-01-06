package com.cnb.model;

import org.springframework.web.multipart.MultipartFile;

public class ImageResponseVo {
	private String imageName;
	private String imageDescription;
	private String ImageUrl;
	private String imageCategory;
	public ImageResponseVo() {
		super();
	}
	public ImageResponseVo(String imageName, String imageDescription, String imageUrl, String imageCategory) {
		super();
		this.imageName = imageName;
		this.imageDescription = imageDescription;
		ImageUrl = imageUrl;
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
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public String getImageCategory() {
		return imageCategory;
	}
	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
	}
	@Override
	public String toString() {
		return "ImageResponseVo [imageName=" + imageName + ", imageDescription=" + imageDescription + ", ImageUrl="
				+ ImageUrl + ", imageCategory=" + imageCategory + "]";
	}
	
	
}
