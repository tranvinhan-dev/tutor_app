var hightlightColor = "#BBD9E7";
var xValues = ["January","February","March","April","May","June","July","August","September","October","November","December"];
var yValues = [55, 49, 44, 24, 15, 44, 55, 67, 56, 34, 65, 22];
var barColors = [hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor,hightlightColor];
new Chart("myChart", {
    type: "bar",
    data: {
        labels: xValues,
        datasets: [
            {
                backgroundColor: barColors,
                data: yValues,
            },
        ],
    },
    options: {
        legend: { display: false },
        title: {
        display: true,
        text: "Time Spending 2020",
        },
    },
});