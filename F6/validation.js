function validateForm() {
    let lastname = document.getElementById("lastname").value;
    let firstname = document.getElementById("firstname").value;
    let middlename = document.getElementById("middlename").value;
    let email = document.getElementById("emailaddress").value;
    let contactno = document.getElementById("contactno").value;
    let address = document.getElementById("address").value;
    let gender = document.getElementById("gender").value;
    let civilstatus = document.getElementById("civilstatus").value;

    if (lastname === "" || firstname === "" || middlename === "" || email === "" || contactno === "" || address === "" || gender === "" || civilstatus === "") {
        alert("All fields must be filled out.");
        return false;
    }
    return true;
}

function submitToPage() {
    if (validateForm()) {
        window.location = "login.html";
    }
}
