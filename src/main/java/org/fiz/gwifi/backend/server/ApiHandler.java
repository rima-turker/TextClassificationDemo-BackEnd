package org.fiz.gwifi.backend.server;

import static spark.Spark.get;

import java.util.List;

import spark.Request;

public class ApiHandler {
	
	public static void startApis() {
		get("mentions","application/json", (request, response)->getMentions(request));
		get("category","application/json", (request, response)->getMostSuitableCategory(request));
		get("categoryList","application/json", (request, response)->getMostSuitableCategoryList(request));
	}
	
	private static Object getMentions(Request request) {
		return Embeddings.getMentions(request.queryParams("text")).toString();
		
	}

	private static Object getMostSuitableCategoryList(Request request) {
		return Embeddings.getMostSuitableCategoryList(request.queryParams("text")).toString();
	}

	private static String getMostSuitableCategory(Request request) {
		return Embeddings.getMostSuitableCategory(request.queryParams("text")).toString();
	}
}
