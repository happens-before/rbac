package com.xupt.edu.rbac.service;

import java.util.List;
import java.util.Set;

import com.how2java.pojo.Role;
import com.how2java.pojo.User;

public interface RoleService {
	public Set<String> listRoleNames(String userName);

	public List<Role> listRoles(String userName);

	public List<Role> listRoles(User user);

	public List<Role> list();

	public void add(Role role);

	public void delete(Long id);

	public Role get(Long id);

	public void update(Role role);

}