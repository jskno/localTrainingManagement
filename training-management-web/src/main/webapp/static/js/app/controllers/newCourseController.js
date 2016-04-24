trainingApp.controller('newCourseController',
		function($rootScope, $scope, courseResourceRest, menusRest) {
	
	$scope.description = "Java Shit";
	
	menusRest.get(function(data) {
		$scope.types = data.types;
		$scope.positions = data.positions; 
	});
	
	$scope.save = function() {
		courseResourceRest.save({
			"courseId"		    :	$scope.courseId,
			"description"		:	$scope.description,
			"courseTypeDataId"  :	$scope.courseTypeData.courseTypeId,
			"positionsDataIds"	:	$scope.positionsDataIds,
			"company"			:	$scope.company,
			"existContent"		:	$scope.existContent,
			"contentDescription":	$scope.contentDescription
		});
	}
	
//	$scope.save = function() {
//		courseResourceRest.save({courseData : $scope.courseData});
//	}
	
	$scope.search = function() {
		menusRest.get(function(data) {
			$scope.types = data.types;
			$scope.positions = data.positions; 
		});
	}
	
	
});