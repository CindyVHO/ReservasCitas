app.controller('createUpdateController', ['$scope', '$http', '$log', function ($scope, $http, $log) {
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

        $scope.close = function(){
             $('#modalCreateReserve').fadeOut();
        };
    }]);