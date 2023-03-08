package com.example.springbootwithImage.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    ImageRepositoryNew imageRepository;

    public Image saveImage(MultipartFile file) throws IOException {

        Image image = new Image();
        image.setName(file.getOriginalFilename());
        image.setData(file.getBytes());
        return imageRepository.save(image);
    }

    public Image getImage(Long id) {
        Optional<Image> image = imageRepository.findById(id);
        return image.orElse(null);
    }

    // other methods for image handling (e.g. deletion, listing)
}