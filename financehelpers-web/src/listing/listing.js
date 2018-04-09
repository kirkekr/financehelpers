import {HttpClient, json} from 'aurelia-fetch-client'
import environment from '../environment';

export class listing{

	listingData = {}
	listingList = []
	
	categories = ['Food', 'Rent', 'Transport', 'Entertainment', 'Hobbies','Other'];
	
	constructor() {
		this.count = 0
	}
	
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
		
		console.log("Method executed!")
	}
	
}
