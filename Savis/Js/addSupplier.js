window.addSupplierController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/suppliers" + id).then(function (response) {
    $scope.mansx = response.data.mansx;
    $scope.tennsx = response.data.tennsx;
    $scope.trangthai = response.data.trangthai;
  });

  $scope.add = function () {
    if ($scope.mansx == null) {
      alert("Mã NSX không được bỏ trống");
    } else if ($scope.tennsx == null) {
      alert("Tên NSX không được bỏ trống");
    } else {
      $http
        .post("http://localhost:3000/suppliers", {
          mansx: $scope.mansx,
          tennsx: $scope.tennsx,
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
