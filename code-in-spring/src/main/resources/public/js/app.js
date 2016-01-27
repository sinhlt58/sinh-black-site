var myapp = angular.mudule('app', ['ui.router']);

myapp.config(function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise("/");

    $stateProvider
        .state("home", {
            url: "/",
            template: "js/template/home.html",
            controller: "home"
        });

});

myapp.controller('home', function($scope, $http){
   /* $http.get("home/").success(function(data){
        //console.log(data);
        $scope.greeting = data.sinh;
    });*/
});
