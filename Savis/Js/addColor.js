window.addColorController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/colors/" + id).then(function (response) {
    $scope.mamau = response.data.mamau;
    $scope.tenmau = response.data.tenmau;
  });

  $scope.add = function () {
    if ($scope.mamau == null) {
      alert("Mã màu không được bỏ trống");
    } else if ($scope.tenmau == null) {
      alert("Tên màu không được bỏ trống");
    } else {
      $http
        .post("http://localhost:3000/colors", {
          mamau: $scope.mamau,
          tenmau: $scope.tenmau,
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
