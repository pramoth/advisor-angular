angular.module('customer', []);
angular.module('customer')
        .controller('CustomerController', function ($scope, $http) {
            $scope.customers = {};
            $scope.customer = {};
           

            $http.get('/customers').success(function (data) {
                $scope.customers = data;
            }).error(function (data, status, header, config) {

            });

            $scope.showCustomer = function () {
                $http.get('/customers').success(function (data) {
                    $scope.customers = data;
                }).error(function (data, status, header, config) {

                });
            };


///////////////// Update /////////////////////            
            $scope.callUpdateCustomer = function (id, name, email, mobile) {
                $scope.customer = {'id': id, 'name': name, 'email': email, 'mobile': mobile};
            };


////////////// Save and Update /////////////////////// 
            $scope.saveCustomer = function () {
                $scope.showCustomer();
                $http.post('/customers', $scope.customer)
                        .success(function (data) {
                            $scope.showCustomer();
                             $scope.errors = data;
                        }).error(function (data) {
                            console.log(data);
                     $scope.errors = data;
                     
                });

            };


///////////////// Delete ///////////////////////          
            $scope.callDeleteCustomer = function (id, name, email, mobile) {
                $scope.customerde = {'id': id, 'name': name, 'email': email, 'mobile': mobile};
                $scope.deleteCustomer();
            };

            $scope.customerde = {};
            $scope.deleteCustomer = function () {
                $http.post('/customerde', $scope.customerde)
                        .success(function (data) {
                            $scope.showCustomer();
                   
                    $scope.closeDialogDelete();
                        }).error(function (data) {
                });
            };
//////////////// ClearData /////////////////////            
            $scope.Clear = function (){
              $scope.customer = {'id': 0, 'name': '', 'email': '', 'mobile': ''};  
            };
              ///////////// show dialogDelete //////////////
           $scope.showDialogDelete = function (id, name, email, mobile) {
                $scope.customerde = {'id': id, 'name': name, 'email': email, 'mobile': mobile};
               document.getElementById('popup-delete').style.display = 'initial';
               document.getElementById('warpbody').style.display = 'initial';
           };
           //////////// close dialogDelete //////////////
           $scope.closeDialogDelete = function (){
               document.getElementById('popup-delete').style.display = 'none';
                document.getElementById('warpbody').style.display = 'none';
           };
           
        });