//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.20 at 02:00:57 PM EDT 
//


package net.lam.dau.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for car complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="car">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuelAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="carType" type="{http://dau.lam.net/service}carType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {
    "name",
    "color",
    "fuelAmount",
    "carType"
})
public class Car {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String color;
    protected double fuelAmount;
    @XmlElement(required = true)
    protected CarType carType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the fuelAmount property.
     * 
     */
    public double getFuelAmount() {
        return fuelAmount;
    }

    /**
     * Sets the value of the fuelAmount property.
     * 
     */
    public void setFuelAmount(double value) {
        this.fuelAmount = value;
    }

    /**
     * Gets the value of the carType property.
     * 
     * @return
     *     possible object is
     *     {@link CarType }
     *     
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * Sets the value of the carType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarType }
     *     
     */
    public void setCarType(CarType value) {
        this.carType = value;
    }

}
