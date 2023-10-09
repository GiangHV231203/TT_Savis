app.controller('ChiTietGioHangCtrl', function($scope, $http) {
    $scope.cartDetails = []; // Mảng để lưu trữ chi tiết giỏ hàng

    // Hàm để thêm sản phẩm vào chi tiết giỏ hàng
    $scope.addToCartDetails = function(maGioHang, maSanPham, soLuong, ghiChu) {
        var gioHangChiTiet = {
            MaGioHang: maGioHang,
            MaSanPham: maSanPham,
            SoLuong: soLuong,
            GhiChu: ghiChu,
            TrangThai: 1 // Trạng thái mặc định (có thể thay đổi tùy thuộc vào ứng dụng của bạn)
        };

        // Gửi yêu cầu POST để thêm chi tiết giỏ hàng vào cơ sở dữ liệu
        $http.post('/api/chi-tiet-gio-hang', gioHangChiTiet)
            .then(function(response) {
                $scope.cartDetails.push(response.data); // Thêm chi tiết giỏ hàng vào mảng cartDetails
            });
    };

    // Hàm để xóa sản phẩm khỏi chi tiết giỏ hàng
    $scope.removeFromCartDetails = function(index) {
        var chiTietGioHang = $scope.cartDetails[index];

        // Gửi yêu cầu DELETE để xóa chi tiết giỏ hàng khỏi cơ sở dữ liệu
        $http.delete('/api/chi-tiet-gio-hang/' + chiTietGioHang.MaGioHang + '/' + chiTietGioHang.MaSanPham)
            .then(function() {
                $scope.cartDetails.splice(index, 1); // Xóa chi tiết giỏ hàng khỏi mảng cartDetails
            });
    };
});
