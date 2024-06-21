function showDetails(name, theme, price, edition, color) {
    const detailsContent = `
        <strong>Product Name:</strong> ${name}<br>
        <strong>Theme:</strong> ${theme}<br>
        <strong>Price:</strong> $${price}<br>
        <strong>Edition:</strong> ${edition}<br>
        <strong>Color:</strong> ${color}
    `;

    // Find the product details container
    const detailsContainer = document.getElementById('product-details');

    // Update the content of the product details
    const detailsContentElement = document.getElementById('details-content');
    detailsContentElement.innerHTML = detailsContent;

    // Scroll to the product details section
    detailsContainer.scrollIntoView({ behavior: 'smooth' });
}