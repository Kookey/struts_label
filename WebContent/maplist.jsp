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
				<td>key</td>
				<td>id</td>
				<td>name</td>
				<td>age</td>
				<td>address</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="listMap" id="column">
				<s:set var="total" name="total" value="#column.value.size"/>
				<s:iterator value="#column.value" id="col" status="st">
					<tr>
					<s:if test="#st.first">
						<td rowspan="${total}"><s:property value="#column.key"/></td>
					</s:if>
					<td><s:property value="id"/> </td>
					<td><s:property value="name"/></td>
					<td><s:property value="age"/></td>
					<td><s:property value="address"/></td>
				</tr>
				</s:iterator>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>