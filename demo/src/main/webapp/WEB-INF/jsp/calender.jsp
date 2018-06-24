 <html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 4 DatePicker</title>
   
  <link rel='stylesheet' type='text/css' href='http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css'/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>











  <script type="text/javascript" src="/styles/js/book.js"></script>
   <link rel="stylesheet" type="text/css" href="/styles/css/stylesheet.css"> 
  
</head>
<body>


<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>
<!--   </div>
</nav> -->
		

<%-- <%@include  file="header.jsp" %> --%>	
<div class="bg-info text-white" style="align-self: center;">


		
	<div class="container" style="align: center">

            <div class="panel panel-success">
                <div class="panel-heading">Flight Detailes</div>
                <div class="panel-body">		
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
						<option value="moscow">Moscow</option>
					</select></p>			        		
        		</div>
        	</div>
        	<div class="row">
        		<div class="col-sm-3">
        		       		
        		
        		</div>
        	
        	</div>
        	<button>Submit</button>
          </div>
        </div>
        </div>
</div>

</body>

</html>