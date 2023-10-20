window.detailVoucherController = function ($scope, $http, $routeParams) {
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

  $scope.update = function (id) {
    $http
      .put("http://localhost:3000/vouchers/" + $scope.id, {
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
        if (response.status === 200) {
          alert("Sửa thành công");
        }
      });
    history.back();
  };
};
