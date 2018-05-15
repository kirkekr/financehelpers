import {HttpClient, json} from 'aurelia-fetch-client';
import environment from '../environment';

export class Index{
  listingList = []
  listingData = {}
  categories = ['Food', 'Rent', 'Transport', 'Entertainment', 'Hobbies','Other'];

  activate() {
			let client = new HttpClient();

			client.fetch(environment.url + 'listings')
				.then(response => response.json())
				.then(listings => this.listingList = listings);
	}

  addListing() {
    let client = new HttpClient();

    client.fetch(environment.url +'listing', {
      'method': "POST",
      'body': json(this.listingData)
    })
      .then(response => response.json())
      .then(data => {
        console.log("Server saatis" + " " +data.listingCategory);
      });
    alert('Added new entry! ' +
      'The page will refresh');
    location.reload();
  }

  openNew() {
    var x = document.getElementById("demo");
    if (x.style.display === "none") {
      x.style.display = "block";
    } else {
      x.style.display = "none";
    }
  }
}
