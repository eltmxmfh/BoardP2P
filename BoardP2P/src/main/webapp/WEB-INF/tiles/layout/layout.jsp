<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>   
<!DOCTYPE html> 
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Default tiles template</title>
	<link rel="stylesheet" href="resources/css/layout.css" type="text/css" media="screen" />
	

</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" />
			<div id="nav">
					<tiles:insertAttribute name="nav"/>
			</div>	
		</div>
		<div id="body_container">
			<div id="body_top_menu">
				<tiles:insertAttribute name="body_top_menu" />
			</div>
			<div id="body_content">
				<tiles:insertAttribute name="content" />
			</div> 
		</div>
		<div id="leftMenu">
			<div id="loginForm">
				<tiles:importAttribute name="loginForm" />
			</div>
			<tiles:insertAttribute name="leftMenu" />
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
	
</html>