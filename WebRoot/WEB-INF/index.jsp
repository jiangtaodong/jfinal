<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JFinal...........</title>

<script type="text/javascript" src="../js/jquery-3.4.1.js"></script>

<script type="text/javascript">

	/* alert("********"); */
	
	/* $(function(){
		
		alert("******");
		
	}); */
	
	function stest(){
		
		/* alert("*******"); */
		
		$.ajax({
			
			url:"/hello/test",
			type:"post",
			dataType:"text",
			data:{user:$(":input[name='user']").val(),password:$(":input[name='password']").val()},
			
			success:function(data){
				alert("success");
			},
			error:function(){
				alert("error");
			}
			
		});
		
	};

</script>

</head>
<body>
	
	<form action="/hello/testjsp" method="post">
		
		<table style="margin-left: auto;margin-right: auto;margin-top: 20%">
			<tr>
				<td>
				用户名：
				</td>
				<td>
					<input type="text" name="user" placeholder="请输入用户名：">
				</td>
			</tr>
			<tr>
				<td>
				密码：
				</td>
				<td>
					<input type="text" name="password" placeholder="请输入密码：">
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="登录" onclick="stest()">
				</td>
				<td>
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	
	</form>
	
</body>
</html>