package com.cnb.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cnb.entity.Image;
import com.cnb.model.ImageResponseVo;
import com.cnb.model.ImageVo;
import com.cnb.repository.IImageRepository;

@Service
public class ImageServiceImpl implements IImageService {

	@Autowired
	private IImageRepository imageRepo;

	@Value("${IMAGE_UPLOAD_PATH}")
	private String imageRootPath;
	
	@Override
	public ImageVo uploadImage(ImageVo imageVo) {

		imageRootPath = imageRootPath.replace("âª", "");
		File file = new File(imageRootPath + File.separator + imageVo.getImageFile().getOriginalFilename());
		try {
			imageVo.getImageFile().transferTo(file);
		} catch (IllegalStateException | IOException e) {

			e.printStackTrace();
		}
		Image image = new Image();
		image.setImageName(imageVo.getImageName());
		image.setImageCategory(imageVo.getImageCategory());
		image.setImageDescription(imageVo.getImageDescription());
		image.setImageFilePath(imageRootPath + File.separator + imageVo.getImageFile().getOriginalFilename());
		imageRepo.save(image);
		return imageVo;
	}

	@Override
	public byte[] getImage(Long id) {
		Optional<Image> image = imageRepo.findById(id);
		String path = image.get().getImageFilePath();
		byte[] imageArray = null;
		try {
			imageArray = Files.readAllBytes(Path.of(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imageArray;
	}

	@Override
	public List<ImageResponseVo> getImages(String hostUrl) {
		List<Image> images = imageRepo.findAll();
		List<ImageResponseVo> imageListRes = new ArrayList<>();
		
		try {
			for (Image image : images) {
				ImageResponseVo imageResponseVo=new ImageResponseVo(image.getImageName(),image.getImageDescription(),hostUrl+"/images-section/image/"+image.getImageId(),image.getImageCategory());
				imageListRes.add(imageResponseVo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return imageListRes;
	}

}
