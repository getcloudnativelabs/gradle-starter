package app

import org.jooby.Jooby
import static org.jooby.JoobyExtension.*

/**
 * Hello world gradle project.
 */
class App extends Jooby {

  {
    get(this, "/", { req, rsp ->
      def name = req.param("name").value("Jooby")
      rsp.send("Hello " + name + "!")
    })
  }

  static void main(String... args) {
    run(App.class, args);
  }
}
