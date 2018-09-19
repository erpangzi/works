package zpark.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/attr")
public class AttributeController {

	/**
	 * 使用forward跳转servlet原始API向页面传递数据
	 * 1.使用request对象
	 */
	@RequestMapping("/test")
	public String test(HttpServletRequest request,HttpServletResponse response){
		String name = "张三";
		request.setAttribute("name", name);
		return "/back/attr";
	}
	
	/**
	 * forword跳转使用spring提供的model对象
	 * 2.model对象类似于request作用域(作用域范围也一样)
	 */
	@RequestMapping("/test1")
	public String test1(Model model){
		String name = "zhangxiao";
		List<String> asList = Arrays.asList("xiaosan","xiaosi","xiaowu");
		model.addAttribute("list", asList);
		model.addAttribute("name",name);
		return "/back/attr";
	}
	
	/**
	 * spring提供了一种声明方式
	 * modelandview与request,model一致
	 * 注意:必须声明setViewName,且只能在本页面取值
	 */
	@RequestMapping("/test2")
	public ModelAndView test2(ModelAndView modelAndView){
		modelAndView.addObject("name","张三");//赋值
		modelAndView.setViewName("back/attr");//跳转页面
		return modelAndView;
	}
	@RequestMapping("/test3")
	public ModelAndView test3(){
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("name","张三");//赋值
//		modelAndView.setViewName("back/attr");//跳转页面
		//调用构造方法
		ModelAndView modelAndView = new ModelAndView("back/attr","name","张三");
		return modelAndView;
	}
	
	/**
	 * 使用redirect跳转向页面传递参数
	 * 使用原始的servlet的API,Session,servletContext,Application
	 */
	@RequestMapping("/test4")
	public String test4(HttpSession session){
		
		String name = "呵呵";
		session.setAttribute("name", name);
		return "redirect:/back/attr.jsp";
	}
	
	
	
}
