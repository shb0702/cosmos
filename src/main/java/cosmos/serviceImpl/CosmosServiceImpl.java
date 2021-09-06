package cosmos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cosmos.dto.CosmosDto;
import cosmos.mapper.CosmosMapper;
import cosmos.service.CosmosService;

@Service
public class CosmosServiceImpl implements CosmosService{

	@Autowired
	private CosmosMapper cosmosMapper;

	@Override
	public void Insert(CosmosDto cosmosDto) {
		
		cosmosMapper.Insert(cosmosDto);
	}

	@Override
	public List<CosmosDto> cosmosList() {

		cosmosMapper.cosmosList();
		
		return cosmosMapper.cosmosList();
	}

	@Override
	public void update(CosmosDto cosmosDto) {
		
		cosmosMapper.update(cosmosDto);
		
	}

	@Override
	public void delete(CosmosDto cosmosDto) {

		cosmosMapper.delete(cosmosDto);
	}

	
}
