var URL ='http://localhost:8080/emploees/';
  var module = angular.module("myApp", []);
  module.controller("MainCtr",Main);
  function Main($http){
    var self = this;
    this.employees = [];
    this.refresh = function ($scope){
      var req = {
       method: 'GET',
       url: URL,
      }

      $http(req).then(onsuccess, onerror);

      function onsuccess(response){
      console.log("Success in get list!");
       html = [];
      angular.forEach(response.data, function(value, key){
          html.push({firstName: value.firstName,
            lastName:value.lastName});
     })
    console.log(html);
    if(response.data.length > 0){
      self.employees = html;
    }
   };
      function onerror(response){
      console.log("Error in get list!");
    };
  };
    this.add = function(){
        var newEmployee = {
          "id":uuid(),
           "firstName":this.firstName,
           "lastName":this.lastName
        }
       if(!isEmpty(this.firstName) && !isEmpty(this.lastName)){
          $http.post(URL,newEmployee).then(onsuccess, onerror);
        }

        function onsuccess(response){
        console.log("Employee added!");
        self.firstName = "";
        self.lastName = "";
      };

        function onerror(response){
        console.log("Employee was not added - Error !");
      };
      function uuid() {
        var uuid = "", i, random;
        for (i = 0; i < 32; i++) {
          random = Math.random() * 16 | 0;

          if (i == 8 || i == 12 || i == 16 || i == 20) {
            uuid += "-"
          }
          uuid += (i == 12 ? 4 : (i == 16 ? (random & 3 | 8) : random)).toString(16);
        }
        return uuid;
      }
      function isEmpty(val){
          return (val === undefined || val == null || val.length <= 0) ? true : false;
      }
    };
    this.refresh();
  }
