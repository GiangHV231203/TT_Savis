window.loginController = function ($scope, $http) {
  $scope.lstAccounts = [];
  $http.get("http://localhost:3000/userAccounts").then(function (response) {
    $scope.lstAccounts = response.data;
  });
  $scope.login = function (username, password) {
    let flag = false;
    $scope.lstAccounts.forEach((e) => {
      if (username == null || password == null) {
        alert("Vui lòng nhập đủ thông tin");
      } else if (username == e.username && password == e.password) {
        flag = true;
      }
      if (flag) {
        alert("Đăng nhập thành công");
      } else {
        alert("Đăng nhập thất bại");
      }
    });
  };
};
