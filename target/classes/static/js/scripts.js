document.addEventListener('DOMContentLoaded', function() {
    console.log("JavaScript loaded!");
    // Additional JavaScript functionalities can be added here.

    // Example of adding event listener to all "Add to Cart" buttons
    const addToCartButtons = document.querySelectorAll('.product-item .btn');
    addToCartButtons.forEach(button => {
        button.addEventListener('click', function() {
            alert('Product added to cart!');
        });
    });
});
