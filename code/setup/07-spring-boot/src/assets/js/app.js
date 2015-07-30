//= wrapped
//= require angular/js/angular 

angular.module('myApp', [])
	.controller('HelloController', function() {
		var vm = this;
		vm.message = 'Hello World';
	});