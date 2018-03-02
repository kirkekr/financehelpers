import {HttpClient, json} from "aurelia-fetch-client"

export class people{

  userData = {}

  constructor() {
    this.appName = "FinanceHelper"
    this.count = 0
  }

  addUser() {
    let client = new HttpClient();

    client.fetch("http://localhost:8080/users/add", {
      "method": "POST"
      "body": json(this.userData)
    })
      then(response => response.json())
      then(data => {
        console.log("Server saatis " + data.firstname);
      });

      console.log("Method executed!")
  }
}
