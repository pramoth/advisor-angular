angular.module('customer', []);
angular.module('customer')
        .controller('CustomerController', function ($scope, $http) {
            $scope.customers = {};
            $scope.customer = {};
            $http.get('/customers').success(function (data) {
                $scope.customers = data;
            }).error(function (data, status, header, config) {

            });
            $scope.saveCustomer = function () {
                $http.post('/customers', $scope.customer)
                        .success(function (data) {
                            //$scope.customer = data;
                            //$scope.customers.content.push(data);
                        }).error(function (data) {

                });
            };
            
///////////////// Delete ///////////////////////          
            $scope.callDeleteCustomer = function (id,name,email,mobile){
                $scope.customerde = {'id':id,'name':name,'email':email,'mobile':mobile};
                 $scope.deleteCustomer();
             };
            
            
            $scope.customerde = {};
            $scope.deleteCustomer = function () {
            $http.post('/customerde',$scope.customerde)
                        .success(function (data) {


                        }).error(function (data) {
                });
            };
            
///////////////// Update /////////////////////            
            $scope.customerup = {};
            $scope.callUpdateCustomer = function (id,name,email,mobile){
                $scope.customerup = {'id':id,'name':name,'email':email,'mobile':mobile};
            };
            
            $scope.UpdateCustomer = function (){
                $http.post('/customerup',$scope.customerup)
                        .success(function (data){
                            
                        }).error(function (data){
                            
                        });
            };
        });