var app=angular.module('OnlineClinicSystem',['ngRoute']);
app.config(function($routeProvider) {
  $routeProvider
  .when("/", {	
	templateUrl:'./template/login/userLogin.html'

  }).when("/userSignUp",{
	templateUrl:'./template/login/userSignUp.html',
	controller:'UserLoginController',
});
  });
  
