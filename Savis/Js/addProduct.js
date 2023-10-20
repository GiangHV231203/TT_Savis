window.addController = function ($scope, $http, $routeParams) {
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

  $scope.add = function () {
    if ($scope.maprod == null) {
      alert("Mã sản phẩm không được bỏ trống");
    } else if ($scope.name == null) {
      alert("Tên sản phẩm không được bỏ trống");
    } else if ($scope.chatlieu == null) {
      alert("Chất liệu không được bỏ trống");
    } else if ($scope.gia == null) {
      alert("Giá không được bỏ trống");
    } else if ($scope.soluongton == null) {
      alert("Số lượng tồn không được bỏ trống");
    } else if ($scope.made == null) {
      alert("Mã loại đế không được bỏ trống");
    } else if ($scope.mamau == null) {
      alert("Mã màu không được bỏ trống");
    } else if ($scope.mansx == null) {
      alert("Mã nhà sản xuất không được bỏ trống");
    } else if ($scope.gia <= 0) {
      alert("Giá sản phẩm phải > 0");
    } else if ($scope.soluongton <= 0) {
      alert("Số lượng tồn phải > 0");
    } else {
      $http
        .post("http://localhost:3000/products", {
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
          if (response.status === 201) {
            alert("Thêm thành công");
          }
        });
    }
    history.back();
  };
};
