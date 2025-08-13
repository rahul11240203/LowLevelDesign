package builder.design.pattern;

public class QueryBuild {
	public static void main(String[] args) {
		
		ElasticSearchQueryBuilder queryBuilder=new ElasticSearchQueryBuilder.Builder()
				.size(5)
				.addMustMatch("status", "Open")
				.addMustMatch("id", "123")
				.addFilterTerm("channel", "8774")
				.build();
		
		System.out.println("FINAL QUERY >" + queryBuilder.build());
		
		
	}
}
