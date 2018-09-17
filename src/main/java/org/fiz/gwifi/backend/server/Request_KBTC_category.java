package org.fiz.gwifi.backend.server;
import static org.hamcrest.CoreMatchers.nullValue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.fiz.ise.gwifi.Singleton.CategorySingleton;
import org.fiz.ise.gwifi.dataset.shorttext.test.HeuristicApproach;
import org.fiz.ise.gwifi.util.Config;


public class Request_KBTC_category {

	private static final String BASE_URL = Config.getString("SERVER_BASE_URL", "");
	private static final HttpClient client = new DefaultHttpClient();
	
	
	public static void main(String[] args) {
		String text="Einstein";
//		CategorySingleton singCategory = CategorySingleton.getInstance();
//		HeuristicApproach.getBestMatchingCategory(text,null,singCategory.map);
		sendHttpPost(text);
	}
	private static String sendHttpPost(String text)  {
		try {
			
			String url = BASE_URL+"category?"+"text="+text;
//			String url = "http://127.0.0.1:4567/similarity?entity1=771152&entity2=1150992&model=LINE_2nd";
			final HttpGet request = new HttpGet(url);
			final HttpResponse response = client.execute(request);
			final BufferedReader rd = new BufferedReader(
	                       new InputStreamReader(response.getEntity().getContent()));

			final StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			return result.toString();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}