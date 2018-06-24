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
	$(document).ready(function() {
		// Datepicker Popups calender to Choose date.
		$(function() {
		$("#expirationdate").datepicker({
			changeMonth:true,
			changeYear:true
		});
		// Pass the user selected date format.
		$("#format").change(function() {
		$("#datepicker").datepicker("option", "dateFormat", $(this).val());
		});
		});
		});
});




