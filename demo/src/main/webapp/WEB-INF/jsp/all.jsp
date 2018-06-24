

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html>
<head>
<title>jQuery Datepicker UI Example - Demo Preview</title>
<meta name="robots" content="noindex, nofollow"/>
<!------------ Including jQuery Date UI with CSS -------------->
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
<!-- jQuery Code executes on Date Format option ----->

<link rel="stylesheet" type="text/css" href="/styles/css/style.css"> 
<script type="text/javascript" src="/styles/js/script.js"></script>



</head>
<body>
<div class="container">
<h2>jQuery Datepicker UI Example Form</h2>
<div class="main">

<form:form action="flight" method="post" modelAttribute="mytravel">
<form:label path="name">First Name<sup><span style="color: red;size: 100;">*</span></sup></form:label>
<form:input type="text" path="name" name="sname" id="Name"/>
<form:label path="dob">Date of Birth<sup><span style="color: red;size: 100;">*</span></sup></form:label>
<form:input path="dob" type="text" name="selected_date" id="datepicker"/>
<input type="submit" id="submit" value="Submit"/>

</form:form>






<%-- 
<form action="" method="post">
<label>Name :</label>
<input type="text" name="sname" id="Name"/>
<form:label>Date Of Birth :</form:label>
<input type="text" name="selected_date" id="datepicker"/> --%>
<!-- <label>Select Date Format :</label>
<select id="format">
<option value="mm/dd/yy">Default - mm/dd/yyyy</option>
<option value="dd/mm/yy">dd/mm/yyyy</option>
<option value="yy-mm-dd">ISO 8601 - yyyy-mm-dd</option>
<option value="d M, y">Short - d M, y</option>
<option value="d MM, y">Medium - d MM, y</option>
<option value="DD, d MM, yy">Full - DD, d MM, yyyy</option>
<option value="&apos;day&apos; d &apos;of&apos; MM &apos;in the year&apos; yy">With text - 'day' d 'of' MM 'in the year' yyyy</option>
</select>
<input type="submit" id="submit" value="Submit"> -->
</form>
</div>
</div>
</body>
</html>