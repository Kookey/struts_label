<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<s:iterator value="attrMap" id="column">
			<div><s:property value="#column"/> </div>
				key:<s:property value="key"/>
				<s:iterator value="value" id="col">
					<s:property value="col"/>
				</s:iterator>
		</s:iterator>
	</h1>
</body>
</html>