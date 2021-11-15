'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', ['AngularSpringApp.filters', 'AngularSpringApp.services', 'AngularSpringApp.directives']);


App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/times', {
        templateUrl: 'time/layout',
        controller: TimeController
    });

    
    $routeProvider.otherwise({redirectTo: '/times'});
}]);
