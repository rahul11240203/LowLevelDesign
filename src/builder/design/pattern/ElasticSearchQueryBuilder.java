package builder.design.pattern;

import org.json.*;
import org.json.JSONObject;

public class ElasticSearchQueryBuilder {
	private int size;
	private JSONArray mustArray=new JSONArray();
	private JSONArray filterArray=new JSONArray();
	
	
	private ElasticSearchQueryBuilder(Builder builder) {
		this.size=builder.size;
		this.mustArray=builder.mustArray;
		this.filterArray=builder.filterArray;
	}
	
	public JSONObject build() {
		
		JSONObject query=new JSONObject();
		
		if(mustArray.length()!=0) {
			query.put("bool", mustArray);
		}
		
		if(filterArray.length()!=0) {
			query.put("filter", filterArray);
		}
		
		if(size!=0) {
			query.put("size", size);
		}
		
		return query;
		
	}
	
	public static class Builder {
		private int size=10; 
		private JSONArray mustArray;
		private JSONArray filterArray;
		
		
		public Builder size(int size) {
			this.size=size;
			return this;
		}
		
		public Builder addFilterTerm(String key, String value) {
			if(key==null || value==null) return this;
			
			JSONObject filterObj=new JSONObject();
			filterObj.put("term", new JSONObject().put(key, value));
			if(filterArray==null) filterArray=new JSONArray();
			filterArray.put(filterObj);
			return this;
		}
		
		public Builder addMustMatch(String key, String value) {
			if(key==null || value==null) return this;
			
			JSONObject matchObj=new JSONObject();
			matchObj.put("match", new JSONObject().put(key, value));
			if(mustArray==null) mustArray=new JSONArray();
			mustArray.put(matchObj);
			return this;
		}
		
		
		public ElasticSearchQueryBuilder build() {
			return new ElasticSearchQueryBuilder(this);
		}
		
	}

}
