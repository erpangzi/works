package zpark.controller;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.sun.org.apache.bcel.internal.generic.NEW;


@Controller
@RequestMapping("/upload")
public class UploadController {

	@RequestMapping("/upload")
	public String upload(MultipartFile aaa){
		
		System.out.println(aaa.getName());
		System.out.println(aaa.getOriginalFilename());
		try {
			//aaa.getName()    aaa
			//aaa.getOriginalFilename()    1BEF4D4D39670FFE04E1788387AE54A8.jpg
			aaa.transferTo(new File("D:\\",aaa.getOriginalFilename()));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		return "index";
	}
	
	@RequestMapping("/upload1")
	public String upload1(MultipartFile aaa,HttpServletRequest request){
		
		System.out.println(aaa.getName());
		System.out.println(aaa.getOriginalFilename());
		//getRealPath()  返回一个字符串,其中包含真正的路径为一个给定的虚拟路径。
		try {
			//aaa.getName()    aaa	
			//aaa.getOriginalFilename()    1BEF4D4D39670FFE04E1788387AE54A8.jpg
			String filename = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + 
							  UUID.randomUUID().toString().replace("-", "") + 
							  FilenameUtils.getExtension(aaa.getOriginalFilename());
			String realPath = request.getSession().getServletContext().getRealPath("/img/");
			System.out.println(realPath);
//			aaa.transferTo(new File(realPath,aaa.getOriginalFilename()));
//			request.setAttribute("path", "/img/" + aaa.getOriginalFilename());
			aaa.transferTo(new File(realPath,filename));
			request.setAttribute("path", "/img/" + filename);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		return "index";
	}
	
	
	
}
