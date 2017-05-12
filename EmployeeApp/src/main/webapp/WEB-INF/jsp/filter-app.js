var myModule = angular.module("myModule-fileter-app",[]);
myModule.controller("filterAppController", filterController);

function filterController($scope, $http){

    //call the rest service and set a response into a variable of $session scope
     $http.get('http://localhost:8080/emplolyee/get')
        .then(function(respose){
            alert("respose :"+respose);
            $scope.employeeList = respose.data;
            
    });

    $scope.message = "Hello angular";
    $scope.rowCount = 10;
    $scope.columnSelected = "0";
    $scope.orderSelected = true;

    $scope.sortColumnName = "name";
    $scope.reverseSort = false;
    $scope.searchText = "";

     $scope.sortData = function(columnName){
        console.log("function sortData  columnName :"+columnName +"  sortColumnName:"+$scope.sortColumnName +"  reverseSort:"+$scope.reverseSort);
        $scope.reverseSort = ($scope.sortColumnName == columnName) ? !$scope.reverseSort : false;
        $scope.sortColumnName = columnName;
    }

    $scope.getSortStyleClass = function(columnName){
        console.log("function getSortStyleClass  columnName :"+columnName +"  sortColumnName:"+$scope.sortColumnName +"  reverseSort:"+$scope.reverseSort);
         if($scope.sortColumnName == columnName){
             return  $scope.reverseSort ? 'arrow_down' :'arrow_up';
        }
        else{
              return '';
        }
    }
}