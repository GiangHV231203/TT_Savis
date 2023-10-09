window.addVoucherController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/vouchers/" + id).then(function (response) {
    $scope.maVoucher = response.data.maVoucher;
    $scope.tenVoucher = response.data.tenVoucher;
    $scope.batdau = response.data.batdau;
    $scope.ketthuc = response.data.ketthuc;
    $scope.giatrigiam = response.data.giatrigiam;
    $scope.giamtoida = response.data.giamtoida;
    $scope.hinhthuc = response.data.hinhthuc;
    $scope.trangthai = response.data.trangthai;
  });

  $scope.add = function () {
    if ($scope.maVoucher == null) {
      alert("Mã phiếu không được bỏ trống");
    } else if ($scope.tenVoucher == null) {
      alert("Tên phiếu không được bỏ trống");
    } else if ($scope.batdau < Date.now()) {
      alert("Ngày bắt đầu không được < ngày hiện tại");
    } else if ($scope.ketthuc <= $scope.batdau) {
      alert("Ngày kết thúc không được < hoặc = ngày bắt đầu");
    } else if ($scope.giatrigiam < 1) {
      alert("Giá trị giảm phải > 1");
    } else if ($scope.giamtoida > 50) {
      alert("Giá trị giảm tối đa không > 50");
    } else if ($scope.hinhthuc == null) {
      alert("Hình thức không được bỏ trống");
    } else {
      $http
        .post("http://localhost:3000/vouchers", {
          maVoucher: $scope.maVoucher,
          tenVoucher: $scope.tenVoucher,
          batdau: $scope.batdau,
          ketthuc: $scope.ketthuc,
          giatrigiam: $scope.giatrigiam,
          giamtoida: $scope.giamtoida,
          hinhthuc: $scope.hinhthuc,
          trangthai: $scope.trangthai,
        })
        .then(function (response) {
          if (response.status === 201) {
            alert("Thêm thành công");
          }
        });
    }
    history.back();
  };
};
