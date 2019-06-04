package ru.iokhin.tm.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-06-04T10:28:44.607+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.tm.iokhin.ru/", name = "ProjectEndpointBean")
@XmlSeeAlso({ObjectFactory.class})
public interface ProjectEndpointBean {

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/findAllProjectByUserIdRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/findAllProjectByUserIdResponse")
    @RequestWrapper(localName = "findAllProjectByUserId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindAllProjectByUserId")
    @ResponseWrapper(localName = "findAllProjectByUserIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindAllProjectByUserIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.iokhin.tm.endpoint.Project> findAllProjectByUserId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/removeAllProjectByUserIdRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/removeAllProjectByUserIdResponse")
    @RequestWrapper(localName = "removeAllProjectByUserId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveAllProjectByUserId")
    @ResponseWrapper(localName = "removeAllProjectByUserIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveAllProjectByUserIdResponse")
    public void removeAllProjectByUserId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/editProjectRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/editProjectResponse")
    @RequestWrapper(localName = "editProject", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.EditProject")
    @ResponseWrapper(localName = "editProjectResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.EditProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.Project editProject(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session,
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/findProjectByPartOfNameOrDescriptionRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/findProjectByPartOfNameOrDescriptionResponse")
    @RequestWrapper(localName = "findProjectByPartOfNameOrDescription", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindProjectByPartOfNameOrDescription")
    @ResponseWrapper(localName = "findProjectByPartOfNameOrDescriptionResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindProjectByPartOfNameOrDescriptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.iokhin.tm.endpoint.Project> findProjectByPartOfNameOrDescription(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session,
        @WebParam(name = "part", targetNamespace = "")
        java.lang.String part
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/sortProjectByUserIdRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/sortProjectByUserIdResponse")
    @RequestWrapper(localName = "sortProjectByUserId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.SortProjectByUserId")
    @ResponseWrapper(localName = "sortProjectByUserIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.SortProjectByUserIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.iokhin.tm.endpoint.Project> sortProjectByUserId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session,
        @WebParam(name = "comparator", targetNamespace = "")
        java.lang.String comparator
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/removeProjectRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/removeProjectResponse")
    @RequestWrapper(localName = "removeProject", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveProject")
    @ResponseWrapper(localName = "removeProjectResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.Project removeProject(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session,
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/findProjectRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/findProjectResponse")
    @RequestWrapper(localName = "findProject", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindProject")
    @ResponseWrapper(localName = "findProjectResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.Project findProject(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session,
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/addProjectRequest", output = "http://endpoint.tm.iokhin.ru/ProjectEndpointBean/addProjectResponse")
    @RequestWrapper(localName = "addProject", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.AddProject")
    @ResponseWrapper(localName = "addProjectResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.AddProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.Project addProject(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.Session session,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}