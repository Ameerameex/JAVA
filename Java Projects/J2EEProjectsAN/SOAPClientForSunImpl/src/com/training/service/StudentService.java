
package com.training.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentService", targetNamespace = "http://service.training.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.training.service.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStudent", targetNamespace = "http://service.training.com/", className = "com.training.service.FindStudent")
    @ResponseWrapper(localName = "findStudentResponse", targetNamespace = "http://service.training.com/", className = "com.training.service.FindStudentResponse")
    @Action(input = "http://service.training.com/StudentService/findStudentRequest", output = "http://service.training.com/StudentService/findStudentResponse")
    public Student findStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addStudent", targetNamespace = "http://service.training.com/", className = "com.training.service.AddStudent")
    @ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://service.training.com/", className = "com.training.service.AddStudentResponse")
    @Action(input = "http://service.training.com/StudentService/addStudentRequest", output = "http://service.training.com/StudentService/addStudentResponse")
    public boolean addStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeStudent", targetNamespace = "http://service.training.com/", className = "com.training.service.RemoveStudent")
    @ResponseWrapper(localName = "removeStudentResponse", targetNamespace = "http://service.training.com/", className = "com.training.service.RemoveStudentResponse")
    @Action(input = "http://service.training.com/StudentService/removeStudentRequest", output = "http://service.training.com/StudentService/removeStudentResponse")
    public boolean removeStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
