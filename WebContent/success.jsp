<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>集合遍历</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>地址</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="users" id="array">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="age"/></td>
					<td><s:property value="address"/></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>