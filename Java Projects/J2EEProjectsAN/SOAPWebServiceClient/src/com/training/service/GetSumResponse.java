
package com.training.service;

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
 *         &lt;element name="getSumReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getSumReturn"
})
@XmlRootElement(name = "getSumResponse")
public class GetSumResponse {

    protected int getSumReturn;

    /**
     * Gets the value of the getSumReturn property.
     * 
     */
    public int getGetSumReturn() {
        return getSumReturn;
    }

    /**
     * Sets the value of the getSumReturn property.
     * 
     */
    public void setGetSumReturn(int value) {
        this.getSumReturn = value;
    }

}
