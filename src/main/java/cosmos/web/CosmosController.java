package cosmos.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cosmos.dto.CosmosDto;
import cosmos.service.CosmosService;

@RestController
@RequestMapping(value = "/cosmos")
public class CosmosController {

	@Autowired
	private CosmosService cosmosService;
	

	@GetMapping(value = "insert")
	public ResponseEntity<?> Insert(CosmosDto cosmosDto)  throws Exception {
		
		System.out.println("======= insert ======== : " + cosmosDto);
		cosmosService.Insert(cosmosDto);
		
		return new ResponseEntity<>(cosmosDto, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "list")
	public ResponseEntity<?> cosmosList() throws Exception{
		
		
		List<CosmosDto> list =  cosmosService.cosmosList(); 
		
		Map<String, Object> result = new HashMap<>();
		result.put("cosmos", list);
		
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	@PostMapping(value = "update")
	public ResponseEntity<?> update(CosmosDto cosmosDto)throws Exception{
	
		System.out.println("======== update ======== : " + cosmosDto);
		cosmosService.update(cosmosDto);
		
		return new ResponseEntity<>(cosmosDto , HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "delete")
	public ResponseEntity<?> delete(CosmosDto cosmosDto) throws Exception{
		
		System.out.println("======= delete ======= : " + cosmosDto);
		cosmosService.delete(cosmosDto);
		
		return new ResponseEntity<>(cosmosDto , HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
