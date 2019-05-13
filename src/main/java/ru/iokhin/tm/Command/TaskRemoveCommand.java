package ru.iokhin.tm.Command;

import ru.iokhin.tm.Bootstrap;

import java.util.Scanner;

public class TaskRemoveCommand extends AbstractCommand {

    private static final String name = "task-remove";
    private static final String description = "task-remove: Remove selected task";

    private Scanner scanner = new Scanner(System.in);

    public TaskRemoveCommand(Bootstrap bootstrap) {
        super(bootstrap);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void execute() {
        System.out.println("ENTER ID OF PROJECT TO REMOVE TASK");
        String projectIdTaskRemove = scanner.nextLine();
        bootstrap.ts.listTask(projectIdTaskRemove);
        System.out.println("ENTER ID OF TASk TO REMOVE");
        String taskIdRemove = scanner.nextLine();
        bootstrap.ts.removeTask(taskIdRemove);
        System.out.println("OK");
    }
}