window.VoucherController = function ($scope, $http) {
  $scope.lstVoucher = [];
  $http.get("http://localhost:3000/vouchers").then(function (response) {
    $scope.lstVoucher = response.data;
  });

  $scope.details = function (id) {
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
  };

  $scope.delete = function (id) {
    $http
      .delete("http://localhost:3000/vouchers/" + id)
      .then(function (response) {
        if (response.status === 200) {
          alert("Xóa thành công!");
        }
      });
  };
};
