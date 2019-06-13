package ru.iokhin.tm.command.user;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import ru.iokhin.tm.command.AbstractCommand;
import ru.iokhin.tm.endpoint.UserEndpointBean;
import ru.iokhin.tm.service.TerminalService;

import javax.inject.Inject;

@NoArgsConstructor
public class UserRegistrationCommand extends AbstractCommand {

    @Inject
    @NotNull
    private UserEndpointBean userEndpointBean;

    @Inject
    @NotNull
    private TerminalService terminalService;

    @Override
    public boolean security() {
        return false;
    }

    @Override
    public boolean admin() {
        return false;
    }

    @Override
    public String name() {
        return "user-reg";
    }

    @Override
    public String description() {
        return "Register new user";
    }

    @Override
    public void execute() {
        System.out.println("ENTER NEW USER'S LOGIN");
        @NotNull final String login = terminalService.nextLine();
        if (userEndpointBean.findByLogin(login) != null) {
            System.out.println("SUCH LOGIN ALREADY EXIST");
            return;
        }
        System.out.println("ENTER NEW USER'S PASSWORD");
        @NotNull final String password = terminalService.nextLine();
        userEndpointBean.addUser(login, password);
        System.out.println("SUCCESS");
    }
}
