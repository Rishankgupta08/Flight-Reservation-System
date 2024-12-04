document.addEventListener("DOMContentLoaded", function () {
    // Form validation
    const loginForm = document.querySelector('form');
    loginForm.addEventListener('submit', function (e) {
        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;
        
        if (username === '' || password === '') {
            alert('Please fill out all fields');
            e.preventDefault();
        }
    });
});
