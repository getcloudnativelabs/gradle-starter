package app

import org.jooby.test.JoobyRule
import org.junit.ClassRule
import org.junit.Rule
import org.junit.Test

import static io.restassured.RestAssured.get
import static org.hamcrest.Matchers.equalTo

class AppTest {

  /**
   * One app/server for all the test of this class. If you want to start/stop a new server per test,
   * remove the static modifier and replace the {@link ClassRule} annotation with {@link Rule}.
   */
  @ClassRule
  public static JoobyRule app = new JoobyRule(new App());

  @Test
  void integrationTest() {
    get("/")
      .then()
      .assertThat()
      .body(equalTo("Hello Jooby!"))
      .statusCode(200);
  }
}
