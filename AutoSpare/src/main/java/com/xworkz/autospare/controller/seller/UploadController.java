package com.xworkz.autospare.controller.seller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class UploadController {
	@PostMapping("/upload")
	public String uploadImage(@RequestParam("file") MultipartFile partFile,Model model) throws IOException {
		
		String filePath = "D:\\project_images";//dynamically generate // temp file
		Path path = Paths.get(filePath);

		if(!partFile.isEmpty()) {
			//save 
			//logic 
			String saveFileName = partFile.getOriginalFilename();
			System.out.println(saveFileName);
			byte[] imageBytes= partFile.getBytes();
			System.out.println(imageBytes);
            String sanitizedFileName = saveFileName.replaceAll("[^a-zA-Z0-9.-]", "");
            Path filePath1 = path.resolve(sanitizedFileName);
			Files.write(filePath1, imageBytes);
		}
		return "index";
	}

}
