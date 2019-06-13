package ru.iokhin.tm.command.data;

import ru.iokhin.tm.command.AbstractCommand;
import ru.iokhin.tm.endpoint.UserEndpointBean;

import javax.inject.Inject;

public class DataSaveJAXBToXMLCommand extends AbstractCommand {

    @Inject
    private UserEndpointBean userEndpointBean;

    @Override
    public boolean security() {
        return true;
    }

    @Override
    public boolean admin() {
        return true;
    }

    @Override
    public String name() {
        return "jaxb-xml-save";
    }

    @Override
    public String description() {
        return "Save data into JAX-B XML";
    }

    @Override
    public void execute() {
        userEndpointBean.dataJAXBXMLSave();
        System.out.println("SUCCESS");
    }
}
