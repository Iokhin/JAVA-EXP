package ru.iokhin.tm.endpoint;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.iokhin.tm.api.endpoint.UserEndpoint;
import ru.iokhin.tm.api.service.IServiceLocator;
import ru.iokhin.tm.api.service.ISessionService;
import ru.iokhin.tm.api.service.IUserService;
import ru.iokhin.tm.entity.Session;
import ru.iokhin.tm.entity.User;
import ru.iokhin.tm.enumerated.RoleType;
import ru.iokhin.tm.exeption.AuthException;
import ru.iokhin.tm.util.MD5Util;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import java.io.IOException;

@WebService
@NoArgsConstructor
public class UserEndpointBean implements UserEndpoint {

    @NotNull
    private IUserService userService;

    @NotNull
    private ISessionService sessionService;

    public UserEndpointBean(IServiceLocator serviceLocator) {
        userService = serviceLocator.getUserService();
        sessionService = serviceLocator.getSessionService();
    }

    @Override
    public User addUser(@WebParam(name = "login") @NotNull final String login,
                        @WebParam(name = "password") @NotNull final String password) {
        return userService.add(RoleType.USER, login, password);
    }

    @Override
    public User editUser(@WebParam(name = "session") @NotNull final Session session,
                         @WebParam(name = "newLogin") @NotNull final String newLogin,
                         @WebParam(name = "newPassword") @NotNull final String newPassword) throws AuthException {
        sessionService.validate(session);
        return userService.edit(session.getParentId(), newLogin, newPassword);
    }

    @Override
    public User findByLogin(@WebParam(name = "login") @NotNull final String login) {
        return userService.findByLogin(login);
    }

    @Override
    public User getCurrentUser() {
        return userService.getCurrentUser();
    }

    @Override
    @WebMethod
    public Session authUser(@WebParam(name = "login") @NotNull final String login,
                            @WebParam(name = "password") @NotNull final String password) throws AuthException {
        User user = userService.authUser(login, password);
        if (user == null) return null;
//        if ("user".equals(user.getLogin())) throw new AuthException();
        return sessionService.create(user.getId());
    }

    @Override
    public User findById(@WebParam(name = "id") @NotNull final String id) {
        return userService.findOne(id);
    }

    @Override
    public boolean passChange(@WebParam(name = "oldPassword") @NotNull final String oldPassword,
                              @WebParam(name = "newPassword") @NotNull final String newPassword) {
        return userService.changePassword(oldPassword, newPassword);
    }

    @Override
    public void dataBinSave() throws IOException {
        userService.dataBinSave();
    }

    @Override
    public void dataBinLoad() throws IOException, java.lang.ClassNotFoundException {
        userService.dataBinLoad();
    }

    @Override
    public void dataJAXBXMLSave() throws JAXBException {
        userService.dataJAXBXMLSave();
    }

    @Override
    public void dataJAXBXMLLoad() throws JAXBException {
        userService.dataJAXBXMLLoad();
    }

    @Override
    public void dataJAXBJSONSave() throws JAXBException {
        userService.dataJAXBJSONSave();
    }

    @Override
    public void dataJAXBJSONLoad() throws JAXBException {
        userService.dataJAXBJSONLoad();
    }

    @Override
    public void dataFasterXMLSave() throws IOException {
        userService.dataFasterXMLSave();
    }

    @Override
    public void dataFasterXMLLoad() throws IOException {
        userService.dataFasterXMLLoad();
    }

    @Override
    public void dataFasterJSONLoad() throws IOException {
        userService.dataFasterJSONLoad();
    }

    @Override
    public void dataFasterJSONSave() throws IOException {
        userService.dataFasterJSONSave();
    }
}
