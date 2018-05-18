package gson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import bean.Diaosi;
import json.ReadJSONSample;

public class GsonReadSample {

	public static void main(String[] args) throws IOException {
		File file = new File(ReadJSONSample.class.getResource("/wangxiaoer.json").getFile());
		String content = FileUtils.readFileToString(file);
		Gson gson = new Gson();
		
		// ·´Ïò½âÎö
		Diaosi wangxiaoer = gson.fromJson(content, Diaosi.class);
		System.out.println(wangxiaoer);

	}

}
