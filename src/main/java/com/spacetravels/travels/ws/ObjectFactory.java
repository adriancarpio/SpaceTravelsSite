
package com.spacetravels.travels.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.spacetravels.travels.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearViaje_QNAME = new QName("http://ws.travels.spacetravels.com/", "crearViaje");
    private final static QName _ObtenerTodosViajesDestino_QNAME = new QName("http://ws.travels.spacetravels.com/", "obtenerTodosViajesDestino");
    private final static QName _ObtenerTodosViajesResponse_QNAME = new QName("http://ws.travels.spacetravels.com/", "obtenerTodosViajesResponse");
    private final static QName _ObtenerTodosViajes_QNAME = new QName("http://ws.travels.spacetravels.com/", "obtenerTodosViajes");
    private final static QName _ObtenerTodosViajesDestinoResponse_QNAME = new QName("http://ws.travels.spacetravels.com/", "obtenerTodosViajesDestinoResponse");
    private final static QName _ObtenerTodosViajesOrigen_QNAME = new QName("http://ws.travels.spacetravels.com/", "obtenerTodosViajesOrigen");
    private final static QName _ObtenerTodosViajesOrigenResponse_QNAME = new QName("http://ws.travels.spacetravels.com/", "obtenerTodosViajesOrigenResponse");
    private final static QName _CrearViajeResponse_QNAME = new QName("http://ws.travels.spacetravels.com/", "crearViajeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.spacetravels.travels.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerTodosViajesOrigen }
     * 
     */
    public ObtenerTodosViajesOrigen createObtenerTodosViajesOrigen() {
        return new ObtenerTodosViajesOrigen();
    }

    /**
     * Create an instance of {@link ObtenerTodosViajesOrigenResponse }
     * 
     */
    public ObtenerTodosViajesOrigenResponse createObtenerTodosViajesOrigenResponse() {
        return new ObtenerTodosViajesOrigenResponse();
    }

    /**
     * Create an instance of {@link CrearViajeResponse }
     * 
     */
    public CrearViajeResponse createCrearViajeResponse() {
        return new CrearViajeResponse();
    }

    /**
     * Create an instance of {@link CrearViaje }
     * 
     */
    public CrearViaje createCrearViaje() {
        return new CrearViaje();
    }

    /**
     * Create an instance of {@link ObtenerTodosViajesDestino }
     * 
     */
    public ObtenerTodosViajesDestino createObtenerTodosViajesDestino() {
        return new ObtenerTodosViajesDestino();
    }

    /**
     * Create an instance of {@link ObtenerTodosViajesResponse }
     * 
     */
    public ObtenerTodosViajesResponse createObtenerTodosViajesResponse() {
        return new ObtenerTodosViajesResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodosViajes }
     * 
     */
    public ObtenerTodosViajes createObtenerTodosViajes() {
        return new ObtenerTodosViajes();
    }

    /**
     * Create an instance of {@link ObtenerTodosViajesDestinoResponse }
     * 
     */
    public ObtenerTodosViajesDestinoResponse createObtenerTodosViajesDestinoResponse() {
        return new ObtenerTodosViajesDestinoResponse();
    }

    /**
     * Create an instance of {@link Viajes }
     * 
     */
    public Viajes createViajes() {
        return new Viajes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearViaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "crearViaje")
    public JAXBElement<CrearViaje> createCrearViaje(CrearViaje value) {
        return new JAXBElement<CrearViaje>(_CrearViaje_QNAME, CrearViaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosViajesDestino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "obtenerTodosViajesDestino")
    public JAXBElement<ObtenerTodosViajesDestino> createObtenerTodosViajesDestino(ObtenerTodosViajesDestino value) {
        return new JAXBElement<ObtenerTodosViajesDestino>(_ObtenerTodosViajesDestino_QNAME, ObtenerTodosViajesDestino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosViajesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "obtenerTodosViajesResponse")
    public JAXBElement<ObtenerTodosViajesResponse> createObtenerTodosViajesResponse(ObtenerTodosViajesResponse value) {
        return new JAXBElement<ObtenerTodosViajesResponse>(_ObtenerTodosViajesResponse_QNAME, ObtenerTodosViajesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosViajes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "obtenerTodosViajes")
    public JAXBElement<ObtenerTodosViajes> createObtenerTodosViajes(ObtenerTodosViajes value) {
        return new JAXBElement<ObtenerTodosViajes>(_ObtenerTodosViajes_QNAME, ObtenerTodosViajes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosViajesDestinoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "obtenerTodosViajesDestinoResponse")
    public JAXBElement<ObtenerTodosViajesDestinoResponse> createObtenerTodosViajesDestinoResponse(ObtenerTodosViajesDestinoResponse value) {
        return new JAXBElement<ObtenerTodosViajesDestinoResponse>(_ObtenerTodosViajesDestinoResponse_QNAME, ObtenerTodosViajesDestinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosViajesOrigen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "obtenerTodosViajesOrigen")
    public JAXBElement<ObtenerTodosViajesOrigen> createObtenerTodosViajesOrigen(ObtenerTodosViajesOrigen value) {
        return new JAXBElement<ObtenerTodosViajesOrigen>(_ObtenerTodosViajesOrigen_QNAME, ObtenerTodosViajesOrigen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosViajesOrigenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "obtenerTodosViajesOrigenResponse")
    public JAXBElement<ObtenerTodosViajesOrigenResponse> createObtenerTodosViajesOrigenResponse(ObtenerTodosViajesOrigenResponse value) {
        return new JAXBElement<ObtenerTodosViajesOrigenResponse>(_ObtenerTodosViajesOrigenResponse_QNAME, ObtenerTodosViajesOrigenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearViajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.travels.spacetravels.com/", name = "crearViajeResponse")
    public JAXBElement<CrearViajeResponse> createCrearViajeResponse(CrearViajeResponse value) {
        return new JAXBElement<CrearViajeResponse>(_CrearViajeResponse_QNAME, CrearViajeResponse.class, null, value);
    }

}
