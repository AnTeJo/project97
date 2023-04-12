const form = document.getElementById('payment-form');

form.addEventListener('submit', function(event) {
  event.preventDefault();

  const formData = new FormData(form);

  fetch('/payments', {
    method: 'POST',
    body: formData
  })
  .then(response => response.json())
  .then(data => {
    alert('Payment created successfully');
    form.reset();
  })
  .catch(error => {
    console.error('Error:', error);
    alert('An error occurred. Please try again later.');
  });
});
