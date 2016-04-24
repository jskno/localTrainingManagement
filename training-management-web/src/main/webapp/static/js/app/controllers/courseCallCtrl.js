trainingApp.controller('courseCallCtrl',
		function($rootScope, $scope, courseResourceRest) {
		
			$scope.myOrderBy = 'description';
			
			$scope.orderByMe = function(x) {
				$scope.myOrderBy = x;
			}
				
			$scope.search = function() {
				courseResourceRest.get(function(data) {
					$scope.resultado = data.courseData;
				});
			}
			
			
	        
	});