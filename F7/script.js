document.getElementById('loginForm').addEventListener('submit', function (event) {
    event.preventDefault();
    event.stopPropagation();

    if (this.checkValidity() === false) {
        this.classList.add('was-validated');
    } else {
        // Submit form if valid
        alert('Form submitted successfully!');
    }
});
