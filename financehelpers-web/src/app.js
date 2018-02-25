export class App {
  configureRouter(config, router) {
    this.router = router;
    config.title = 'Aurelia';
    config.map([
      { route: ['', 'home'], name: 'home', moduleId: 'home/index' },
      { route: 'login', name: 'login', moduleId:'users/login', nav:true, title:'Login' }
    ]);
  }

}
