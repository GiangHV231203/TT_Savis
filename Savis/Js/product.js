window.ProdController = function ($scope, $http) {
  $scope.lstProducts = [];
  $http.get("http://localhost:3000/products").then(function (response) {
    $scope.lstProducts = response.data;
  });

  $scope.details = function (id) {
    $http.get("http://localhost:3000/products/" + id).then(function (response) {
      $scope.id = response.data.id;
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
  };

  $scope.delete = function (id) {
    $http
      .delete("http://localhost:3000/products/" + id)
      .then(function (response) {
        if (response.status === 200) {
          alert("Xóa thành công!");
        }
      });
  };
};
