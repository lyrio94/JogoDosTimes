'use strict';

/**
 * TimeController
 * @constructor
 */
var TimeController = function($scope, $http) {
    $scope.fetchTimesList = function() {
        $http.get('time/timelist.json').success(function(timeList){
            $scope.cars = timeList;
        });
    };

    $scope.fetchTimesList();
};