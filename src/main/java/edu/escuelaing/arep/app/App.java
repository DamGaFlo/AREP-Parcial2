package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.convertion.ConvertJson;
import edu.escuelaing.arep.app.operation.Calculator;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        port(getPort());
        get("/acos", (request, response) -> {
            Calculator calculator =  new Calculator();
            ConvertJson convert = new ConvertJson();
            return convert.stringToJSON("acos",Double.parseDouble(request.queryParams("value")),calculator.getAcos(Double.parseDouble(request.queryParams("value"))));
        });
        get("/atan", (request, response) -> {
            Calculator calculator =  new Calculator();
            ConvertJson convert = new ConvertJson();
            return convert.stringToJSON("atan",Double.parseDouble(request.queryParams("value")),calculator.getAtan(Double.parseDouble(request.queryParams("value"))));
        });
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 34000;
    }
}
