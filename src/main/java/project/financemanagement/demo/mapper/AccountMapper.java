package project.financemanagement.demo.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import project.financemanagement.demo.model.dto.AccountRequest;
import project.financemanagement.demo.model.entity.Account;

@Mapper(
        componentModel = "spring"
)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(target = "accountId", ignore = true)
    Account toAccount(AccountRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Account update(
            @MappingTarget Account account,
            Account request

    );
}
