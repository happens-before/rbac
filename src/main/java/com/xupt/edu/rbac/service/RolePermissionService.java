package com.xupt.edu.rbac.service;

import com.how2java.pojo.Role;

public interface RolePermissionService {
	public void setPermissions(Role role, long[] permissionIds);

	public void deleteByRole(long roleId);

	public void deleteByPermission(long permissionId);
}