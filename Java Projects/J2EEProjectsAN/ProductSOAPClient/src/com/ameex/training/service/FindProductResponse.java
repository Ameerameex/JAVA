
package com.ameex.training.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ameex.training.business.Product;


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
 *         &lt;element name="findProductReturn" type="{http://business.training.ameex.com}Product"/>
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
    "findProductReturn"
})
@XmlRootElement(name = "findProductResponse")
public class FindProductResponse {

    @XmlElement(required = true)
    protected Product findProductReturn;

    /**
     * Gets the value of the findProductReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getFindProductReturn() {
        return findProductReturn;
    }

    /**
     * Sets the value of the findProductReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setFindProductReturn(Product value) {
        this.findProductReturn = value;
    }

}
