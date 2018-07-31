package com.xupt.edu.rbac.mapper;

import com.how2java.pojo.UserRole;
import com.how2java.pojo.UserRoleExample;
import java.util.List;

public interface UserRoleMapper {
	int deleteByPrimaryKey(Long id);

	int insert(UserRole record);

	int insertSelective(UserRole record);

	List<UserRole> selectByExample(UserRoleExample example);

	UserRole selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UserRole record);

	int updateByPrimaryKey(UserRole record);
}