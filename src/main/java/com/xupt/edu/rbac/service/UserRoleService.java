package com.xupt.edu.rbac.service;


import com.xupt.edu.rbac.pojo.User;

public interface UserRoleService {

	public void setRoles(User user, long[] roleIds);

	public void deleteByUser(long userId);

	public void deleteByRole(long roleId);

}