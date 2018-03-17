import {HttpClient, json} from 'aurelia-fetch-client';

let client = new HttpClient();

export class Index{

   openNew() {
    var x = document.getElementById("demo");
    if (x.style.display === "none") {
      x.style.display = "block";
    } else {
      x.style.display = "none";
    }
  }
}
