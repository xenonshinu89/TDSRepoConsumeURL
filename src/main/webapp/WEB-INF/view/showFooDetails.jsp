<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="common/UserNavigation.jsp"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> ${requestScope.title} </title>
</head>
<body>
<div>
	<h1>Foo Args</h1>
	<table class="table table-striped">
		<tr>
			<td>Foo 1</td>
			<td>Foo 2</td>
		</tr>
		<tr>  
			<td>${foo.args.foo1 } </td>
			<td>${foo.args.foo2 } </td>
		</tr>
		
	</table>
	
</div>

<div>
	<h1>Headers</h1>
	<table class="table table-striped">
		<tr>
			<td>x-forwarded-proto</td>
			<td>x-forwarded-port</td>
			<td>host</td>
			<td>x-amzn-trace-id</td>
			<td>accept</td>
			<td>user-agent</td>
		</tr>
		<tr>  
			<td>${foo.headers.x_forwarded_proto } </td>
			<td>${foo.headers.x_forwarded_port} </td>
			<td>${foo.headers.host} </td>
			<td>${foo.headers.x_amzn_trace_id} </td>
			<td>${foo.headers.accept} </td>
			<td>${foo.headers.user_agent} </td>
		</tr>
		
	</table>
	
</div>

<div>
	<h1>Url</h1>
	<table class="table table-striped">
		<tr>
			<td>Url</td>
		</tr>
		<tr>  
			<td>${foo.url} </td>
			
		</tr>
		
	</table>
	
</div>
</body>
</html>