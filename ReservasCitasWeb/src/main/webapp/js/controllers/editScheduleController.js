app.controller('editScheduleController', ['$scope', '$http', '$log', function ($scope, $http, $log) {
        $('#weekly-schedule').dayScheduleSelector({
            // Sun - Sat
            days: [1, 2, 3, 4, 5],
            // HH:mm format
            startTime: '08:00',
            // HH:mm format      
            endTime: '18:00',
            // minutes               
            interval: 60,
            stringDays: ['Lun', 'Mar', 'Mie', 'Jue', 'Vie']
        });
        setTimeout(function () {
            $('#weekly-schedule td').each(function (index, value) {
                $(value).on('click', function () {
                    if ($(this).hasClass('first')) {
                        return;
                    } else {
                        $(this).addClass('first');
                        $('.modal').fadeIn();
                    }
                });
            });
        }, 500);

        $("#weekly-schedule").on('selected.artsy.dayScheduleSelector', function (e, selected) {
            console.log(selected);
        })
        $("#weekly-schedule").data('artsy.dayScheduleSelector').deserialize({});
        $(function () {
            $('#datetimepicker5').datetimepicker({
                defaultDate: "11/1/2013",
                disabledDates: [
                    moment("12/25/2013"),
                    new Date(2013, 11 - 1, 21),
                    "11/22/2013"
                ]
            });
        });
        $(function () {
            $('#datetimepicker3').datetimepicker({
                format: 'LT'
            });
        });
        
        $scope.close = function(){
             $('#modalCreateSchedule').fadeOut();
        };
    }]);