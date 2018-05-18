package json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//import net.sf.json.JSONException;
import bean.Diaosi;

public class JsonObjectSample {

	public static void main(String[] args) {
		jsonObject();
		createJsonByMap();
		createJsonByBean();

	}

	private static void jsonObject() {
		JSONObject wangxiaoer = new JSONObject();
		Object nullObj = null;

		try {
			wangxiaoer.put("name", "��С��");
			wangxiaoer.put("age", 25.2);
			wangxiaoer.put("birthday", "1992-01-01");
			wangxiaoer.put("major", new String[] { "��", "�ھ��" });
			wangxiaoer.put("has_girlfirend", false);
			wangxiaoer.put("cat", nullObj);
			wangxiaoer.put("house", nullObj);
			wangxiaoer.put("comment", "����һ��ע��");
			System.out.println(wangxiaoer.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private static void createJsonByMap() {
		Map<String, Object> wangxiaoer = new HashMap<String, Object>();

		Object nullObj = null;

		wangxiaoer.put("name", "��С��");
		wangxiaoer.put("age", 25.2);
		wangxiaoer.put("birthday", "1992-01-01");
		wangxiaoer.put("major", new String[] { "��", "�ھ��" });
		wangxiaoer.put("has_girlfirend", false);
		wangxiaoer.put("cat", nullObj);
		wangxiaoer.put("house", nullObj);
		wangxiaoer.put("comment", "����һ��ע��");
		System.out.println(new JSONObject(wangxiaoer).toString());
	}

	private static void createJsonByBean() {
		Diaosi wangxiaoer = new Diaosi();
		Object nullObj = null;

		wangxiaoer.setName("��С��");
		wangxiaoer.setAge(25.3);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("����");
		wangxiaoer.setMajor(new String[] { "��", "�ھ��" });
		wangxiaoer.setHas_girlfirend(false);
		wangxiaoer.setCar(false);
		wangxiaoer.setHouse(false);
		wangxiaoer.setComment("����һ��ע��");
		System.out.println(new JSONObject(wangxiaoer));

	}

}
