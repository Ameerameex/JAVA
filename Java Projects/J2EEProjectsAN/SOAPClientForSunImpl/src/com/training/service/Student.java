
package com.training.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mark1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mark2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mark3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rollNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "mark1",
    "mark2",
    "mark3",
    "name",
    "rollNumber"
})
public class Student {

    protected int mark1;
    protected int mark2;
    protected int mark3;
    protected String name;
    protected int rollNumber;

    /**
     * Gets the value of the mark1 property.
     * 
     */
    public int getMark1() {
        return mark1;
    }

    /**
     * Sets the value of the mark1 property.
     * 
     */
    public void setMark1(int value) {
        this.mark1 = value;
    }

    /**
     * Gets the value of the mark2 property.
     * 
     */
    public int getMark2() {
        return mark2;
    }

    /**
     * Sets the value of the mark2 property.
     * 
     */
    public void setMark2(int value) {
        this.mark2 = value;
    }

    /**
     * Gets the value of the mark3 property.
     * 
     */
    public int getMark3() {
        return mark3;
    }

    /**
     * Sets the value of the mark3 property.
     * 
     */
    public void setMark3(int value) {
        this.mark3 = value;
    }

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
     * Gets the value of the rollNumber property.
     * 
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * Sets the value of the rollNumber property.
     * 
     */
    public void setRollNumber(int value) {
        this.rollNumber = value;
    }

}
