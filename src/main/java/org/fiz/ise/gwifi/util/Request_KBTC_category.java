package org.fiz.ise.gwifi.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.fiz.ise.gwifi.util.Config;


public class Request_KBTC_category {

	private static final String BASE_URL = Config.getString("SERVER_BASE_URL", "");
	private static final HttpClient client = new DefaultHttpClient();
	
	private static double sendGet(String text) throws Exception {
		String url = BASE_URL+"category?"+"text="+text;
		final HttpGet request = new HttpGet(url);
		final HttpResponse response = client.execute(request);
		final BufferedReader rd = new BufferedReader(
                       new InputStreamReader(response.getEntity().getContent()));

		final StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		return Double.parseDouble(result.toString());
	}
}