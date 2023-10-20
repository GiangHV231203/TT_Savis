window.ColorController = function ($scope, $http) {
  $scope.lstColor = [];
  $http.get("http://localhost:3000/colors").then(function (response) {
    $scope.lstColor = response.data;
  });

  $scope.details = function (id) {
    $http.get("http://localhost:3000/colors/" + id).then(function (response) {
      $scope.mamau = response.data.mamau;
      $scope.tenmau = response.data.tenmau;
    });
  };

  $scope.delete = function (id) {
    $http
      .delete("http://localhost:3000/colors/" + id)
      .then(function (response) {
        if (response.status === 200) {
          alert("Xóa thành công!");
        }
      });
  };
};
