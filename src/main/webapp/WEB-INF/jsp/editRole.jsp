<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<link rel="stylesheet" type="text/css" href="../static/css/style.css" />
 
</head>
<body>
 
<div class="workingroom">
     
    <%@include file="include/menu.jsp" %>
 
    <div class="addOrEdit" >
        <form action="updateRole" method="post">
            角色名: <input type="text" name="name" value="${role.name}"> <br>
            角色描述: <input type="text" name="desc_" value="${role.desc_}" > <br><br>
            配置权限:<br>
            <div style="text-align:left;width:300px;margin:0px auto;padding-left:50px">
                <c:forEach items="${ps}" var="p">
                    <c:set var="hasPermission" value="false" />
                    <c:forEach items="${currentPermissions}" var="currentPermission">
                        <c:if test="${p.id==currentPermission.id}">
                            <c:set var="hasPermission" value="true" />
                        </c:if>
                    </c:forEach>
                    <input type="checkbox"  ${hasPermission?"checked='checked'":"" } name="permissionIds" value="${p.id}"> ${p.name}<br>
                </c:forEach>
            </div>           
             
            <input type="hidden" name="id" value="${role.id}">
            <input type="submit" value="修改">
        </form>  
    </div>
</div>
</body>
</html>