//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.18 at 06:37:33 AM EDT 
//


package net.lam.dau.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exceptionMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "respMsg",
    "respCode",
    "exceptionMsg"
})
public class Response {

    @XmlElement(required = true)
    protected String respMsg;
    protected int respCode;
    @XmlElement(required = true)
    protected String exceptionMsg;

    /**
     * Gets the value of the respMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespMsg() {
        return respMsg;
    }

    /**
     * Sets the value of the respMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespMsg(String value) {
        this.respMsg = value;
    }

    /**
     * Gets the value of the respCode property.
     * 
     */
    public int getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     */
    public void setRespCode(int value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the exceptionMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMsg() {
        return exceptionMsg;
    }

    /**
     * Sets the value of the exceptionMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMsg(String value) {
        this.exceptionMsg = value;
    }

}
