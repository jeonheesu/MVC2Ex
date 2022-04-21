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
		alert("작성자 입력 해주세요");
		return;
	}
	
	boardRegistForm.submit();
	
		
	})
	
	
	
	
	
})