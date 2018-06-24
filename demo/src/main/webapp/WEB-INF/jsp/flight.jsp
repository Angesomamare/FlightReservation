

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include  file="flightheader.jsp" %>
<script type="text/javascript" src="/styles/js/script.js"></script>

<!-- <link rel="stylesheet" type="text/css" href="/styles/css/flight.css">  -->
<script type="text/javascript" src="/styles/js/dob.js"></script>
<!-- <script type="text/javascript" src="/styles/js/book.js"></script> -->
</head>
<body> 

<h1 style="margin-left: 5%;">FREE FLIGHT ALL OVER THE WORLD</h1>

<div class="container"  style="margin-left: 0%; widows: 100%;">
	<div class="row">
		<div class="col-sm-9">
		<!-- <div class="container"> --><!--  style="margin-left: 0%;width: 100%"  -->
	<div class="panel panel-success">
		 <div class="panel-heading">Flight Detailes</div>
		 <div class="panel-body">
		 	<form:form action="test" method="post" modelAttribute="mytravel">
				<div class="row">
					<div class="col-sm-3">
						<form:label path="name">First Name<sup><span style="color: red;size: 100;">*</span></sup></form:label>
		 				<form:input path="name"/>
					</div>
					<div class="col-sm-3">
						<form:label path="mname">Middle Name</form:label>
		 				<form:input path="mname"/>
					</div>
					<div class="col-sm-3">
						<form:label path="lname">Last Name<sup><span style="color: red;size: 100;">*</span></sup></form:label>
		 				<form:input path="lname"/>
					</div>		
				</div><br>
				<div class="row">
					<div class="col-sm-3">
						<form:label path="country">Country/Territory <sup><span style="color: red;size: 100;">*</span></sup></form:label>
						<form:select path="country">
							<form:option value="">--SELECT--</form:option>
							<form:option value="USA">USA</form:option>
				            <form:option value="CANADA">CANADA</form:option>
				            <form:option value="UK">UNITED KINGDOM</form:option>
				            <form:option value="ETHIOPIA">ETHIOPIA</form:option>
				            <form:option value="BRAZIL">BRAZIL</form:option>
						</form:select>
					</div>				
				</div><br>
				<div class="row">
					<div class="col-sm-3">
						<form:label path="phonenumber"> PHONE NUMBER<sup><span style="color: red;size: 100;">*</span></sup></form:label>
						<form:input path="phonenumber"/>	
					</div>
				</div> <br>
				<div class="row">
					
					<div class="col-sm-3">
					  <form:label path="gender">GENDER<sup><span style="color: red;size: 100;">*</span></sup></form:label><br>
					  <form:radiobutton path="gender" value="Male" label="Male" /> 
					  <form:radiobutton path="gender" value="Female" label="Female" /> 
					</div>					
				</div><br>
				<div class="row">
			        <div class='col-sm-4'>
			    
			        
 			             <div class="form-group">
			            <form:label path="dob">Date of Birth<sup><span style="color: red;size: 100;">*</span></sup></form:label>
			                <div class='input-group date' style="width: 80%"> <!-- id='datepicker' -->

			                    <form:input path="dob" type="text" name="dob" id="dateofbirth" class="form-control"/>
			                    <span class="input-group-addon">
			                        <span class="glyphicon glyphicon-calendar"></span>
			                    </span>
			                </div>
			            </div>
			        </div>

    			</div>
    			<div class="row">
					<div class="col-sm-3" >
						<form:label path="cardholder"> Card Holder Name<sup><span style="color: red;size: 100;">*</span></sup></form:label>
						<form:input path="cardholder"/>	
					</div>
				</div><br>
				<div class="row">
			        <div class='col-sm-4'>
			            <div class="form-group">
			             <form:label path="ExDa">Expiration Date<sup><span style="color: red;size: 100;">*</span></sup></form:label>
			            <!-- <p>Expiration kkk: <input type="text" id="exdate"></p> -->
 			                <div class='input-group date'  style="width: 80%">
			                	 <form:input path="ExDa" type="text" name="ExDa" id="expirationdate" class="form-control"/>
			                    <%-- <form:input path="dob" type='text' class="form-control" /> --%>
			                    
			                    <span class="input-group-addon">
			                        <span class="glyphicon glyphicon-calendar"></span>
			                    </span>
			                </div>
			            </div>
			        </div>

    			</div>
    			<div class="row">
					<div class="col-sm-2">
						<form:label path="security"> Security<sup><span style="color: red;size: 100;">*</span></sup></form:label>
						<form:input path="security"/>	
					</div>
				</div><br>
				<button type="submit" class="btn btn-primary">COMPLETE BOOKING</button>

		 	</form:form>		 
		 </div>	
	</div>
<!-- </div> -->
		
		</div>

		<div class="col-sm-3">
			<img src="/styles/images/ethio.jpg" width="600" height="650"  width="510"><!-- alt="Flowers in Chania" width="460" height="345" -->
		</div>
	
	</div>

</div>

</body>
</html>


