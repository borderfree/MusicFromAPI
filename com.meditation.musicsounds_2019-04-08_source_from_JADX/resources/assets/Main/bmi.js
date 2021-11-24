		function reset()
		{
			$("input#height").val("");
			$("input#weight").val("");
			$("input#age").val("");
			$('input:radio[name=gender]')[0].checked = true;
			//$("div.result").hide();
			$("div.error").hide();
			$('a#metric').click()
		}
		
		function validate()
        {
         $height = $("input#height").val();
         $weight = $("input#weight").val();
         $age = $("input#age").val();
         
         if($height == "" || $weight == "" || $age == "" )
			return "Please fill all the fields!";	
         
         if((!isValidInput($height) || !isValidInput($weight) || !isValidInput($age)))
         return "Please fill in all the fields with positive numbers!";
         
         if($height<0)
			return "Height must be greater than zero!";
		if($weight<0)
			return "Weight must be greater than zero!";
		 if($age<2 || $age>120)
			return "Age must be between 2 and 120!";
			
         
         else
         return true;
         }
         
         function isValidInput(a){
         return !(isNaN(a));
         }
		 
		 function calcBMI(a)
		 {
			if(a==0)
				return ($("input#weight").val()/($("input#height").val()/100*$("input#height").val()/100)).toFixed(2);
			else
				return ((703.06*$("input#weight").val())/(($("input#height").val()*$("input#height").val()))).toFixed(2);
		 }
		 
		function calc()
		{
			if(validate()==true)
			{
				$("div.error").hide();
				$("div.result").text(calcBMI($("input#scale").val()));
				$('#myModal').modal({
					keyboard: true
				})

				//$("div.result").show();
			}
			else
			{
				//$("div.result").hide();
				$("div.error").show();
				$("div.error strong").text(validate());		
         }
		 
		 }
		 function metric($curr)
		 {
			if($('input#scale').val()==1){
			$('input#scale').val('0');
			$('li').removeClass('active');
			$curr.parent().addClass('active');
			$('span#height-label').text('Height (cm)');
			$('span#weight-label').text('Weight (Kg)');
			$("div.error").hide();
			//$("div.result").hide();
			$weight = $("input#weight").val();
			$height = $("input#height").val();
			$("input#weight").val(($weight/2.2).toFixed(2));
			$("input#height").val(($height*2.54).toFixed(2));
			}
		 }
		 
		 function us($curr)
		 {
			if($('input#scale').val()==0){
			$('input#scale').val('1');
			$('li').removeClass('active');
			$curr.parent().addClass('active');
			$('span#height-label').text('Height (in)');
			$('span#weight-label').text('Weight (lb)');
			$("div.error").hide();
			//$("div.result").hide();
			$weight = $("input#weight").val();
			$height = $("input#height").val();
			$("input#weight").val(($weight*2.2).toFixed(2));
			$("input#height").val(($height/2.54).toFixed(2));
			}
		 }