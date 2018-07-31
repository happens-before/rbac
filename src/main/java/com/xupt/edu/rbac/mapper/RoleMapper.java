package com.xupt.edu.rbac.mapper;


import com.xupt.edu.rbac.pojo.Role;
import com.xupt.edu.rbac.pojo.RoleExample;

import java.util.List;

public interface RoleMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Role record);

	int insertSelective(Role record);

	List<Role> selectByExample(RoleExample example);

	Role selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}