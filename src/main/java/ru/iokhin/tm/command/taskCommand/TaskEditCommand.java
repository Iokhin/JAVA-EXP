package ru.iokhin.tm.command.taskCommand;

import ru.iokhin.tm.Bootstrap;
import ru.iokhin.tm.command.AbstractCommand;

import java.util.Scanner;

public class TaskEditCommand extends AbstractCommand {

    private Scanner scanner = new Scanner(System.in);

    public TaskEditCommand(Bootstrap bootstrap, String name, String description) {
        super(bootstrap, name, description);
    }

    @Override
    public void execute() {
        if (bootstrap.getCurrentUser() == null) {
            bootstrap.getCommandMap().get("user-login").execute();
            if (bootstrap.getCurrentUser() == null) return;
            System.out.println("ENTER ID OF PROJECT TO EDIT TASK");
            String projectIdTaskEdit = scanner.nextLine();
            bootstrap.getTaskService().listTask(projectIdTaskEdit);
            System.out.println("ENTER ID OF TASK TO EDIT");
            String taskIdEdit = scanner.nextLine();
            System.out.println("ENTER NEW NAME OF TASK TO EDIT");
            String newTaskName = scanner.nextLine();
            bootstrap.getTaskService().editTask(taskIdEdit, newTaskName);
            System.out.println("OK");
        }
    }
}