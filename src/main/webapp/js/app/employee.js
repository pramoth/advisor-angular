angular.module('employee', []);
angular.module('employee')
        .controller('EmployeeController', function ($scope, $http) {
            $scope.departments = {};
            $scope.employee = {};
            $scope.contact = {};
            $scope.bankaccount = {};
            $scope.authority = {};
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
            
           $scope.Save = function (){
               $scope.saveEmployee();
               $scope.saveContact();
               $scope.saveBankAccount();
               
           };
            
            
            $scope.saveEmployee = function(){
               $http.post("/userssave",$scope.employee)
                  .success(function (data){
                    console.log(data);
                    clearData();
                            
                }).error(function (data){
                    $scope.error = data;
                });
            };  
            
            $scope.saveContact = function (){
            $http.post("/contactsave",$scope.contact)
                .success(function (data){
                  console.log(data);
              }).error(function (data){
                  
              });  
            };
            
            $scope.saveBankAccount = function (){
                $http.post("/bankaccount",$scope.bankaccount)
                        .success(function (data){
                    
                })
                        .error(function (data){
                    
                });
            };
        });