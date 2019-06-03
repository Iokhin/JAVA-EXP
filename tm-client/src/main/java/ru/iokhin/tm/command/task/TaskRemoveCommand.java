package ru.iokhin.tm.command.task;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import ru.iokhin.tm.command.AbstractCommand;

@NoArgsConstructor
public final class TaskRemoveCommand extends AbstractCommand {

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
        return "task-remove";
    }

    @Override
    public String description() {
        return "Remove task by ID";
    }

    @Override
    public void execute() {
        System.out.println("ENTER ID OF TASk TO REMOVE");
        @NotNull final String taskId = endpointServiceLocator.getTerminalService().nextLine();
        if (endpointServiceLocator.getTaskEndpointBean().removeTask(endpointServiceLocator.getSession(), taskId) == null) {
            System.out.println("NO SUCH TASK ID");
            return;
        }
        System.out.println("OK");
    }
}

