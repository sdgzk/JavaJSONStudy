package gson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bean.DiaosiWithMajor;
import json.ReadJSONSample;

public class GsonReadSample2 {

	public static void main(String[] args) throws IOException {
		File file = new File(ReadJSONSample.class.getResource("/wangxiaoer.json").getFile());
		String content = FileUtils.readFileToString(file);
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		DiaosiWithMajor wangxiaoer = gson.fromJson(content, DiaosiWithMajor.class);
		
		System.out.println(wangxiaoer.getMajor());
		System.out.println(wangxiaoer.getMajor().getClass());
	}

}
