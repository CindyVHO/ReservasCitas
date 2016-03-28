app.controller('createUpdateController', ['$scope', '$http', '$log', function ($scope, $http, $log) {
        $('#weekly-schedule').fullCalendar({
            weekends: false,
            dayClick: function (date, jsEvent, view) {
                $scope.modal.fechaInicio = date.format().replace(/-/g, '/').split('T')[0];
                $scope.$apply();
                $('#modalCreateSchedule').fadeIn();
            },
            header: {
                left: 'prev,next',
                center: 'title',
                right: 'agendaWeek, agendaDay'
            },
            businessHours: {
                start: '08:00',
                end: '18:00'
            },
            defaultView: 'agendaWeek',
            minTime: '08:00:00',
            maxTime: '18:00:00'
        });

        setTimeout(function () {
            $('#startDate').datetimepicker({
                format: 'DD/MM/YYYY'
            });

            $('#endDate').datetimepicker({
                format: 'DD/MM/YYYY'
            });

            $('#timeInit').datetimepicker({
                format: 'LT'
            });

            $('#timeEnd').datetimepicker({
                format: 'LT'
            });

            $('#startDate').on("dp.change", function (event) {
                $scope.modal.fechaInicio = $('#startDate').data('date');
            });

            $("#endDate").on("dp.change", function (event) {
                $scope.modal.fechaFin = $("#endDate").data('date');
            });
            
            $('#timeInit').on("dp.change", function (event) {
                $scope.modal.horaInicio = $('#timeInit').data('date');
            });

            $("#timeEnd").on("dp.change", function (event) {
                $scope.modal.horaFin = $("#timeEnd").data('date');
            });
        }, 1000);



        $scope.close = function () {
            $('#modalCreateSchedule').fadeOut();
        };
    }]);