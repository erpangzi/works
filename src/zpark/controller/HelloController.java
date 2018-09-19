package zpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Administrator
 *	@Controller 加在类上表示这个类是一个控制器
 *	@RequestMapping("/hello")加在类上的这个注解相当于struts2中的namespace
 */
	@Controller
	@RequestMapping("/hello")
	public class HelloController {
	
	/**
	 * @RequestMapping 加在方法上代表方法的访问路径
	 */
	@RequestMapping("/test")
	public String test(){
		
		System.out.println("test invokeing---");
		return "index";   //经过视图解析器=/index.jsp
	}
	
	@RequestMapping(value={"/test1","/testn","/aaa"})
	public String test1(){
		System.out.println("test1 invoking");
		return "index";
	}
	
	/**
	 * 如果在方法的@RequestMapping中加入method属性,此方法	只能被method属性中声明的提交方式访问
	 * 如果没有声明method属性默认所有方式都能访问 
	 */
	@RequestMapping(value="/test2",method={RequestMethod.POST})
	public void test2(){
		
		System.out.println("test2............");
		
	}
	
	
}
