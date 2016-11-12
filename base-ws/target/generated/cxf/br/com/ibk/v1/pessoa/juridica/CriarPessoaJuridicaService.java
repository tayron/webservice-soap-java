package br.com.ibk.v1.pessoa.juridica;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-12T14:54:14.435-02:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "CriarPessoaJuridicaService", 
                  wsdlLocation = "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/juridica/CriarPessoaJuridica.wsdl",
                  targetNamespace = "http://ibk.com.br/v1/pessoa/juridica") 
public class CriarPessoaJuridicaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ibk.com.br/v1/pessoa/juridica", "CriarPessoaJuridicaService");
    public final static QName CriarPessoaJuridicaPort = new QName("http://ibk.com.br/v1/pessoa/juridica", "CriarPessoaJuridicaPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/juridica/CriarPessoaJuridica.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CriarPessoaJuridicaService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/juridica/CriarPessoaJuridica.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CriarPessoaJuridicaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CriarPessoaJuridicaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CriarPessoaJuridicaService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CriarPessoaJuridicaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CriarPessoaJuridicaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CriarPessoaJuridicaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CriarPessoaJuridicaPortType
     */
    @WebEndpoint(name = "CriarPessoaJuridicaPort")
    public CriarPessoaJuridicaPortType getCriarPessoaJuridicaPort() {
        return super.getPort(CriarPessoaJuridicaPort, CriarPessoaJuridicaPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CriarPessoaJuridicaPortType
     */
    @WebEndpoint(name = "CriarPessoaJuridicaPort")
    public CriarPessoaJuridicaPortType getCriarPessoaJuridicaPort(WebServiceFeature... features) {
        return super.getPort(CriarPessoaJuridicaPort, CriarPessoaJuridicaPortType.class, features);
    }

}