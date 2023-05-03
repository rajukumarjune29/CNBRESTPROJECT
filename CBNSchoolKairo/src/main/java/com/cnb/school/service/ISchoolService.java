package com.cnb.school.service;

import java.util.List;

import com.cnb.school.bean.ImageBean;
import com.cnb.school.model.Image;

public interface ISchoolService {
	
	public String uploadImage(ImageBean imageBean);

	public List<Image> fetchImages();

}
