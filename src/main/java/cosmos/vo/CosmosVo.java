package cosmos.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CosmosVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String pw;
	private String name;
	private String addr;
	private String email;
	
	
	
	
	
}
