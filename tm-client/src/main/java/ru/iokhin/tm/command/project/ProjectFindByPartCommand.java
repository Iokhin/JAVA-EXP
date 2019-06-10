package ru.iokhin.tm.command.project;

import org.jetbrains.annotations.NotNull;
import ru.iokhin.tm.command.AbstractCommand;
import ru.iokhin.tm.endpoint.ProjectDTO;

import java.util.Collection;

public class ProjectFindByPartCommand extends AbstractCommand {
    @Override
    public boolean security() {
        return true;
    }

    @Override
    public boolean admin() {
        return false;
    }

    @Override
    public String name() {
        return "project-find";
    }

    @Override
    public String description() {
        return "Find projects by part of name or description and list them";
    }

    @Override
    public void execute() {
        System.out.println("ENTER KEY WORD TO FIND");
        @NotNull final String keyWord = endpointServiceLocator.getTerminalService().nextLine();
        Collection<ProjectDTO> found = endpointServiceLocator.getProjectEndpointBean().findProjectByPartOfNameOrDescription(endpointServiceLocator.getSession(), keyWord);
        if (found.size() == 0) {
            System.out.println("NO RESULTS FOUND FOR " + keyWord);
            return;
        }
        found.forEach(System.out::println);
    }
}
