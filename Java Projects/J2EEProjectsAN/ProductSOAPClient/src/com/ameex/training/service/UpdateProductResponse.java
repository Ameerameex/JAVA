
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
 *         &lt;element name="updateProductReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateProductReturn"
})
@XmlRootElement(name = "updateProductResponse")
public class UpdateProductResponse {

    protected boolean updateProductReturn;

    /**
     * Gets the value of the updateProductReturn property.
     * 
     */
    public boolean isUpdateProductReturn() {
        return updateProductReturn;
    }

    /**
     * Sets the value of the updateProductReturn property.
     * 
     */
    public void setUpdateProductReturn(boolean value) {
        this.updateProductReturn = value;
    }

}
