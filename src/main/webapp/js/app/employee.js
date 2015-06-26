angular.module('employee', []);
angular.module('employee')
        .controller('EmployeeController', function ($scope, $http) {
            $scope.departments = {};
            $scope.employee = {};
            $scope.error = {};
            load();
            function clearData(){
                $scope.employee = {};
            }
            function load() {
                $http.get("/departments")
                        .success(function (data) {
                            $scope.departments = data;
                        }).error(function (data) {
                });
            }
            
          
            $scope.saveEmployee = function(){
               $http.post("/userssave",$scope.employee)
                  .success(function (data){
                    console.log(data);
                    clearData();
                            
                }).error(function (data){
                    $scope.error = data;
                });
            };  
           
        });