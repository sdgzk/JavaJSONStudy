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

		wangxiaoer.setName("��С��");
		wangxiaoer.setAge(25.3);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("����");
		wangxiaoer.setMajor(new String[] { "��", "�ھ��" });
		wangxiaoer.setHas_girlfirend(false);
		wangxiaoer.setCar(false);
		wangxiaoer.setHouse(false);
		wangxiaoer.setComment("����һ��ע��");
		wangxiaoer.setIgnore("��Ҫ������");

		// 1�����SerializedName()ע�⣬�ı�json key
		// Gson gson = new Gson();
		// System.out.println(gson.toJson(wangxiaoer));

		// 2�������������ۣ����ڵ���
		// GsonBuilder gsonBuilder = new GsonBuilder();
		// gsonBuilder.setPrettyPrinting();
		// Gson gson = gsonBuilder.create();
		// System.out.println(gson.toJson(wangxiaoer));

		// 3������ʱ��ʹ�ûص���������һЩ���⡢���Ӹ��ӵ�����
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {

			// ���ﶨ���Լ��Ĳ���
			public String translateName(Field f) {
				// TODO �Զ����ɵķ������
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
