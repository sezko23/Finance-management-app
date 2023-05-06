package project.financemanagement.demo.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import project.financemanagement.demo.model.dto.TransactionRequest;
import project.financemanagement.demo.model.entity.Transaction;

@Mapper(
        componentModel = "spring"
)
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mapping(target = "budgetId", ignore = true)
    Transaction toTransaction(TransactionRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Transaction update(
            @MappingTarget Transaction transaction,
            Transaction request

    );
}
