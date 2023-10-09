// Bắt sự kiện khi người dùng nhập từ khóa tìm kiếm và ấn Enter
const searchInput = document.getElementById("searchInput");
searchInput.addEventListener("keypress", function (event) {
    if (event.key === "Enter") {
        const keyword = searchInput.value.trim().toLowerCase();
        searchProducts(keyword);
    }
});

// Tìm kiếm sản phẩm theo từ khóa
function searchProducts(keyword) {
    const filteredProducts = products.filter(product => {
        const productName = product.TenSanPham.toLowerCase();
        return productName.includes(keyword);
    });

    // Hiển thị danh sách sản phẩm sau khi tìm kiếm
    displayProducts(filteredProducts);
}
