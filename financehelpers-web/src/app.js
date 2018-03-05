//import {LogManager} from 'aurelia-framework';
export class App {

 /* constructor(){
    this.logger = LogManager.getLogger('app');
  }
*/
  configureRouter(config, router) {
    this.router = router;
    config.title = 'Aurelia';
    config.map([
      { route: ['', 'home'], name: 'home', moduleId: 'home/index', nav:true , title:'Home'},
      { route: 'logins', name: 'login', moduleId:'users/login', nav:true, title:'Login' },
      {route: 'stats', name:'statistics', moduleId:'home/statistics', title:'Statistics', nav:true}
    ]);
  }

}
