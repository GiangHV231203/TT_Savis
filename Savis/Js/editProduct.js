window.detailController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/products/" + id).then(function (response) {
    $scope.maprod = response.data.maprod;
    $scope.name = response.data.name;
    $scope.chatlieu = response.data.chatlieu;
    $scope.gia = response.data.gia;
    $scope.soluongton = response.data.soluongton;
    $scope.made = response.data.made;
    $scope.mamau = response.data.mamau;
    $scope.mansx = response.data.mansx;
    $scope.mota = response.data.mota;
    $scope.status = response.data.status;
  });

  $scope.update = function (id) {
    $http
      .put("http://localhost:3000/products/" + $scope.id, {
        maprod: $scope.maprod,
        name: $scope.name,
        chatlieu: $scope.chatlieu,
        gia: $scope.gia,
        soluongton: $scope.soluongton,
        made: $scope.made,
        mamau: $scope.mamau,
        mansx: $scope.mansx,
        mota: $scope.mota,
        status: $scope.status,
      })
      .then(function (response) {
        if (response.status === 200) {
          alert("Sửa sản phẩm thành công");
        }
      });
    history.back();
  };
};
