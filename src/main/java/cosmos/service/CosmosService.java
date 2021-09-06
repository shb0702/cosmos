package cosmos.service;

import java.util.List;

import cosmos.dto.CosmosDto;

public interface CosmosService {

	public void Insert(CosmosDto cosmosDto);

	List<CosmosDto> cosmosList();

	public void update(CosmosDto cosmosDto);
	
	public void delete(CosmosDto cosmosDto);
	
}
