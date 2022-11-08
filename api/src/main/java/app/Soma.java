package app;

import io.jooby.annotations.*;

@Path("/soma/{num1}/{num2}")
public class Soma {

  @GET
  public double Soma(@PathParam double num1, @PathParam double num2) {
    double result = num1 + num2;
    return result;
  }
}
