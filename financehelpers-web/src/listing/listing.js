import {HttpClient, json} from 'aurelia-fetch-client'

export class listing{

	listingData = {}


	constructor() {
		this.count = 0
	}
	
	addListing() {
		let client = new HttpClient();
		
		
		client.fetch('http://localhost:8080/listing', {
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
