window.detailColorController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/colors/" + id).then(function (response) {
    $scope.mamau = response.data.mamau;
    $scope.tenmau = response.data.tenmau;
  });

  $scope.update = function (id) {
    $http
      .put("http://localhost:3000/colors/" + $scope.id, {
        mamau: $scope.mamau,
        tenmau: $scope.tenmau,
      })
      .then(function (response) {
        if (response.status === 200) {
          alert("Sửa thành công");
        }
      });
    history.back();
  };
};
