import list.BasicOperations.*;

import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.add("Fazer uma simples aplicação CRUD");
        taskList.add("Fazer uma simples aplicação CRUD");
        taskList.add("Fazer uma simples aplicação CRUD");
        taskList.add("Fazer uma simples aplicação CRUD");
//        taskList.remove("Fazer uma simples aplicação CRUD");

        System.out.println("There are "+taskList.getSize()+" pending tasks.");
//        taskList.getTaskList();

        taskList.getDescriptions();
    }
}