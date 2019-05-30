package ru.iokhin.tm.command.data;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.jetbrains.annotations.NotNull;
import ru.iokhin.tm.command.AbstractCommand;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DataSaveFasterXMLCommand extends AbstractCommand {
    @Override
    public boolean security() {
        return true;
    }

    @Override
    public String name() {
        return "faster-xml-save";
    }

    @Override
    public String description() {
        return "Save data into Faster XML";
    }

    @Override
    public void execute() {
//        @NotNull final IProjectService projectService = serviceLocator.getProjectService();
//        @NotNull final IUserService userService = serviceLocator.getUserService();
//        @NotNull final ITaskService taskService = serviceLocator.getTaskService();
//        DataScope dataScope = new DataScope(new ArrayList<>(projectService.findAll()), new ArrayList<>(taskService.findAll()), new ArrayList<>(userService.findAll()));
//        XmlMapper mapper = new XmlMapper();
//        try {
//            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("faster.xml"), dataScope);
//            System.out.println("SUCCESS");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
