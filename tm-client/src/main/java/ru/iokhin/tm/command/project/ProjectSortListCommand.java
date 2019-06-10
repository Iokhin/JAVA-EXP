package ru.iokhin.tm.command.project;

import org.jetbrains.annotations.NotNull;
import ru.iokhin.tm.command.AbstractCommand;
import ru.iokhin.tm.endpoint.ProjectDTO;

import java.util.Collection;

public class ProjectSortListCommand extends AbstractCommand {
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
        return "project-sort-list";
    }

    @Override
    public String description() {
        return "List projects sorted by one of this options: order, dateStart, dateEnd, status";
    }

    @Override
    public void execute() {
        System.out.println("CHOSE ONE OF THIS OPTIONS TO SORT: order, dateStart, dateEnd, status");
        @NotNull final String option = endpointServiceLocator.getTerminalService().nextLine();
        Collection<ProjectDTO> sorted = endpointServiceLocator.getProjectEndpointBean().sortProjectByUserId(endpointServiceLocator.getSession(), option);
        if (sorted == null) {
            System.out.println("WRONG OPTION");
            return;
        }
        sorted.forEach(System.out::println);
    }
}
