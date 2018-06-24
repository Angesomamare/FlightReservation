

		

<%@include  file="header.jsp" %>
<div class="bg-info text-white" style="align-self: center;">


		
	<div class="container" style="align: center">

            <div class="panel panel-success">
	            <div class="panel-heading">Flight Detailes</div>
	            <div class="panel-body">
 <form:form action="home2" method="post" modelAttribute="flightdetail">           
	  <table>
      <tr>
        <th>Name</th>
        <td>
          <form:input path="name" /> 
          <%-- <form:errors path="name" cssClass="error" /> --%>
         </td>
      </tr>
      <tr>
        <th>Email</th>
        <td>
            <form:input path="email" /> 
            <form:errors path="email" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>Gender</th>
        <td>
          <form:radiobutton path="gender" value="Male" label="Male" /> 
          <form:radiobutton path="gender" value="Female" label="Female" /> 
          <form:errors path="gender" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th valign="top">Langauge</th>
        <td>
          <form:select path="langauge" multiple="true">
            <form:option value="US English">US English</form:option>
            <form:option value="UK English">UK English</form:option>
            <form:option value="Spanish">Spanish</form:option>
            <form:option value="Hindi">Hindi</form:option>
            <form:option value="Mandarin">Mandarin</form:option>
          </form:select>
          <form:errors path="langauge" cssClass="error" />
         </td>
      </tr>
      <tr>
      	<th align="center">Departing</th>
      	<td>
      		<form:input path="departing"/>      	
      	</td>
      </tr>
       <tr>
      	<th align="center">Returning</th>
	      	<td>
	      		<form:input path="returning"/>      	
	      	</td>
      </tr>
       <tr>
        <th valign="top">Destination: </th>
        <td>
          <form:select path="destination" multiple="true">
            <form:option value="New York">US English</form:option>
            <form:option value="DCA">UK English</form:option>
            <form:option value="ORD">Spanish</form:option>
            <form:option value="IAT">Hindi</form:option>
            <form:option value="Las Vegas">Mandarin</form:option>
          </form:select>
          <form:errors path="langauge" cssClass="error" />
         </td>
      </tr>

    </table>
		        	<div class="row">
			        	<div class="col-sm-6" id="header">
			        		<h2><br/>Select a Destination</h2>
			        	</div>    		        	
		        	</div>
		        	<div class="row">
			        	<div class="col-sm-3">		        	
			        		<p>Departing: <input type="text" id="departing"></p>
			        	</div>	
			        	<div class="col-sm-3">			        	
			        		<p>Returning: <input type="text" id="returning"></p>
			        	</div>    	
		        	</div>
		        	<br>
		        	<div class="row">
		        		<div class="col-sm-3">
		        			<p>Destination: <select id="dropdown">
								<option value="newyork">New York</option>
								<option value="london">London</option>
								<option value="beijing">Beijing</option>
								<option value="moscow">Moscow</option></select>
							</p>			        		
		        		</div>
		        	</div>
		        	<div class="row">
		        		<div class="col-sm-3">
		        		</div>	        	
		        	</div>
		        	<button>Submit</button>
</form:form>
	          </div>
        	</div>
        </div>

</div>
</body>

</html>

