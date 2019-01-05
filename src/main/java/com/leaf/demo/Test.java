package com.leaf.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

@SuppressWarnings("all")
public class Test {

	public static void main(String[] args) throws Exception {
		//创建配置对象
		Configuration config = new Configuration(Configuration.getVersion());
		//2。设置模板所在目录
		config.setDirectoryForTemplateLoading(new File("M:\\workspace\\java\\pinyougoumall\\freemarkerDemo\\src\\main\\resources"));
		//3、设置字符集
		config.setDefaultEncoding("utf-8");
		//获取模板对象
		Template template = config.getTemplate("test.ftl");
		//创建数据模型 对象和Map都行
		Map map = new HashMap<>();
		map.put("name", "张三");
		map.put("message", "Hello World");
		map.put("success", false);
		
		List goodsList=new ArrayList();
		Map goods1=new HashMap();
		goods1.put("name", "苹果");
		goods1.put("price", 5.8);
		Map goods2=new HashMap();
		goods2.put("name", "香蕉");
		goods2.put("price", 2.5);
		Map goods3=new HashMap();
		goods3.put("name", "橘子");
		goods3.put("price", 3.2);
		goodsList.add(goods1);
		goodsList.add(goods2);
		goodsList.add(goods3);
		map.put("goodsList", goodsList);

		map.put("today", new Date());
		
		map.put("point", 102920122);
		
		map.put("aaa", 231);
		
		
		Writer out= new FileWriter("d:/temp/demo.html");
		template.process(map, out);
		out.close();
		
		
	}
}
