package br.com.caelum.estoque.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5-jbossorg-1
 * 2021-09-05T23:13:41.293-03:00
 * Generated source version: 3.2.5-jbossorg-1
 *
 */
@WebServiceClient(name = "EstoqueWSService",
                  wsdlLocation = "file:/C:/Projetos/WorkspaceSOAP/estoquews-web/src/main/java/EstoqueWSServiceCap5.wsdl",
                  targetNamespace = "http://ws.estoque.caelum.com.br/")
public class EstoqueWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSService");
    public final static QName EstoqueWSPort = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Projetos/WorkspaceSOAP/estoquews-web/src/main/java/EstoqueWSServiceCap5.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EstoqueWSService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Projetos/WorkspaceSOAP/estoquews-web/src/main/java/EstoqueWSServiceCap5.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EstoqueWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EstoqueWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EstoqueWSService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EstoqueWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EstoqueWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EstoqueWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort() {
        return super.getPort(EstoqueWSPort, EstoqueWS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort(WebServiceFeature... features) {
        return super.getPort(EstoqueWSPort, EstoqueWS.class, features);
    }

}
