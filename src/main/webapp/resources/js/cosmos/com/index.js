$(document).ready(function() {
	$("#btn").click(function(){
	  $.ajax({
		type: "GET",
        url:'/cosmos/list',
        dataType: 'json',
        success: function (data) {
		console.log(data);
		setData(data);
       }
  });


  function setData(result) {
	 $('#dataTable').DataTable({
					 data: result.cosmos,
					 "columns": 
		                [
		                    { "data": "id" },
		                    { "data": "pw" },
		                    { "data": "name" },
		                    { "data": "addr" },
		                    { "data": "email" }
	           ],
	      });
		}	
	});
});  


