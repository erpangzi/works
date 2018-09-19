package zpark.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

public class CustomerDataEditor implements PropertyEditorRegistrar{

	public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//参数1  数据类型 , 参数2 数据格式  
		propertyEditorRegistry.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));	
		
	}

	
	
}
