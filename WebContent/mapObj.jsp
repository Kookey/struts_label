<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>key=value</th>
				<th>id</th>
				<th>name</th>
				<th>age</th>
				<th>address</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="userMap" id="map">
				<tr>
				<td><s:property value="#map"/></td>
				<td><s:property value="value.id"/></td>
				<td><s:property value="value.name"/></td>
				<td><s:property value="value.age"/></td>
				<td><s:property value="value.address"/></td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>