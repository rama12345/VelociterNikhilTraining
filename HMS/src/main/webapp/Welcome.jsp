
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.velociter.hms.model.Patient"%>
<%@page import="com.velociter.hms.database.Operation"%>

<jsp:scriptlet>String Name = (String) session.getAttribute("name");

if (Name == null) {
	response.sendRedirect("index.jsp");
}</jsp:scriptlet>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<style type="text/css">
body {
	margin: 8px;
	height: 100vh;
	overflow-y: scroll;
	overflow-x: hidden; /* hides the horizontal scroll bar */
}

* {
	box-sizing: border-box;
}

.row {
	height: 100vh;
}

.column {
	float: left;
	padding: 10px;
	height: 100vh; /* Should be removed. Only for demonstration */
}

.left {
	width: 20%;
	border-right: 2px solid #000;
	/* //background-color: #aaa; */
}

.right {
	width: 80%;
	/* background-color: #bbb; */
}

.row:after {
	content: "";
	display: table;
	clear: both;
}

.row .column table tr {
	margin: 70px 55px;
	padding: -13px;
	font-size: 18px;
	bottom-border: 19px;
	text-decoration: none;
}

.row .column table {
	margin: 3px -11px;
}

.row .column table td {
	padding: 8px;
	border-bottom: groove;
}

.row .column table td a {
	text-decoration: none;
	font-size: 20px;
	padding: 30px;
	/* color: #000; */
}

/*---------------*/
* {
	box-sizing: border-box;
}

.row-1 {
	margin: 57px 68px;
}
/* Create three equal columns that floats next to each other */
.column-1 {
	float: left;
	width: 26.33%;
	padding: 10px;
	border: 1px solid #000;
	margin: 31px;
	height: 154px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row-1:after {
	content: "";
	display: table;
	clear: both;
}

.row-2 {
	margin: 57px 68px;
}
/* Create three equal columns that floats next to each other */
.column-2 {
	float: left;
	width: 26.33%;
	padding: 10px;
	border: 1px solid #000;
	margin: 31px;
	height: 154px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row-2:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
<body style="font-family: Futara;">
	<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expire", 0);
	%>
	<div class="row">
		<div class="column left">
			<table>
				<tr>
					<td><a href="AddDoctor.jsp">Add Doctor</a></td>
				</tr>
				<tr>
					<td><a href="AddNurse.jsp">Add Nurse</a></td>
				</tr>
				<tr>
					<td><a href="AddPatient.jsp">Add Patient</a></td>
				</tr>
				<tr>
					<td><a href="AddDepartment.jsp">Department</a></td>
				</tr>
			</table>
		</div>
		<div class="column right">
			<h2 style="margin-left: 880px;">
				Welcome:<%=session.getAttribute("name")%></h2>


			<div class="row-1">
				<div style="text-align: center; background-color: silver;"
					class="column-1">

					<h3><%=Operation.totalDoctor()%></h3>
					<h3>Total No. of Doctor</h3>
				</div>
				<div style="text-align: center; background-color: red;"
					class="column-1">
					<h3>
						<%=Operation.totalNurse()%></h3>
					<h3>Total No. of Nurse</h3>
				</div>
				<div style="text-align: center; background-color: pink;"
					class="column-1">
					<h3><%=Operation.totalPatient()%></h3>
						<h3>Total No.of Patient</h3>
				</div>
			</div>
			<div class="row-2">
				<div style="text-align: center; background-color: grey"; class="column-2">
					<h3>0</h3>
					<h3>
						<p>Today appoinment</p>
					</h3>
				</div>
				<div style="text-align: center; background-color: lightblue;"
					class="column-2">
					<h3>0</h3>
					<h3 style="text-align: center;">
						<p>Total No. of appoinment</p>
					</h3>
				</div>
			</div>
		</div>
	</div>
</body>
</body>

<jsp:include page="Footer.jsp"></jsp:include>
</html>