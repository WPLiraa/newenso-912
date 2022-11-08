package app;

import io.jooby.annotations.*;

@Path("/subtracao/{num1}/{num2}")
public class Subtracao {

  @GET
  public double subt(@PathParam double num1, @PathParam double num2) {
    double result = num1 - num2;
    return result;
  }
}
