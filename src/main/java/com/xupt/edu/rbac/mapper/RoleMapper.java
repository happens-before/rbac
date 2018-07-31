package com.xupt.edu.rbac.mapper;

import com.how2java.pojo.Role;
import com.how2java.pojo.RoleExample;
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