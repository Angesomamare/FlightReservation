//$(document).ready(function() {
//    $("#departing").datepicker();
//    $("#returning").datepicker();
//    $("button").click(function() {
//    	var selected = $("#dropdown option:selected").text();
//        var departing = $("#departing").val();
//        var returning = $("#returning").val();
//        if (departing === "" || returning === "") {
//			alert("Please select departing and returning dates.");
//        } else {
//			confirm("Would you like to go to " + selected + " on " + departing + " and return on " + returning + "?");
//        }
//    });
//});

$(function() {
	
	$(document).ready(function() {
		// Datepicker Popups calender to Choose date.
		$(function() {
		$("#dateofbirth").datepicker({
			changeMonth:true,
			changeYear:true
		});
		// Pass the user selected date format.
		$("#format").change(function() {
		$("#datepicker").datepicker("option", "dateFormat", $(this).val());
		});
		});
		});
	
	
	
	$("#departing").datepicker({
		changeMonth:true,
		changeYear:true
	});
    $("#returning").datepicker({
		changeMonth:true,
		changeYear: true
    });
	$("#exdate").datepicker({
		changeMonth:true,
		changeYear:true
	});
	/*$("#dateofbirth").datepicker({
		changeMonth:true,
		changeYear:true
	});*/
    $("button").click(function() {
    	var selected = $("#dropdown option:selected").text();
        var departing = $("#departing").val();
        var returning = $("#returning").val();
        if (departing === "" || returning === "") {
			alert("Please select departing and returning dates.");
        } else {
			confirm("Would you like to go to " + selected + " on " + departing + " and return on " + returning + "?");
        }
    });
/*
        $('#exdate').datetimepicker();

        $('#dateofbirth').datetimepicker();*/

	
});