app.controller('UserLoginController', function($scope, $http, $location,
$route) {
$scope.submitUserForm = function() {
$http({
method : 'POST',
data : $scope.user,
url : 'http://localhost:8080/userRegistration/',

}).then(function(response) {
$location.path("/");
$route.reload();
}, function(errResponse) {
$scope.errorMessage = errResponse.data.errorMessage;
});
}

});

app.controller('findUser',function($scope, $http, $location,
$route){
	$scope.
	$http({
method : 'POST',
data : $scope.user,
url : 'http://localhost:8080/userLogin/',

}).then(function(response) {
$location.path("/");
$route.reload();
}, function(errResponse) {
$scope.errorMessage = errResponse.data.errorMessage;
});
	
});