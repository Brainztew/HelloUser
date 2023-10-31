console.log("Hej från js");


if (JSON.parse(localStorage.getItem("admin"))) {
  if (admin = true) {
    console.log("admin finns");
    let link = document.createElement("a");
    link.innerText = "Admin";
    link.href="/form";
    document.body.appendChild(link);}
  else {
    console.log("Skapar LS");
    localStorage.setItem("admin", JSON.stringify(false))
  } 
} 



loginBtn.addEventListener("click", () => {
  let user = document.getElementById("user");
  let password = document.getElementById("password");
  console.log("knappjävel! " + user.value + password.value);

    if (user.value == "admin" && password.value == "admin") {
        console.log("Snälla funka!");
        let admin = JSON.parse(localStorage.getItem("admin"));
        admin = true;
        localStorage.setItem("admin", JSON.stringify(true));
        console.log(admin);
        location.reload();
/*         let link = document.createElement("a");
        link.innerText = "Admin";
        link.href="/form";
        document.body.appendChild(link); */


    }})



