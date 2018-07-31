package com.xupt.edu.rbac.mapper;


import com.xupt.edu.rbac.pojo.RolePermission;
import com.xupt.edu.rbac.pojo.RolePermissionExample;

import java.util.List;

public interface RolePermissionMapper {
	int deleteByPrimaryKey(Long id);

	int insert(RolePermission record);

	int insertSelective(RolePermission record);

	List<RolePermission> selectByExample(RolePermissionExample example);

	RolePermission selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(RolePermission record);

	int updateByPrimaryKey(RolePermission record);
}