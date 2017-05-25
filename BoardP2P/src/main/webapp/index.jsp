<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>P@P SITE</title>
</head>
<body>
<tiles:insertDefinition name="layout">
	<tiles:putAttribute name="content">
	<script type="text/javascript">
		location.href = "home.do";
	</script>		
	</tiles:putAttribute>
</tiles:insertDefinition>
</body>
</html>