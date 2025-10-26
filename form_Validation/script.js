function myfunction(event)
{
     event.preventDefault();
    let x=document.getElementById("abc").value;
    const namePattern = /^[A-Za-z ]+$/;
    const nameRes = x.match(namePattern);
    if (x === "") {
        document.getElementById("para1").innerHTML = "Name is required!";
    } else if (!nameRes) {
        document.getElementById("para1").innerHTML = "Enter letters only!";
    } else {
        document.getElementById("para1").innerHTML = "";
    }


    let y=document.getElementById("num").value;
    if(isNaN(y)||y === "")
    {
        document.getElementById("para2").innerHTML = "enter a number!";
    }else if (y<18) {
        document.getElementById("para2").innerHTML = "Age must be greater than 18";
    }else {
        document.getElementById("para2").innerHTML = "";
    }
    

    let text = document.getElementById("pass").value;
    const pattern = /^[A-Za-z]{3,}$/;
    let result = text.match(pattern);
    if(!result) {
        document.getElementById("para3").innerHTML = "enter a valid password";
    }
    else {
        document.getElementById("para3").innerHTML = "";
    }

    let rePass = document.getElementById("repass").value;
    if(rePass !== text) {
        document.getElementById("para4").innerHTML = "enter the correct password";
    }
    else {
        document.getElementById("para4").innerHTML = "";
    }
    
    let input=document.getElementById("email").value;
    const pat=/^[^\s@]+@[^\s@]+\.[^\s@]+$/
    let res = input.match(pat);
    if(!res) {
        document.getElementById("para5").innerHTML = "enter a valid email";
    }
    else {
        document.getElementById("para5").innerHTML = "";
    }
     if (
        x.match(namePattern) &&
        !isNaN(y) &&
        parseInt(y) >= 18 &&
        text.match(pattern) &&
        rePass === text &&
        input.match(pat)
      ) {
        alert("Form submitted successfully!");
      }
}