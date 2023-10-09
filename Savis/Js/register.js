window.registerController = function ($scope, $http) {
  $scope.register = function () {
    if ($scope.username == null) {
      alert("Username không được bỏ trống");
    } else if ($scope.email == null) {
      alert("Email không được bỏ trống");
    } else if ($scope.password == null) {
      alert("Confirm Password không được bỏ trống");
    } else if ($scope.passwordConfirm == null) {
      alert("Confirm Password không được bỏ trống");
    } else if ($scope.password != $scope.passwordConfirm) {
      alert("Confirm Password phải giống với Password");
    } else {
      $http
        .post("http://localhost:3000/userAccounts", {
          id: $scope.id,
          username: $scope.username,
          email: $scope.email,
          password: $scope.password,
          passwordConfirm: $scope.passwordConfirm,
        })
        .then(function (response) {
          if (response.status == 201) {
            alert("Đăng ký thành công");
          }
        });
    }
  };
};
