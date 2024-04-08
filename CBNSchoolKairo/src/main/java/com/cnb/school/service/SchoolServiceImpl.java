package com.cnb.school.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cnb.school.bean.ImageBean;
import com.cnb.school.model.Image;
import com.cnb.school.repository.ISchoolRepo;
import com.cnb.util.UploadFileHelper;

@Service
public class SchoolServiceImpl implements ISchoolService {

	@Autowired
	private UploadFileHelper uploadFileHelper;
	@Autowired
	private ISchoolRepo schoolRepo;

	@Override
	public String uploadImage(ImageBean imageBean) {

		String uploadDir = "C:\\Users\\HP\\Documents\\image";

		String result = uploadFileHelper.uploadFile(imageBean.getImageFile(), imageBean.getImageName(), uploadDir);
		if (!result.equalsIgnoreCase("Exception occured while coping the file")) {

			Image image = new Image();
			image.setImageName(imageBean.getImageName());
			image.setImageDescription(imageBean.getImageDescription());
			image.setImageTitle(imageBean.getImageTitle());
			image.setImageUrl(result);
			Image resultImage = schoolRepo.save(image);
			return resultImage.getImageName() + "is uploaded successfully with Image id " + resultImage.getImageId();
		} else {
			return result;
		}

	}

	@Override
	public List<Image> fetchImages() {

		List<Image> images = schoolRepo.findAll();
		;
		images = images.stream().map(image -> {
			image.setImageUrl(
					ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(image.getImageId().toString()).toUriString());
			return image;
		}).collect(Collectors.toList());
		return images;
	}

}
