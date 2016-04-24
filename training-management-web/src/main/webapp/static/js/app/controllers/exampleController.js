trainingApp.controller('courseController',
	function($scope) {
	
		$scope.firstName = 'ANDREW';
		$scope.lastName = 'Doe';
		$scope.ourse = '134';
	
		$scope.fillIn = function() {
			$scope.id = "155";
			$scope.description = 'MySQL';
			$scope.type ="Carrera";
			$scope.managerOrganisation = "Univ Coorp";
			$scope.place = "Murcia";
		}
		
		$scope.data = [
		                {name:'Jani',country:'Norway'},
		                {name:'Carl',country:'Sweden'},
		                {name:'Margareth',country:'England'},
		                {name:'Hege',country:'Norway'},
		                {name:'Joe',country:'Denmark'},
		                {name:'Gustav',country:'Sweden'},
		                {name:'Birgit',country:'Denmark'},
		                {name:'Mary',country:'England'},
		                {name:'Kai',country:'Norway'}
		              ];
		
        $scope.orderByMe = function(x) {
        			$scope.myOrderBy = x;
        }
        
        
        
});
	