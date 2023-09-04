package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void add(String description){
        taskList.add(new Task(description));
    }

    public int getSize(){
        return taskList.size();
    }

    public void remove(String description){
        List<Task> taskToRemove = new ArrayList<>();
        for(Task task : taskList){
            if(task.getDescription().equalsIgnoreCase(description)){
                taskToRemove.add(task);
            }
        }
        taskList.removeAll(taskToRemove);
    }

//    public void getTaskList() {
//        for (Task task:taskList){
//            System.out.println(task.getDescription());
//        }
//    }

    public void getDescriptions(){
        System.out.println(taskList);
    }

}
