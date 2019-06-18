package ru.iokhin.tm.config;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import ru.iokhin.tm.api.endpoint.ProjectEndpoint;
import ru.iokhin.tm.api.endpoint.SessionEndpoint;
import ru.iokhin.tm.api.endpoint.TaskEndpoint;
import ru.iokhin.tm.api.endpoint.UserEndpoint;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.ws.Endpoint;

@Getter
@Setter
@ApplicationScoped
public class Bootstrap {

    @Inject
    @NotNull
    private SessionEndpoint sessionEndpoint;

    @Inject
    @NotNull
    private UserEndpoint userEndpoint;

    @Inject
    @NotNull
    private ProjectEndpoint projectEndpoint;

    @Inject
    @NotNull
    private TaskEndpoint taskEndpoint;

    @Inject
    @NotNull
    private TestDataGenerator testDataGenerator;

    @SneakyThrows
    public void init() {
        Endpoint.publish("http://localhost:8080/SessionEndpointBean" , sessionEndpoint);  //+ (int)(Math.random()*10) +
        Endpoint.publish("http://localhost:8080/UserEndpointBean" + Math.random(), userEndpoint);
        Endpoint.publish("http://localhost:8080/ProjectEndpointBean?wsdl" + Math.random(), projectEndpoint);
        Endpoint.publish("http://localhost:8080/TaskEndpointBean" + Math.random(), taskEndpoint);
        testDataGenerator.generateTestData();
        System.out.println("***WELCOME TO TM-SERVER***");
    }


}
