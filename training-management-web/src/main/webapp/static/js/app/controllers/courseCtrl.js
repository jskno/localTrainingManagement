trainingApp.controller('courseCtrl',
		function($rootScope, $scope, courseResourceRest) {
		
			$scope.myOrderBy = 'description';
			
			courseResourceRest.get(function(data) {
					$scope.resultado = data.courseData;
			});
			
			$scope.orderByMe = function(x) {
				$scope.myOrderBy = x;
			}
				
			$scope.search = function() {
				courseResourceRest.get(function(data) {
					$scope.resultado = data.courseData;
				});
			}
			
			$scope.filter = function(courseId) {
				courseResourceRest.get({id:courseId}, function(data) {
					$scope.resultado = data;
				});
			}
			
			$scope.borrar = function(courseId) {
				courseResourceRest.remove({id: courseId});
			}
			
			
	        
	});