trainingApp.config(['$routeProvider',
                    function($routeProvider) {
                      $routeProvider.
							when('/courses', {
								templateUrl: 'pages/course/index.html',
								controller: 'courseCtrl'
							}).
							when('/courses/new', {
								templateUrl: 'pages/course/new.html',
								controller: 'newCourseController'
							}).
							when('/coursecalls', {
								templateUrl: 'pages/course_call/index.html',
								controller: 'courseCallCtrl'
							}).
							when('/coursecalls/new', {
								templateUrl: 'pages/course_call/new.html',
								controller: 'courseCallCtrl'
							}).
							when('/examples/example1', {
								templateUrl: 'pages/examples/example1.html',
								controller: 'courseCtrl'
							}).
							when('/examples/example2', {
								templateUrl: 'pages/examples/example2.html',
								controller: 'courseCtrl'
							}).
							when('/examples/example3', {
								templateUrl: 'pages/examples/example3.html',
								controller: 'courseCtrl'
							}).
							when('/examples/example4', {
								templateUrl: 'pages/examples/example4.html',
								controller: 'courseCtrl'
							}).
							when('/examples/example5', {
								templateUrl: 'pages/examples/example5.html',
								controller: 'courseCtrl'
							}).
							when('/examples/example6', {
								templateUrl: 'pages/examples/example6.html',
								controller: 'courseCtrl'
							}).
							otherwise({
								redirectTo: '/'
							});
					}]);