package com.xupt.edu.rbac.mapper;

import com.how2java.pojo.User;
import com.how2java.pojo.UserExample;
import java.util.List;

public interface UserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}