package ru.iokhin.tm.service;

import ru.iokhin.tm.entity.Task;
import ru.iokhin.tm.repository.TaskRepository;

public class TaskService implements TaskServiceInterface {

    public TaskService(TaskRepository tr) {
        this.tr = tr;
    }

    @Override
    public void addTask(String name, String projectId) {
        if (projectId != null && !projectId.trim().isEmpty() &&  name != null && !name.trim().isEmpty()) {
            tr.add(new Task(projectId, name));
        }
        else System.out.println("Illegal argument");
    }

    @Override
    public void listTask(String projectId) {
        if (projectId != null && !projectId.trim().isEmpty()) {
            tr.list(projectId);
        }
        else System.out.println("Illegal argument");
    }

    @Override
    public void removeTask(String id) {
        if (id != null && !id.trim().isEmpty()) {
            for (Task task : tr.taskLinkedHashMap.values()) {
                if (task.getId().equals(id)) {
                    tr.delete(task.getId());
                    return;
                }
            }
        }
        else System.out.println("Illegal argument");
    }

    @Override
    public void clearTask(String projectId) {
        if (projectId != null && !projectId.trim().isEmpty()) {
            for (Task task : tr.taskLinkedHashMap.values()) {
                if (task.getProjectId().equals(projectId)) {
                    tr.delete(task.getId());
                }
            }
        }
        else System.out.println("Illegal argument");
    }

    @Override
    public void editTask(String id, String newName) {
        if (id != null && !id.trim().isEmpty() && newName != null && !newName.trim().isEmpty()) {
            for (Task task : tr.taskLinkedHashMap.values()) {
                if (task.getId().equals(id)) {
                    Task newTask = new Task(task.getProjectId(), newName, task.getId());
                    tr.merge(newTask);
                    return;
                }
            }
        }
        else System.out.println("Illegal argument");
    }

    private TaskRepository tr;
}
