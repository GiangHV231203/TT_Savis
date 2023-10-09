// Đường dẫn đến API của bạn
const apiUrl = "http://localhost:8080/san-pham";

// Lấy danh sách sản phẩm từ API
function getAllProducts() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const productList = document.getElementById("productList");
            productList.innerHTML = ""; // Xóa danh sách cũ (nếu có)

            data.forEach(product => {
                const listItem = document.createElement("li");
                listItem.textContent = `Mã sản phẩm: ${product.MaSanPham} - Tên sản phẩm: ${product.TenSanPham} - Giá: ${product.GiaHienHanh}`;
                productList.appendChild(listItem);

                // Bắt sự kiện khi nhấn vào một sản phẩm để xem chi tiết
                listItem.addEventListener("click", () => {
                    showProductDetail(product);
                });
            });
        })
        .catch(error => {
            console.log(error);
        });
}

// Lấy thông tin chi tiết sản phẩm dựa trên mã sản phẩm
function fetchProductDetail(productId) {
    const apiUrl = `http://localhost:8080/san-pham/${productId}`;
    fetch(apiUrl)
        .then(response => response.json())
        .then(product => {
            // Hiển thị thông tin chi tiết sản phẩm trên trang web
            displayProductDetail(product);
        })
        .catch(error => {
            console.error(error);
        });
}
// Hiển thị thông tin chi tiết sản phẩm
function displayProductDetail(product) {
    const productDetailElement = document.getElementById("productDetail");
    productDetailElement.innerHTML = `
        <h2>Thông tin chi tiết sản phẩm</h2>
        <p>Mã sản phẩm: ${product.MaSanPham}</p>
        <p>Tên sản phẩm: ${product.TenSanPham}</p>
        <p>Chất liệu: ${product.ChatLieu}</p>
        <p>Giá hiện hành: ${product.GiaHienHanh}</p>
        <p>Số lượng tồn: ${product.SoLuongTon}</p>
        <p>Mô tả: ${product.MoTa}</p>
        <p>Trạng thái: ${product.TrangThai}</p>
        <p>Loại đế: ${product.ma_loaiDe}</p>
        <p>Màu sắc: ${product.ma_mauSac}</p>
        <p>Nhà sản xuất: ${product.ma_nhaSanXuat}</p>
        <p>Loại sản phẩm: ${product.ma_loaiSanPham}</p>
        <!-- Hiển thị thông tin khoá phụ dựa trên các thông tin ma_loaiDe, ma_mauSac, ma_nhaSanXuat, ma_loaiSanPham từ API -->
    `;
}
// Gọi hàm để lấy danh sách sản phẩm ban đầu
getAllProducts();
