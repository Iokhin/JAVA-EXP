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
 * 2019-06-11T10:59:31.816+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.tm.iokhin.ru/", name = "TaskEndpointBean")
@XmlSeeAlso({ObjectFactory.class})
public interface TaskEndpointBean {

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/removeAllTaskByUserIdRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/removeAllTaskByUserIdResponse")
    @RequestWrapper(localName = "removeAllTaskByUserId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveAllTaskByUserId")
    @ResponseWrapper(localName = "removeAllTaskByUserIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveAllTaskByUserIdResponse")
    public void removeAllTaskByUserId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/addTaskRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/addTaskResponse")
    @RequestWrapper(localName = "addTask", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.AddTask")
    @ResponseWrapper(localName = "addTaskResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.AddTaskResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.TaskDTO addTask(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/findTaskByPartOfNameOrDescriptionRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/findTaskByPartOfNameOrDescriptionResponse")
    @RequestWrapper(localName = "findTaskByPartOfNameOrDescription", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindTaskByPartOfNameOrDescription")
    @ResponseWrapper(localName = "findTaskByPartOfNameOrDescriptionResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindTaskByPartOfNameOrDescriptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.iokhin.tm.endpoint.TaskDTO> findTaskByPartOfNameOrDescription(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session,
        @WebParam(name = "keyWord", targetNamespace = "")
        java.lang.String keyWord
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/removeAllByProjectIdRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/removeAllByProjectIdResponse")
    @RequestWrapper(localName = "removeAllByProjectId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveAllByProjectId")
    @ResponseWrapper(localName = "removeAllByProjectIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveAllByProjectIdResponse")
    public void removeAllByProjectId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/findAllTaskByUserIdRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/findAllTaskByUserIdResponse")
    @RequestWrapper(localName = "findAllTaskByUserId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindAllTaskByUserId")
    @ResponseWrapper(localName = "findAllTaskByUserIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindAllTaskByUserIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.iokhin.tm.endpoint.TaskDTO> findAllTaskByUserId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/editTaskRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/editTaskResponse")
    @RequestWrapper(localName = "editTask", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.EditTask")
    @ResponseWrapper(localName = "editTaskResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.EditTaskResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.TaskDTO editTask(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session,
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/removeTaskRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/removeTaskResponse")
    @RequestWrapper(localName = "removeTask", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveTask")
    @ResponseWrapper(localName = "removeTaskResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.RemoveTaskResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.TaskDTO removeTask(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session,
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/sortTaskByUserIdRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/sortTaskByUserIdResponse")
    @RequestWrapper(localName = "sortTaskByUserId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.SortTaskByUserId")
    @ResponseWrapper(localName = "sortTaskByUserIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.SortTaskByUserIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.iokhin.tm.endpoint.TaskDTO> sortTaskByUserId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session,
        @WebParam(name = "comparator", targetNamespace = "")
        java.lang.String comparator
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/findAllTaskByProjectIdRequest", output = "http://endpoint.tm.iokhin.ru/TaskEndpointBean/findAllTaskByProjectIdResponse")
    @RequestWrapper(localName = "findAllTaskByProjectId", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindAllTaskByProjectId")
    @ResponseWrapper(localName = "findAllTaskByProjectIdResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.FindAllTaskByProjectIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.iokhin.tm.endpoint.TaskDTO> findAllTaskByProjectId(
        @WebParam(name = "session", targetNamespace = "")
        ru.iokhin.tm.endpoint.SessionDTO session,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId
    );
}
