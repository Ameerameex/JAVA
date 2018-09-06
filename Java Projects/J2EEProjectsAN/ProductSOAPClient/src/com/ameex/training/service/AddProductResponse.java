
package com.ameex.training.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="addProductReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addProductReturn"
})
@XmlRootElement(name = "addProductResponse")
public class AddProductResponse {

    protected boolean addProductReturn;

    /**
     * Gets the value of the addProductReturn property.
     * 
     */
    public boolean isAddProductReturn() {
        return addProductReturn;
    }

    /**
     * Sets the value of the addProductReturn property.
     * 
     */
    public void setAddProductReturn(boolean value) {
        this.addProductReturn = value;
    }

}
