angular.module('department', []);
angular.module('department')
        .controller('departmentController', function ($scope, $http) {

            $scope.departments = {};
            $scope.department = {};
            $scope.departmentde = {};
            $scope.error = {};
            load();
            function load () {
                $http.get('/department',{params:{page:0,size:10,sort:'name,desc'}}).success(function (data) {
                    $scope.departments = data;
                }).error(function (data, status, header, config) {

                });
            };
            
            $scope.clearError = function (){
              $scope.error = {};  
            };
            
            $scope.clearData = function (){
              $scope.department = {};   
               $scope.clearError();
            };
            
            $scope.save = function() {
                $http.post('/department', $scope.department).success(function (data) {
                    load();
                    $scope.error = {};
                    $scope.clearData();
                }).error(function (data, status, header, config) {
                      $scope.error = data;
                });
            };
           
           $scope.ClickUpdate = function (dep){
               $scope.department.name = dep.name;
               $scope.department.id = dep.id;
           };
            
            $scope.delete = function(dep) {
                $scope.departmentde = {'id':dep.id , 'name':dep.name};
                $http.post('/departmentdelete',$scope.departmentde).success(function (data) {
                    load();
                }).error(function (data, status, header, config) {

                });
            };
        });