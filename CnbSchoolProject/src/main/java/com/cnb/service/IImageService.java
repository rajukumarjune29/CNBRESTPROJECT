package com.cnb.service;

import java.util.List;

import com.cnb.entity.Image;
import com.cnb.model.ImageResponseVo;
import com.cnb.model.ImageVo;

public interface IImageService {

	public ImageVo uploadImage(ImageVo imageVo);
	public byte[] getImage(Long id);
	public List<ImageResponseVo> getImages(String hostUrl);
}
