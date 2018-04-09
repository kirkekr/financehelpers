import {HttpClient, json} from 'aurelia-fetch-client';
import environment from '../environment';

export class Index{
  listingList = []

  activate() {
			let client = new HttpClient();

			client.fetch(environment.url + 'listings')
				.then(response => response.json())
				.then(listings => this.listingList = listings);
	}
}
