package zpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forwardAndRedirect")
public class ForwordAndRedirectController {

	/**
	 * 使用forward跳转到页面
	 */
	@RequestMapping("/test")
	public String test(){
		System.out.println("test----");
		return "index";
	}
	
	/**
	 * 使用redirect跳转到页面
	 * 如:redirect:/index.jsp
	 */
	@RequestMapping("/test1")
	public String test1(){
		System.out.println("test1----");
		return "redirect:/index.jsp";
	}
	
	/**
	 * 使用forward跳转到相同的controller中的方法
	 * 如:1.forward:test
	 *   2.forward:/forwardAndRedirect/test
	 */
	@RequestMapping("/test2")
	public String test2(){
		System.out.println("test2---");
		return "forward:/forwardAndRedirect/test";
	}
	
	/**
	 * 
	 * 
	 */
	@RequestMapping("/test3")
	public String test3(){
		System.out.println("test3---");
		return "redirect:/forwardAndRedirect/test2";
	}
	
}
