<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>简易计算机</title>
</head>
<body>
	<form action="util/cal.do?method=calc" method="post">
		<input type="text" name="param1"> <select name="operator">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select> <input type="text" name="param2"> <input type="submit" value="计算">
	</form>
</body>
</html>