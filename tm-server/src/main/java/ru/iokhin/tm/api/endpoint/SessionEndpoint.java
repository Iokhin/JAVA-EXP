package ru.iokhin.tm.api.endpoint;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.iokhin.tm.DTO.SessionDTO;
import ru.iokhin.tm.exeption.AuthException;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.SQLException;

@WebService
public interface SessionEndpoint {

    SessionDTO create(@WebParam(name = "userId") @NotNull String userId) throws SQLException;

    void validate(@WebParam(name = "session") @Nullable SessionDTO session) throws AuthException;

}
