
package de.codecentric.namespace.weatherservice.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForecastRequest" type="{http://www.codecentric.de/namespace/weatherservice/general}ForecastRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "forecastRequest"
})
@XmlRootElement(name = "GetCityForecastByZIP")
public class GetCityForecastByZIP {

    @XmlElement(name = "ForecastRequest")
    protected ForecastRequest forecastRequest;

    /**
     * Gets the value of the forecastRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastRequest }
     *     
     */
    public ForecastRequest getForecastRequest() {
        return forecastRequest;
    }

    /**
     * Sets the value of the forecastRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastRequest }
     *     
     */
    public void setForecastRequest(ForecastRequest value) {
        this.forecastRequest = value;
    }

}
