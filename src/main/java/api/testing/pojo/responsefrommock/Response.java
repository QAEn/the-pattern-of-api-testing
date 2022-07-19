package api.testing.pojo.responsefrommock;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response {
	@JsonProperty("copyr_ight")
	private String copyright;
	private int num_results;
	private List<ResultsItem> results;
	private String status;
}