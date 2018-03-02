export class Index{
configureRouter(config, router) {
    this.router = router;
    config.title = "Finance Helper";

    config.map([
      { route: ["","home"], name: "home", moduleId: "home/index" },
      { route: "people", name: "people", moduleId: "people/people", nav: true}
    ]);
  }
}
