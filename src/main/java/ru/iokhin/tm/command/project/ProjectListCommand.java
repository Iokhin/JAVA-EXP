package ru.iokhin.tm.command.project;

import ru.iokhin.tm.Bootstrap;
import ru.iokhin.tm.command.AbstractCommand;

public class ProjectListCommand extends AbstractCommand {

    public ProjectListCommand(Bootstrap bootstrap) {
        super(bootstrap);
    }

    @Override
    public boolean security() {
        return true;
    }

    @Override
    public String name() {
        return "project-list";
    }

    @Override
    public String description() {
        return "List all projects for current user";
    }

    @Override
    public void execute() {
        if (bootstrap.getCurrentUser() == null) {
            bootstrap.getCommandMap().get("user-login").execute();
            if (bootstrap.getCurrentUser() == null) return;
        }
        System.out.println("PROJECTS LIST:");
        projectListCommand();
    }


    private void projectListCommand() {
        bootstrap.getProjectService().listProject(bootstrap.getCurrentUser().getUserId());
    }
}