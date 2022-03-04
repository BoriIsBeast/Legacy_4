/**
 * 
 */

//ID, PW, NAME , EMAIL, PHONE
const idx = document.getElementById("idx");
const idResult = document.getElementById("idResult");
const pw = document.getElementById("pw");
const pwResult = document.getElementById("pwResult");
const pw2 = document.getElementById("pw2");
const pwResult2 = document.getElementById("pwResult2");
const name = document.getElementById("name");
const email = document.getElementById("email");
const phone = document.getElementById("phone");
const btn = document.getElementById("btn");
const frm = document.getElementById("frm");

let pwCheck = true; // 같지않을때 true, 같으면 false

//PW와 PW2가 같은지 검증
pw2.addEventListener('blur', function(){
    let message = "pw가 일치합니다";
    if(pw.value != pw2.value){
        pwCheck =true;
        message = "PW가 일치하지 않습니다."
        pw2.value='';
        
    }else {
        pwCheck=false;
    }

    pwResult2.innerHTML =message;
});


//---- 검증이 끝난 pw를 수정했을 경우 
pw.addEventListener('change', function(){
    pwCheck =true;
    pw2.value=''
    pwResult.value='';
    pw.focus();
});

//----------- PW 길이 검증 ---------------
pw.addEventListener('blur', function(){
    if(pw.value.length<8 || pw.value.length>12){
        pwResult.innerHTML='PW의 글자수가 맞지 않습니다.'
        
    }

});

//------------ ID 입력 후  ---------------
idx.addEventListener('blur', function(){
    if(idx.value==''){
        idResult.innerHTML='ID를 입력하세요';
        
    }

});


// -----------가입버튼 클릭 ---------------
btn.addEventListener("click", function(){
    
    if(idx.value==''){
        alert('ID를 입력하세요');
        idx.focus();
        return;
    }
   
    if(pw.value== '' || pw.value.length<8 ||pw.value.length>12){
        alert('PW가 정확하지 않습니다.')
        pw.focus();
        return;
    }

    if(pwCheck){
        alert('pw가 일치하지 않습니다.');
        pw2.focus();
        return;

    }

    if(name.value== ''){
        alert('NAME를 입력하세요')
        name.focus();
        return;
    }

    if(phone.value== ''){
        alert('Phone를 입력하세요')
        phone.focus();
        return;
    }

    if(email.value== ''){
        alert('Email를 입력하세요')
        email.focus();
        return;
    }
    
    frm.submit();
});


