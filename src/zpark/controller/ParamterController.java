package zpark.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zpark.entity.BeanVO;
import zpark.entity.CollectionVO;
import zpark.entity.Order;
import zpark.entity.User;


/**
 * 主要用于测试参数的接受
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/param")
public class ParamterController {

/*	@InitBinder
	public void intiBinder(WebDataBinder binder){
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");	
		//第一参数指定类型,第二个参数(第一个参数指定日期的格式,第二个参数指定是否可以为空)
		binder.registerCustomEditor(Date.class,new CustomDateEditor(simpleDateFormat, true));
		
	}已经在参数绑定器中处理了*/
	
	
	/**
	 * 从前台接受基本类型参数
	 * 注意:
	 *    直接在方法的声明中加入想要的接受的参数,方法的参数声明为不定长
	 *    value=""          给参数起别名
	 *    defaultValue=""   当参数为空时,给参数设置默认值
	 *    required=true     boolean类型  值为true	代表次参数必须传递	默认     false 可传可不传
	 */
	@RequestMapping("/test")
	public String test(@RequestParam(defaultValue="1",required=true,value="cid") String id,String name){
		System.out.println(id);
		System.out.println(name);
		return "back/param";
	}
	
	/**
	 * 接受String类型的参数
	 */
	@RequestMapping("/test1")
	public String test1(User user,Order order){
		System.out.println(user);
		System.out.println("------------我是分割线----------");
		System.out.println(order);
		return "/index";
	}
	
	/**
	 * 接受String类型的参数
	 * 如果出现属性相同时用BeanVO处理
	 * 属性用user.id   order.id
	 */
	@RequestMapping("/test11")
	public String test11(BeanVO beanVO){
		System.out.println(beanVO.getUser());
		System.out.println("------------我是分割线----------");
		System.out.println(beanVO.getOrder());
		return "/index";
	}
	
	/**
	 * 接受日期类型的参数
	 */
	@RequestMapping("/test2")
	public String test2(Date birthday){
		System.out.println(birthday);
		return "/index";
		
	}
	
	/**
	 * 接受数组类型的参数
	 */
	@RequestMapping("/test3")
	public String test3(String[] str){
		for (String string : str) {
			System.out.println(string);
		}
		return "/index";
	}
	
	/**
	 * List,Set集合类型的参数
	 * 注意:
	 * 		springmvc不支持集合类型参数的接收,非要使用集合接收参数需要封装一下
	 * 		如:
	 * 		ListVO  list get/set
	 */
	@RequestMapping("/test4")
	public String test4(CollectionVO collectionVO){
		for (String string : collectionVO.getList()) {
			System.out.println(string);
		}
		return "/index";
	}
	
	/**
	 * List集合接收对象类型参数
	 */
	@RequestMapping("/test5")
	public String test5(CollectionVO collectionVO){
		for (User user : collectionVO.getUsers()) {
			System.out.println(user);
		}
		return "/index";
	}
	
	/**
	 * Map<Integer,String>类型参数
	 */
	@RequestMapping("/test6")
	public String test6(CollectionVO vo){
		Map<String,Integer> maps = vo.getMaps();
		for (Map.Entry<String,Integer> map : maps.entrySet()) {
			System.out.println(map.getKey()+"------"+map.getValue());
		}
		return "/index";
	}
	
	/**
	 * Map<Integer,User> 的参数传递
	 */
	@RequestMapping("/test7")
	public String test7(CollectionVO vo){
		Map<Integer, User> maps = vo.getMapss();
		for (Map.Entry<Integer, User> map : maps.entrySet()) {
			System.out.println(map.getKey()+"------"+map.getValue());
		}
		return "/index";
	}
	
	
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
