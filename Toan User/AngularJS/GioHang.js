app.controller('GioHangCtrl', function($scope, $http) {
    $scope.cart = []; // Mảng để lưu trữ các sản phẩm trong giỏ hàng
    $scope.ngayTao = new Date();
    $scope.ngayCapNhap = new Date();
    $scope.nguoiSoHuu = 1; // ID của người sở hữu (điều này cần thay đổi tùy thuộc vào ngữ cảnh của ứng dụng)

    // Hàm để thêm sản phẩm vào giỏ hàng
    $scope.addToCart = function() {
        var gioHang = {
            MaGioHang: generateUUID(), // Hàm generateUUID() để tạo mã GUID ngẫu nhiên
            NgayTao: $scope.ngayTao,
            NgayCapNhap: $scope.ngayCapNhap,
            NguoiSoHuu: $scope.nguoiSoHuu,
            GhiChu: $scope.ghiChu,
            TrangThai: $scope.trangThai
        };
        
        // Gửi yêu cầu POST để thêm giỏ hàng vào cơ sở dữ liệu
        $http.post('/api/gio-hang', gioHang)
            .then(function(response) {
                $scope.cart.push(response.data); // Thêm giỏ hàng vào mảng cart
            });
    };

    // Hàm để xóa sản phẩm khỏi giỏ hàng
    $scope.removeFromCart = function(index) {
        var gioHang = $scope.cart[index];

        // Gửi yêu cầu DELETE để xóa giỏ hàng khỏi cơ sở dữ liệu
        $http.delete('/api/gio-hang/' + gioHang.MaGioHang)
            .then(function() {
                $scope.cart.splice(index, 1); // Xóa giỏ hàng khỏi mảng cart
            });
    };

    // Hàm để tạo GUID ngẫu nhiên
    function generateUUID() {
        // Sử dụng thuật toán ngẫu nhiên để tạo GUID
        return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
            var r = Math.random() * 16 | 0,
                v = c == 'x' ? r : (r & 0x3 | 0x8);
            return v.toString(16);
        });
    }
});
