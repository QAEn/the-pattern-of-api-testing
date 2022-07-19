package api.testing.pojo.responsefrommock;

import lombok.Data;

@Data
public class ResultsItem{
	private String display_name;
	private String list_name;
	private String list_name_encoded;
	private String newest_published_date;
	private String oldest_published_date;
	private String updated;
}