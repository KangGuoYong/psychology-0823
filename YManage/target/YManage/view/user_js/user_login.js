class users {
    constructor(userName, pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
}
function submit() {
    let name = document.getElementById("user-name").value.trim();
    let pwd = document.getElementById("pwd").value.trim();
    let ma = document.getElementById("yanzhengma").value.trim();

    if (name.length == 0) {
        document.getElementById("name-danger").innerHTML = "<div class='input-red'>请输入用户名</div>";
    } else {
        document.getElementById("name-danger").innerHTML = "";
    }
    if (pwd.length == 0) {
        document.getElementById("pwd-danger").innerHTML = "<div class='input-red'>请输入密码</div>";
    } else {
        document.getElementById("pwd-danger").innerHTML = "";

    }
    if (ma.length == 0) {
        document.getElementById("yanzhengma-danger").innerHTML = "<div class='input-red'>请输入验证码</div>";
    } else {
        document.getElementById("yanzhengma-danger").innerHTML = "";
    }
    let user = {
        userName:name,
        pwd:pwd,
    }

    $.get("/users/queryUser", user,function (data) {
        alert(data);
        console.log(data);
    });
}