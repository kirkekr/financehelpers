export class App {

  configureRouter(config, router) {
    this.router = router;
    config.title = 'Aurelia';
    config.map([
      { route: ['', 'home'], name: 'home', moduleId: 'home/index', nav:true , title:'Home'},
      { route: 'logins', name: 'login', moduleId:'users/login', nav:true, title:'Login' },
      {route: 'stats', name:'statistics', moduleId:'statistics/statistics', title:'Statistics', nav:true},
      {route: 'listing', name:'listing', moduleId:'listing/listing', title:'Listing', nav:true}
    ]);
  }

}
