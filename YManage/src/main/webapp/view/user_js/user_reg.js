class users{
    constructor(userName,pwd,sex,age,phone,email){
        this.userName = userName;
        this.pwd = pwd;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}

function submit() {
    let name = document.getElementById("user-name").value.trim();
    let pwd = document.getElementById("pwd").value.trim();
    let pwd2 = document.getElementById("pwd2").value.trim();
    let age = document.getElementById("age").value.trim();
    let phone = document.getElementById("phone").value.trim();
    let email = document.getElementById("email").value.trim();
    let primaryradio1 = document.getElementById("primaryradio1").value.trim();
    
    if (name.length == 0) {
        document.getElementById("name-danger").innerHTML="<div class='input-red'>请输入用户名</div>";
    } else{
        document.getElementById("name-danger").innerHTML="";
    } 
    if (pwd.length == 0) {
        document.getElementById("pwd-danger").innerHTML="<div class='input-red'>密码</div>";
    } else{
        document.getElementById("pwd-danger").innerHTML="";
    } 
    if (pwd2.length == 0) {
        document.getElementById("pwd2-danger").innerHTML="<div class='input-red'>请输入确认密码</div>";
    } else{
        document.getElementById("pwd2-danger").innerHTML="";
    } 
    if (age.length == 0) {
        document.getElementById("age-danger").innerHTML="<div class='input-red'>请输入年龄</div>";
    } else{
        document.getElementById("age-danger").innerHTML="";
    } 
    if (phone.length == 0) {
        document.getElementById("phone-danger").innerHTML="<div class='input-red'>请输入手机号</div>";
    } else{
        document.getElementById("phone-danger").innerHTML="";
    } 

    if (email.length == 0) {
        document.getElementById("email-danger").innerHTML="<div class='input-red'>请输入通讯地址</div>";
    } else{
        document.getElementById("email-danger").innerHTML="";
    } 


    let user = new users(name,pwd,sex,age,phone,email);
    


}

