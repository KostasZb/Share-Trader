//Using Ajax to register user's interest in share
$(document).ready(function () {
    $(".shareButton").click(function () {
        $(this).hide();
        var value = $(this).attr("value");
        var valueMax = 0;
        var valueMin = 0;
        if ($("#MaxValue" + value).val()) {
            valueMax = $("#MaxValue" + value).val();
        }

        if ($("#MinValue" + value).val()) {
            valueMin = $("#MinValue" + value).val();
        }
        $.ajax({
            type: "post",
            data: {
                tradingCode: value,
                valueMax: valueMax,
                valueMin: valueMin
            },
            url: "/reminders/registerInterest",
            dataType: "text",
            success: function (data) {
                alert(data);
            }
        })
    })
});

//checking if a user has already registered their interest in a share and hiding the button to register interest
$(document).ready(function () {
    $.ajax({
        type: "post",
        url: "/reminders/getReminders",
        dataType: "json",
        success: function (data) {
            $.each(data, function (i, reminder) {
                $(".shareButton").each(function () {
                    if (reminder.companyName == $(this).attr("id")) {
                        $(this).hide();
                    }
                })
            })
        }
    })
})


//performing a lower/uppercase independent search based on the keyword entered by the user on the home page

$(document).ready(function () {
    $("#searchBar").on("keyup", function () {
        var value = $(this).val().toLowerCase();
        $(".shareinforow").filter(function () {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });
});


//Using Ajax to check the price of each share that the used is interested in and alert if needed, it runs every time the user reaches the home page
$(document).ready(function () {
    notificationChecker();
    //setInterval(function () { notificationChecker() }, 5000);
});

function notificationChecker() {
    $.ajax({
        type: "post",
        url: "/reminders/getReminders",
        dataType: "json",
        success: function (data) {
            $.each(data, function (i, reminder) {
                if (reminder.notificationValueMax != 0 || reminder.notificationValueMin != 0) {
                    $.ajax({
                        type: "post",
                        url: "/shareinfo/" + reminder.tradingCode,
                        dataType: "json",
                        success(data) {
                            if (reminder.notificationValueMax < data.price || reminder.notificationValueMin > dat.price) {
                                alert(data.companyName + " 's price is now " + data.price)
                            }
                        }
                    })
                }
            })
        }
    })
}







