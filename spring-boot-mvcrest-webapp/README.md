
# Kid - Mathematician

A arithmetic game designed for kids using Spring boot and JQuery

## Demo

When the kids enters the correct results kid will be hearing pleasant(god) song and picture

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-mvcrest-webapp/screenshots/God.png)

When the kids enters the bloody results kid will be hearing dangerous(ghost) song and picture

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-mvcrest-webapp/screenshots/Ghost.png)

## Core muscle

```
	<script>
		function onClickSubmit(){
			var operand1    = $('input[name="operand1"]')[0].value,
				operand2    = $('input[name="operand2"]')[0].value,
				babyAnswer  = $('input[name="babyAnswer"]')[0].value,
				operation   = $('[name="operation"] option:selected').val(),
				result      = $('#result')[0];
			
			$('.imgElement').draggable();
	        $.ajax({
	        	url         : "http://localhost:8080/arithmetic",
	        	method      : 'POST',
	        	contentType : "application/json; charset=utf-8",
	        	dataType    : "json",
	        	data        : JSON.stringify({
       			  "operand1" : operand1,
       			  "operand2" : operand2,
       			  "operation": operation
	        	}),
	        	success : function(response){
	        		result.innerHTML = response.result;
	        		if(babyAnswer == response.result){
	        			$('#ghostSong')[0].pause();
	        			$('#godSong')[0].play();
	        			$('#ghostImg').hide(1000);
	        			$('.imgElement').show(1000);
	        			$('#godImg').show(1000);
	        		}
	        		else{
	        			$('#godSong')[0].pause();
	        			$('#ghostSong')[0].play();
	        			$('#ghostImg').show(1000);
	        			$('.imgElement').show(1000);
	        			$('#godImg').hide(1000);
	        		}
	        	},
	        	failure : function(response){
	        		$('.imgElement').hide();
	        		alert("Request failed!");
	        	}
	        });
		}
		
		function onClickStopSong(){
			$('#ghostSong')[0].pause();
			$('#godSong')[0].pause();			
		}
		
		function onClickImageClose(){
			$('.imgElement').hide(1000);
		}
	</script>
```

