package com.learning.springboot.mapper;

import com.learning.springboot.dto.UserDto;
import com.learning.springboot.entity.User;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
