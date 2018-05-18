package gson;

import java.lang.reflect.Field;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import bean.Diaosi;

public class GsonCreateSample {
	public static void main(String[] args) {
		Diaosi wangxiaoer = new Diaosi();

		wangxiaoer.setName("王小二");
		wangxiaoer.setAge(25.3);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("蓝翔");
		wangxiaoer.setMajor(new String[] { "理发", "挖掘机" });
		wangxiaoer.setHas_girlfirend(false);
		wangxiaoer.setCar(false);
		wangxiaoer.setHouse(false);
		wangxiaoer.setComment("这是一个注释");
		wangxiaoer.setIgnore("不要看见我");

		// 1、添加SerializedName()注解，改变json key
		// Gson gson = new Gson();
		// System.out.println(gson.toJson(wangxiaoer));

		// 2、输入内容美观，用于调试
		// GsonBuilder gsonBuilder = new GsonBuilder();
		// gsonBuilder.setPrettyPrinting();
		// Gson gson = gsonBuilder.create();
		// System.out.println(gson.toJson(wangxiaoer));

		// 3、解析时，使用回调函数，做一些额外、更加复杂的事情
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {

			// 这里定做自己的策略
			public String translateName(Field f) {
				// TODO 自动生成的方法存根
				if (f.getName().equals("age")) {
					return "AGE";
				}
				return f.getName();
			}
		});
		Gson gson = gsonBuilder.create();
		System.out.println(gson.toJson(wangxiaoer));

	}
}
