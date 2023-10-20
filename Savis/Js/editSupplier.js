window.detailSupplierController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/suppliers/" + id).then(function (response) {
    $scope.mansx = response.data.mansx;
    $scope.tennsx = response.data.tennsx;
    $scope.trangthai = response.data.trangthai;
  });

  $scope.update = function (id) {
    $http
      .put("http://localhost:3000/suppliers/" + $scope.id, {
        mansx: $scope.mansx,
        tennsx: $scope.tennsx,
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
