  var module = angular.module("myApp", []);
  module.controller("MainCtr",Main);
  function Main($scope,$http){
      var req = {
       method: 'GET',
       url: 'http://localhost:8080/emploees/',
      }

      $http(req).then(onsuccess, onerror);

      function onsuccess(response){
      console.log("Success in get list!");
       html = ' ';
      angular.forEach(response.data, function(value, key){
          html = html+ ' ('+value.firstName+' '+
           ' '+ value.lastName+') ';
     })
    console.log(html);
    $scope.main.employees = html;
   };

      function onerror(response){
      console.log("Error in get list!");
    };
  }

module.controller("CreateCtr",add);
function add($scope,$http){
    var newEmployee = {
      "id":uuid(),
       "firstName":$scope.firstName,
       "lastName":$scope.lastName
    }
   if(!isEmpty($scope.firstName) && !isEmpty($scope.lastName)){
      $http.post('http://localhost:8080/emploees/',newEmployee).then(onsuccess, onerror);
    }

    function onsuccess(response){
    console.log("Employee added!");

  };

    function onerror(response){
    console.log("Employee was not added - Error !");
  };
}
