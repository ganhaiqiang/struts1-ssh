<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="util/cal.do?method=setLang&lang=zh_CN">简体中文</a>&nbsp;&nbsp;&nbsp;
	<a href="util/cal.do?method=setLang&lang=en_US">English</a>
	<h1>
		<bean:message key="app.name" />
		<br> ${CUR_LANG}
	</h1>
	<hr>
	<hr>
	<a href="input.jsp">登录</a>
</body>
</html>