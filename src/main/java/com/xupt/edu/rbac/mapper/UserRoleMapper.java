package com.xupt.edu.rbac.mapper;

import com.xupt.edu.rbac.pojo.UserRole;
import com.xupt.edu.rbac.pojo.UserRoleExample;
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