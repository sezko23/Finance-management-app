package project.financemanagement.demo.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import project.financemanagement.demo.model.dto.BudgetRequest;
import project.financemanagement.demo.model.entity.Budget;

@Mapper(
        componentModel = "spring"
)
public interface BudgetMapper {

    BudgetMapper INSTANCE = Mappers.getMapper(BudgetMapper.class);

    @Mapping(target = "budgetId", ignore = true)
    Budget toBudget(BudgetRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Budget update(
            @MappingTarget Budget budget,
            Budget request

    );
}

