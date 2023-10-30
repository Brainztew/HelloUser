console.log("hej från JS");

let admin = false;

loginBtn.addEventListener("click", () => {
    let user = document.getElementById("user");
    let password = document.getElementById("password")
    console.log("knappjävel! " + user.value + password.value)
    if (user.innerText == admin) {
      if(password.innerText == admin)
      {
        console.log("Hej admin");
        let link = document.createElement("a");
        link.innerText = "Admin"
        link.href="/form"
        document.body.appendChild(link)
      }
      else {
        console.log("error");
      }
  }

}) 

