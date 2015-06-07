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
        });