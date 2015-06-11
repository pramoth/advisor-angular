angular.module('customer', []);
angular.module('customer')
        .controller('CustomerController', function ($scope, $http) {
            $scope.customers = {};
            $scope.customer = {};
            
            $http.get('/customers').success(function (data) {
                $scope.customers = data;
            }).error(function (data, status, header, config) {

            });
            
            $scope.showCustomer = function(){
                $http.get('/customers').success(function (data) {
                $scope.customers = data;
            }).error(function (data, status, header, config) {

            });
            };
            
            
///////////////// Update /////////////////////            
            $scope.callUpdateCustomer = function (id,name,email,mobile){
                $scope.customer = {'id':id,'name':name,'email':email,'mobile':mobile};
            };
                        
            
////////////// Save and Update /////////////////////// 
            $scope.saveCustomer = function () {
                $scope.showCustomer();
                $http.post('/customers', $scope.customer)
                        .success(function (data) {
                            $scope.showCustomer();
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
                             $scope.showCustomer();
                        }).error(function (data) {
                });
            };
        });