<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>List of Available Books</title>
	</head>
	<body>
		<div class="jumbotron">
			<div class="col-sm-6 col-md-3">
				<h1>${book.title}</h1>
				<p>${book.author}</p>
				<p>${book.isbn}</p>
			</div>
		</div>
	</body>
</html>