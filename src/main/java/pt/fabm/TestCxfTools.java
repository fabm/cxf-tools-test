package pt.fabm;

//import org.apache.cxf.tools.java2ws.JavaToWS;
//import org.apache.cxf.tools.wsdlto.WSDLToJava;

import java.util.HashMap;
import java.util.Map;

public class TestCxfTools {
    Map<String, String> wsdls = new HashMap<>();

    public TestCxfTools() {
        wsdls.put("weather", "org.bk.weather.soap.WeatherServiceEndpoint");
        wsdls.put("calc", "org.bk.calc.endpoint.CalculatorEndpoint");
    }

    public static void main(String[] args) throws Exception {
        TestCxfTools testCxfTools = new TestCxfTools();

        System.out.println();
        testCxfTools.createWSDL();
        testCxfTools.createJava();
    }

    private void createJava() {

/*
        for (Map.Entry<String, String> entry : wsdls.entrySet()) {
            String file = WSDLToJava.class.getResource("/wsdl/" + entry.getKey() + ".wsdl").getFile();
            WSDLToJava.main(new String[]{
                    "-d", "./build/generated-sources",
                    file
            });
        }
*/
    }

    void createWSDL() throws Exception {
/*
        for (Map.Entry<String, String> entry : wsdls.entrySet()) {
            //because it's within classpath
            String sei = entry.getValue();
            final String[] pargs = {
                    "-address", "http://localhost:8080",
                    "-d", "./src/main/resources/wsdl",
                    "-o", entry.getKey() + ".wsdl", "-wsdl", sei,

                    //"-createxsdimports",
                    //"-cp",
                    //"/Users/francisco/git/samples/sample-spring-boot-cxf/target/classes",
                    //entry.getValue()
            };
            new JavaToWS(pargs).run();
        }
*/

    }


}
