package br.com.ibk.v1.contabancaria;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-12T14:54:13.918-02:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "MovimentarContaBancariaService", 
                  wsdlLocation = "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/contabancaria/MovimentarContaBancaria.wsdl",
                  targetNamespace = "http://ibk.com.br/v1/contabancaria") 
public class MovimentarContaBancariaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ibk.com.br/v1/contabancaria", "MovimentarContaBancariaService");
    public final static QName MovimentarContaBancariaPort = new QName("http://ibk.com.br/v1/contabancaria", "MovimentarContaBancariaPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/contabancaria/MovimentarContaBancaria.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MovimentarContaBancariaService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/contabancaria/MovimentarContaBancaria.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MovimentarContaBancariaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MovimentarContaBancariaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovimentarContaBancariaService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MovimentarContaBancariaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MovimentarContaBancariaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MovimentarContaBancariaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MovimentarContaBancariaPortType
     */
    @WebEndpoint(name = "MovimentarContaBancariaPort")
    public MovimentarContaBancariaPortType getMovimentarContaBancariaPort() {
        return super.getPort(MovimentarContaBancariaPort, MovimentarContaBancariaPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovimentarContaBancariaPortType
     */
    @WebEndpoint(name = "MovimentarContaBancariaPort")
    public MovimentarContaBancariaPortType getMovimentarContaBancariaPort(WebServiceFeature... features) {
        return super.getPort(MovimentarContaBancariaPort, MovimentarContaBancariaPortType.class, features);
    }

}
