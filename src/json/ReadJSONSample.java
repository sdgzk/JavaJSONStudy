package json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadJSONSample {

	public static void main(String[] args) throws IOException, JSONException {

		File file = new File(ReadJSONSample.class.getResource("/wangxiaoer.json").getFile());
		String content = FileUtils.readFileToString(file);
		JSONObject jsonObject = new JSONObject(content);

		if (!jsonObject.isNull("name")) {
			System.out.println("�����ǣ�" + jsonObject.getString("name"));
		}
		
		if (!jsonObject.isNull("userName")) {
			System.out.println("�û����ǣ�" + jsonObject.getString("userName"));
		}

		if (!jsonObject.isNull("age")) {
			System.out.println("�����ǣ�" + jsonObject.getDouble("age"));
		}

		if (!jsonObject.isNull("has_girlfirend")) {
			System.out.println("����Ů���ѣ�" + jsonObject.getBoolean("has_girlfirend"));
		}

		JSONArray majorArray = jsonObject.getJSONArray("major");
		for (int i = 0; i < majorArray.length(); i++) {
			String mString = (String) majorArray.get(i);
			System.out.println("רҵ-" + (i + 1) + mString);
		}

	}

}
