package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONObject;
//单交易测试
public class HttpSendSingleTranPost {
	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		//包头
		json.put("requestSid", "123");
		json.put("requestSerNo", "ad");
		json.put("devNo", "12");
		json.put("trancode", "00s00002");
	//	json.toString().substring(2,json).length()
		//json.put("cityName", "000001");
		
		//包体
		JSONObject jsonBody = new JSONObject();
		jsonBody.put("cardNumber", "1196398000019");
		//jsonBody.put("checkType", "1");
		//jsonBody.put("password", "888888");
		//jsonBody.put("csextg", "");
		/*jsonBody.put("ServiceName", "33333333");
		jsonBody.put("UserId", "eeeee");*/
		//jsonBody.put("qurytp", "D66001001");
		//String json="";
		//json.put("jsonBody", jsonBody.toString());
//		String param = URLEncoder.encode(json.toString(), "UTF-8");
		System.out.println("post send============：" + json.toString());
		String s = sendPost("http://localhost:8081/annotation/addBaseParam",json.toString());
		System.out.println("post recv============:" + s);
		JSONObject tranjsonBody =JSONObject.fromObject(s);
		//JSONObject tranjsonBodys =JSONObject.fromObject(tranjsonBody.get("jsonBody"));
		System.out.println(tranjsonBody.toString());
	}

	public static String sendPost(String url,String params){
		OutputStreamWriter out = null;
		BufferedReader reader = null;
		String response = "";
		
		try{
			URL httpUrl = null;
			httpUrl = new URL(url);
			
			HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("connection", "keep-alive");
			conn.setUseCaches(false);
			conn.setInstanceFollowRedirects(true);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.connect();
			
			out = new OutputStreamWriter(conn.getOutputStream());
			out.write(params);
			out.flush();
			
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String lines;
			while((lines = reader.readLine()) != null){
				lines = new String(lines.getBytes(),"utf-8");
				response+=lines;
				
			}
			
			reader.close();
			
			conn.disconnect();
		}catch(Exception e){
			System.out.println("发送POST请求出现异常!"+e);
			e.printStackTrace();
		}finally{
			try{
				if(out != null){
					out.close();
				}
				
				if(reader!=null){
					reader.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
		return response;
	}
	
	
}
