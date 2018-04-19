<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/js/jquery-3.2.0.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<button class="btn btn-success" id="button">按钮</button>
	<script type="text/javascript">
		$("#button").click(function(){
		    $.ajax({
				type:"get",
				url:"/ssmDemo/tnlEmpController/insertTnlDept.do",
				dataType:"json",
				success : function(data){
				    alert(data);
				}
		    })
		});
	
	</script>
</body>
</html>