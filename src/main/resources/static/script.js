
if (localStorage.getItem("admin") === "true") {
  console.log("admin exists");
  let link = document.createElement("a");
  link.innerText = "Admin";
  link.href = "/form";
  document.body.appendChild(link);
} else {
  console.log("Removing admin");
  let remove = document.getElementById("adminContent");
  if (remove) {
    remove.remove();
  }
}

loginBtn.addEventListener("click", () => {
  let user = document.getElementById("user");
  let password = document.getElementById("password");
  console.log("User: " + user.value + ", Password: " + password.value);

  if (user.value === "admin" && password.value === "admin") {
    localStorage.setItem("admin", "true");
    location.reload();
  }
});

