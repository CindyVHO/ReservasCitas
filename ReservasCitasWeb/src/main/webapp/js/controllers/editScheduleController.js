app.controller('editScheduleController', ['$scope', '$http', '$log', function ($scope, $http, $log) {
        $scope.modal = {
            fechaInicio: '',
            fechaFin: '',
            horaInicio: '',
            horaFin: '',
            motivo: ''
        };

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
                right: ''
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
        /*
         $http.get('/reason').then(function (response) {
         $scope.reason = response.data;
         }, function (error){
         $log.log(error);
         });*/
        /*var testReason =[{
         id:1,
         nombre:'reason 1',
         color:'00FFFF'
         },
         {
         id:2,
         nombre:'reason 22222',
         color:'00FF0F'
         }];
         
         $scope.reasons = testReason;
         
         var testReasonSchedule = [{
         id: 1,
         reason: {
         id: 1,
         nombre: 'reason 1',
         color:'00FFFF'
         },
         dia: 2,
         horaIni: "10:00",
         horaFin: "11:00"
         }, {
         id: 2,
         reason: {
         id: 1,
         nombre: 'reason 1',
         color:'00FFFF'
         },
         dia: 3,
         horaIni: "10:00",
         horaFin: "11:00"
         },{
         id: 3,
         reason: {
         id: 2,
         nombre: 'reason 22222',
         color:'0000FF'
         },
         dia: 3,
         horaIni: "10:00",
         horaFin: "11:00"
         },{
         id: 4,
         reason: {
         id: 3,
         nombre: 'reason 3333',
         color:'FFFF00'
         },
         dia: 3,
         horaIni: "10:00",
         horaFin: "11:00"
         }];*/

        $http({
            method: 'GET',
            url: './webresources/reason'
        }).then(function successCallback(response) {
            $scope.reasons = response.data;
        }, function errorCallback(error) {
            $log.log(error);
        });


        $scope.createReasonSchedule = function () {
            $log.log($scope.modal.fechaInicio);
            $log.log($scope.modal.fechaFin);
            $log.log($scope.modal.horaInicio);
            $log.log($scope.modal.horaFin);
            $log.log($scope.modal.motivo);
            $log.log($('#select').val());
            $http({
                method: 'POST',
                url: './webresources/reason_schedule',
                data: {
                    fechaInicio: $scope.modal.fechaInicio,
                    fechaFin: $scope.modal.fechaFin,
                    horaInicio: $scope.modal.horaInicio,
                    horaFin: $scope.modal.horaFin,
                    reason: {
                        id: $scope.modal.motivo
                    }
                }
            }).then(function successCallback(response) {

            }, function errorCallback(error) {
                $log.log(error);
            });
        };

    }]);