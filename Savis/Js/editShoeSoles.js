window.detailShoeSolesController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/shoeSoles/" + id).then(function (response) {
    $scope.made = response.data.made;
    $scope.ten = response.data.ten;
    $scope.mota = response.data.mota;
  });

  $scope.update = function (id) {
    $http
      .put("http://localhost:3000/shoeSoles/" + $scope.id, {
        made: $scope.made,
        ten: $scope.ten,
        mota: $scope.mota,
      })
      .then(function (response) {
        if (response.status === 200) {
          alert("Sửa thành công");
        }
      });
    history.back();
  };
};
