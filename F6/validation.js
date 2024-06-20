document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("registerform");

    function handleSubmit(event) {
        event.preventDefault();

        // Perform basic validation
        let lastname = document.getElementById("lastname").value;
        let firstname = document.getElementById("firstname").value;
        let middlename = document.getElementById("middlename").value;
        let email = document.getElementById("emailaddress").value;
        let contactno = document.getElementById("contactno").value;
        let address = document.getElementById("address").value;
        let gender = document.getElementById("gender").value;
        let civilstatus = document.getElementById("civilstatus").value;

        if (lastname && firstname && middlename && email && contactno && address && gender && civilstatus) {
            // Redirect to login.html
            window.location.href = "login.html";
        } else {
            alert("Please fill out all fields.");
        }
    }

    form.addEventListener("submit", handleSubmit);
});
