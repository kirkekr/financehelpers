import Highcharts from "highcharts";
import environment from "../environment";
import {HttpClient} from "aurelia-fetch-client";

export class Statistics {
  listingList = []
  searchStr = ""

  activate() {
    let client = new HttpClient();

    client.fetch(environment.url + 'listings')
      .then(response => response.json())
      .then(listings => this.listingList = listings);
  }

  searchCategory(){
    let client = new HttpClient();

    client.fetch(environment.url + 'stats/search/' + this.searchStr)
      .then(response => response.json())
      .then(listings => this.listingList = listings);
  }
}
