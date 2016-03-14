app.controller('blackListController', ['$scope', '$http', '$log', function ($scope, $http, $log) {
        $(function () {
            $('#datetimepicker11').datetimepicker({
                daysOfWeekDisabled: [0, 6]
            });
        });
    }]);