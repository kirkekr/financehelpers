import {bindable, inject} from "aurelia-framework";
import {TaskQueue} from "aurelia-task-queue";
import Highcharts from "highcharts";
import $ from 'jquery';
import {GraphData} from "./graphData";


@inject(Element, TaskQueue)
export class Statistics {

  @bindable chartOptions;

  constructor(element, taskQueue) {
    Highcharts.setOptions({
      global: {
        useUTC: false
      }
    });
    this.element = element;
    this.taskQueue = taskQueue;
  }

  chartOptionsChanged(value) {
    let newSettings = {};
    $.extend(true, newSettings, this.chartDefaults, value);
    this.taskQueue.queueMicroTask(() =>
      $(this.element).highcharts(newSettings));
  }
}
/*client = new HttpClient();
chart = new Chart();

listingCategory={};

constructor (){
 console.log("laen");
}

settings = {
 data: {
   columns: []
 }
};

create() {
 this.settings.bindto = this.element;
 this.instance        = chart.generate(this.settings);
 if (this.data && this.dimensions) {

   this.update();
 }
}
update() {
 this.instance.load(this.settings);
 console.log("update");
}*/
