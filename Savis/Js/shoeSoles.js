window.ShoeSolesController = function ($scope, $http) {
  $scope.lstShoeSoles = [];
  $http.get("http://localhost:3000/shoeSoles").then(function (response) {
    $scope.lstShoeSoles = response.data;
  });

  $scope.details = function (id) {
    $http
      .get("http://localhost:3000/shoeSoles/" + id)
      .then(function (response) {
        $scope.made = response.data.made;
        $scope.ten = response.data.ten;
        $scope.mota = response.data.mota;
      });
  };

  $scope.delete = function (id) {
    $http
      .delete("http://localhost:3000/shoeSoles/" + id)
      .then(function (response) {
        if (response.status === 200) {
          alert("Xóa thành công!");
        }
      });
  };
};
