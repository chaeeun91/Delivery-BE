package com.food.delivery.user.mapper;

import com.food.delivery.user.dto.UserDTO;
import com.food.delivery.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
	List<User> findAll();
	int insertUser(UserDTO user);
}
