// Đường dẫn đến API của bạn
const apiUrl = "http://localhost:8080/admin/hoa-don";

// Lấy danh sách hoá đơn từ API
function getAllInvoices() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const invoiceList = document.getElementById("invoiceList");
            invoiceList.innerHTML = ""; // Xóa danh sách hoá đơn cũ (nếu có)

            data.forEach(invoice => {
                const listItem = document.createElement("li");
                listItem.textContent = `Mã hoá đơn: ${invoice.MaHoaDon} - Ngày lập: ${invoice.NgayLap} - Trạng thái: ${invoice.TrangThai}`;
                invoiceList.appendChild(listItem);

                // Bắt sự kiện khi nhấn vào một hoá đơn để xem chi tiết
                listItem.addEventListener("click", () => {
                    showInvoiceDetail(invoice.MaHoaDon);
                });
            });
        })
        .catch(error => {
            console.error(error);
        });
}

// Hiển thị thông tin chi tiết của hoá đơn
function showInvoiceDetail(invoiceId) {
    fetch(`${apiUrl}/${invoiceId}`)
        .then(response => response.json())
        .then(invoice => {
            const invoiceDetail = document.getElementById("invoiceDetail");
            invoiceDetail.innerHTML = ""; // Xóa thông tin chi tiết hoá đơn cũ (nếu có)

            const invoiceInfo = document.createElement("div");
            invoiceInfo.innerHTML = `
                <p>Mã hoá đơn: ${invoice.MaHoaDon}</p>
                <p>Ngày lập: ${invoice.NgayLap}</p>
                <p>Người lập: ${invoice.NguoiLap}</p>
                <p>Trạng thái: ${invoice.TrangThai}</p>
                <p>Nguoi mua: ${invoice.MaKhachHang}</p>
                <!-- Thêm các trường thông tin chi tiết hoá đơn khác tương tự -->
            `;

            invoiceDetail.appendChild(invoiceInfo);
        })
        .catch(error => {
            console.error(error);
        });
}

// Gọi hàm để lấy danh sách hoá đơn ban đầu
getAllInvoices();
