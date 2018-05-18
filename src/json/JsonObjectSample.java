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
			wangxiaoer.put("name", "王小二");
			wangxiaoer.put("age", 25.2);
			wangxiaoer.put("birthday", "1992-01-01");
			wangxiaoer.put("major", new String[] { "理发", "挖掘机" });
			wangxiaoer.put("has_girlfirend", false);
			wangxiaoer.put("cat", nullObj);
			wangxiaoer.put("house", nullObj);
			wangxiaoer.put("comment", "这是一个注释");
			System.out.println(wangxiaoer.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private static void createJsonByMap() {
		Map<String, Object> wangxiaoer = new HashMap<String, Object>();

		Object nullObj = null;

		wangxiaoer.put("name", "王小二");
		wangxiaoer.put("age", 25.2);
		wangxiaoer.put("birthday", "1992-01-01");
		wangxiaoer.put("major", new String[] { "理发", "挖掘机" });
		wangxiaoer.put("has_girlfirend", false);
		wangxiaoer.put("cat", nullObj);
		wangxiaoer.put("house", nullObj);
		wangxiaoer.put("comment", "这是一个注释");
		System.out.println(new JSONObject(wangxiaoer).toString());
	}

	private static void createJsonByBean() {
		Diaosi wangxiaoer = new Diaosi();
		Object nullObj = null;

		wangxiaoer.setName("王小二");
		wangxiaoer.setAge(25.3);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("蓝翔");
		wangxiaoer.setMajor(new String[] { "理发", "挖掘机" });
		wangxiaoer.setHas_girlfirend(false);
		wangxiaoer.setCar(false);
		wangxiaoer.setHouse(false);
		wangxiaoer.setComment("这是一个注释");
		System.out.println(new JSONObject(wangxiaoer));

	}

}
