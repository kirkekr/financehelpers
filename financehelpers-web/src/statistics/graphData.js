import Highcharts from "highcharts";

export class GraphData {
  container = {
    chart: {
      plotBackgroundColor: null,
      plotBorderWidth: null,
      plotShadow: false,
      type: 'pie'
    },
    title: {
      text: 'Browser market shares January, 2015 to May, 2015'
    },
    tooltip: {
      pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
    },
    plotOptions: {
      pie: {
        allowPointSelect: true,
        cursor: 'pointer',
        enabled: true,
        format: '<b>{point.name}</b>: {point.percentage:.1f} %',
        style: {
          color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
        },
        showInLegend: true
      }
    },
    series: [{
      name: "ListigCategory",
      colorByPoint: true,
      data: [{
        name: "Rent",
        y: 56.33
      }, {
        name: "Food",
        y: 24.03,
        sliced: true,
        selected: true
      }, {
        name: "Entertainment",
        y: 10.38
      }, {
        name: "Hobby",
        y: 4.77
      }, {
        name: "Utilities",
        y: 0.91
      }, {
        name: "Other",
        y: 0.2
      }]
    }]
  };
}
