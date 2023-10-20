window.SupplierController = function ($scope, $http) {
  $scope.lstNsx = [];
  $http.get("http://localhost:3000/suppliers").then(function (response) {
    $scope.lstNsx = response.data;
  });

  $scope.details = function (id) {
    $http
      .get("http://localhost:3000/suppliers/" + id)
      .then(function (response) {
        $scope.mansx = response.data.mansx;
        $scope.tennsx = response.data.tennsx;
        $scope.trangthai = response.data.trangthai;
      });
  };

  $scope.delete = function (id) {
    $http
      .delete("http://localhost:3000/suppliers/" + id)
      .then(function (response) {
        if (response.status === 200) {
          alert("Xóa thành công!");
        }
      });
  };
};
