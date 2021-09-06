package cosmos.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cosmos.dto.CosmosDto;

@Mapper
public interface CosmosMapper {

	public void Insert(CosmosDto cosmosDto);
	
	public List<CosmosDto> cosmosList();
	
	public void update(CosmosDto cosmosDto);
	
	public void delete(CosmosDto cosmosDto);
}
