$(function(){
	
	$('#boardRegistBtn').click(function(){
		
		
		
	var boardRegistForm = 	$('#boardRegistForm');
	
	
	var bTitle = $('#bTitle').val();
	var bContent = $('#bContent').val();
	var bWriter = $('#bWriter').val();
	
	if(bTitle == ""){
		alert("제목 입력 해주세요");
		return;
	}
	if(bContent == ""){
		alert("내용 입력 해주세요");
		return;
	}
	if(bWriter == ""){
	
		return;
	}
	
	boardRegistForm.submit();
	
		
	})
	
	$('#boardModifyBtn').click(function(){
	 
	  var boardModifyForm = $('#boardModifyForm');

     var bTitle = $('#bTitle').val();
	  var bContent = $('#bContent').val();

      if(bTitle == "" || bContent ==""){
	   alert("제목과 내용을 모두 적어주세요")
    }
	
	  boardModifyForm.submit();
	
	})
	
})