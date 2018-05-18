package json;
import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class test {

	public static void main(String[] args) {
		BufferedWriter fw =null;
		try {
			student stu=new student();
			stu.setName("JSON");
			stu.setAge("23");
			stu.setAddress("北京市西城区");
			//1、使用JSONObject
			JSONObject json = JSONObject.fromObject(stu);
			//2、使用JSONArray
			JSONArray array=JSONArray.fromObject(stu);
			String strJson=json.toString();
			String strArray=array.toString();
			System.out.println("strJson:"+strJson);
			System.out.println("strArray:"+strArray);


			String objectStr="{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}";
			String arrayStr="[{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}]";
			//1、使用JSONObject
			JSONObject jsonObject=JSONObject.fromObject(objectStr);
			student stu1=(student)JSONObject.toBean(jsonObject, student.class);
			//2、使用JSONArray
			JSONArray jsonArray=JSONArray.fromObject(arrayStr);
			//获得jsonArray的第一个元素
			Object o=jsonArray.get(0);
			JSONObject jsonObject2=JSONObject.fromObject(o);
			student stu2=(student)JSONObject.toBean(jsonObject2, student.class);
			System.out.println("stu:"+stu1);
			System.out.println("stu2:"+stu2);
			/*Map<String,String> maps = new LinkedHashMap<String,String>();  
            maps.put("1","ssssssssfsd" );
            maps.put("2","ssssssssfsd" );
            maps.put("3","ssssssssfsd" );
            maps.put("4","ssssssssfsd" );
            maps.put("5","ssssssssfsd" );
            maps.put("6","ssssssssfsd" );
            Map<String, String> map1=new Hashtable<String, String>();
            map1.put("1","qqqqqqqfsd" );
            map1.put("2","qqqqqqqfsd" );
            map1.put("3","qqqqqqqfsd" );
            map1.put("4","qqqqqqqfsd" );
            map1.put("5","qqqqqqqfsd" );
            map1.put("6","qqqqqqqfsd" );
            Map<String, String> map=new HashMap<String, String>();
             map.put("1","sdfsd" );
             map.put("2","sdfsd" );
             map.put("3","sdfsd" );
             map.put("4","sdfsd" );
             map.put("5","sdfsd" );
             map.put("6","sdfsd" );
             map.put("7","sdfsd" );

             for (String key : maps.keySet()) {  
                 System.out.println("key= "+ key + " and value= " + maps.get(key));  
                }  
             for (String key : map1.keySet()) {  
                 System.out.println("key= "+ key + " and value= " + map1.get(key));  
                }
             for (String key : map.keySet()) {  
                 System.out.println("key= "+ key + " and value= " + map.get(key));  
                }*/
			/*for(Iterator<String> iterator=map1.keySet().iterator();iterator.hasNext();){
                    String key=iterator.next();
                    System.out.println("key-----"+key);
                    System.out.println("value--------"+map1.get(key));
                    }*/
			// System.out.println(map1.get("1")); 
			//  }


			/* fw =  new BufferedWriter(new FileWriter("e:\\test.txt"));
            fw.write("wo shi lucky asas");
            fw.flush();
            fw.close();*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}