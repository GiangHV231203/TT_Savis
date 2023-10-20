window.addShoeSolesController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/shoeSoles/" + id).then(function (response) {
    $scope.made = response.data.made;
    $scope.ten = response.data.ten;
    $scope.mota = response.data.mota;
  });

  $scope.add = function () {
    if ($scope.made == null) {
      alert("Mã đế không được bỏ trống");
    } else if ($scope.ten == null) {
      alert("Tên đế không được bỏ trống");
    } else {
      $http
        .post("http://localhost:3000/shoeSoles", {
          made: $scope.made,
          ten: $scope.ten,
          mota: $scope.mota,
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
