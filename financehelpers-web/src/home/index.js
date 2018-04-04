import {HttpClient, json} from 'aurelia-fetch-client';
import environment from '../environment';


let client = new HttpClient();

export class Index{

listingList = []

   openNew() {
    var x = document.getElementById("demo");
    if (x.style.display === "none") {
      x.style.display = "block";
    } else {
      x.style.display = "none";
    }
    
    
  }
  
  activate() {
			let client = new HttpClient();

			client.fetch(environment.url + 'listings')
				.then(response => response.json())
				.then(listings => this.listingList = listings);
	}
}
