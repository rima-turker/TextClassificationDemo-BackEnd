package org.fiz.gwifi.backend.server;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.fiz.ise.gwifi.Singleton.CategorySingleton;
import org.fiz.ise.gwifi.dataset.shorttext.test.HeuristicApproach;

import edu.kit.aifb.gwifi.model.Category;



public class ProcessClassifyText {
	private static CategorySingleton singCategory= CategorySingleton.getInstance();
	//static final Logger resultLog = Logger.getLogger("reportsLogger");	
	long now = System.currentTimeMillis();

	public static String classifyText(String text) {
		Category result=HeuristicApproach.getBestMatchingCategory(text,null,singCategory.map); 
		if (result.getTitle().equalsIgnoreCase("Tecnology")||result.getTitle().equalsIgnoreCase("Science")) {
			return "Science and Tecnology";
		}
		else if(result.getTitle().equalsIgnoreCase("Trade")) {
			return "Business";
		}
		return result.getTitle();
	}
	
	public static Map<String, Double> classifyTextGetCategories(String text) {
		return new LinkedHashMap<String, Double>(HeuristicApproach.getMatchingCategoryMap(text,null,singCategory.map)); 
	}

	public static List<String> classifyTextGetMentions(String decode) {
		// TODO Auto-generated method stub
		return HeuristicApproach.getMentions(decode);
	}
	
}
