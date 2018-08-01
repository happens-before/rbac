<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" type="text/css" href="static/css/style.css" />
</head>
<body>

<div class="workingroom">
	<div class="loginDiv">

	<c:if test="${empty subject.principal}">
		<a href="login">登录</a><br>
		<br>
	</c:if>
	<c:if test="${!empty subject.principal}">
		<span class="desc">你好，${subject.principal}，</span>
		<a href="doLogout">退出</a><br>
		<br>
	</c:if>
		<div>
			<a href="listStudio">查看演出厅</a><br>
			<a href="deleteStudio">删除演出厅</a><br>
			<a href="addStudio">增加演出厅</a><br>
			<a href="updateStudio">编辑演出厅</a><br>
			<a href="listStudio">查看演出厅</a><br>
			<br><br>
		</div>
		<div>
			<a href="deletePlay">删除演出剧目</a><br>
			<a href="addPlay">增加演出剧目</a><br>
			<a href="updatePlay">编辑演出剧目</a><br>
			<a href="listPlay">查看演出剧目</a><br>
			<br><br>
		</div>
		<div>
			<a href="deleteSchedule">删除演出计划</a><br>
			<a href="addSchedule">增加演出计划</a><br>
			<a href="updateSchedule">编辑演出计划</a><br>
			<a href="listSchedule">查看演出计划</a><br>
			<br><br>
		</div>

		<div>
			<a href="deleteTicket">删除演出票</a><br>
			<a href="addTicket">增加演出票</a><br>
			<a href="updateTicket">编辑演出票</a><br>
			<a href="listTicket">查看演出票</a><br>
			<br><br>
		</div>


		<div>
			<a href="addSaleItem">增加销售记录</a><br>
			<a href="listSaleItem">查看销售记录</a><br>
			<br><br>
		</div>

		<div>
			<a href="sumSaleRecord">统计销售额</a><br>
			<a href="listSaleRecord">查看销售额</a><br>
		</div>

</div>

</div>
</body>
</html>