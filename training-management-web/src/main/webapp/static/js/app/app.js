'use strict';

/* App Module */

var trainingApp = angular.module('training', ['ngRoute', 'ngResource']);

trainingApp.controller('mainCtrl',
		function($rootScope, $scope, $location) {
		
			$scope.title = 'GESTIÓN DE LA FORMACIÓN';
			
			$rootScope.go = function (path) {
				$location.path(path);
			};
});

trainingApp.factory('courseResourceRest', function($resource) {
	return $resource('rest/course/:id');
});

trainingApp.factory('menusRest', function($resource) {
	return $resource('rest/menus');
});



