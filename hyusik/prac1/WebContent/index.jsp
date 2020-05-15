<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>MAIN</title>
<link rel="stylesheet" href="http://localhost:8090/prac1/header/header_style.css">
<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d033ab2c0002c3aedd619825d12b4956"></script>
</head>
<body>
<div class="body">
<div class="main" style="height:750px;padding:20px;">
	<p id="button" align="right">
		<button onclick="setOverlayMapTypeId('TRAFFIC')">교통정보</button>
		<button onclick="setOverlayMapTypeId('ROADMAP')">보기</button></p>
	<div id="map" style="width:100%;height:95%" ></div>
	<script src="<%=request.getContextPath()%>/main/main_script.js"></script>
</div>
</div>
</body>
</html>