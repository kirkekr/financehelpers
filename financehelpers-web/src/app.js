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
      { route: ['', 'home'], name: 'home', moduleId: 'home/index' },
      { route: 'users/login', name: 'login', moduleId:'users/login', nav:true, title:'Login' },
      {route: 'home/statistics', name:'statistics', moduleId:'home/statistics', title:'Statistics', nav:true}
    ]);
  }

}
