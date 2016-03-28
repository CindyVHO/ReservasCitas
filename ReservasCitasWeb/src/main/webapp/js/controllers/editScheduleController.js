app.controller('editScheduleController', ['$scope', '$http', '$log', function ($scope, $http, $log) {
        $scope.$on('$viewContentLoaded', function () {
            $('#weekly-schedule').dayScheduleSelector({
                // Sun - Sat
                days: [1, 2, 3, 4, 5],
                // HH:mm format
                startTime: '08:00',
                // HH:mm format      
                endTime: '18:00',
                // minutes               
                interval: 20,
                stringDays: ['Lun', 'Mar', 'Mie', 'Jue', 'Vie']
            });
            setTimeout(function () {
                $('#weekly-schedule td').each(function (index, value) {
                    $(value).on('click', function () {
                        $(this).addClass('first');
                        $('.modal').fadeIn();
                    });
                });

                $("#weekly-schedule").on('selected.artsy.dayScheduleSelector', function (e, selected) {
                    $log.log(selected);
                });

                $("#weekly-schedule").data('artsy.dayScheduleSelector').deserialize({});

                /*OJO - Deshabilitar Sabados y Domingos del claendario*/
                $('#startDate').datetimepicker({
                    format: 'DD/MM/YYYY',
                    disabledDates: [
                        moment("12/25/2013"),
                        new Date(2013, 11 - 1, 21),
                        "11/22/2013"
                    ]
                });

                $('#endDate').datetimepicker({
                    format: 'DD/MM/YYYY',
                    disabledDates: [
                        moment("12/25/2013"),
                        new Date(2013, 11 - 1, 21),
                        "11/22/2013"
                    ]
                });

                $('#timeInit').datetimepicker({
                    format: 'LT'
                });

                $('#timeEnd').datetimepicker({
                    format: 'LT'
                });

                $('#weekly-schedule td').each(function (index, value) {
                    for (var i = 0; i < testReasonSchedule.length; i++) {
                        var test = testReasonSchedule[i];
                        if ($(this).data('time')) {
                            if ($(this).data('day') == test.dia &&
                                    (parseInt($(this).data('time').replace(':', '')) >= parseInt(test.horaIni.replace(':', '')))
                                    && (parseInt($(this).data('time').replace(':', '')) < parseInt(test.horaFin.replace(':', '')))
                                    ) {
                                var div = $('<div>&nbsp;</div>');
                                div.css('background-color', '#' + test.reason.color);
                                $(this).append(div);
                                var child = $(this).children();
                                child.each(function (index, element) {
                                    $(element).css('width', (100 / child.length) + '%');
                                })
                            }
                        }
                    }
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
        });

        $http({
            method: 'GET',
            url: './webresources/reason'
        }).then(function successCallback(response) {
            $scope.reasons = response.data;
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    }]);