package task;

import java.util.List;

import task.tasks.Task;

public class TaskDescription {
    public static void showAllTask(List<Task> tasks) {
        System.out.println("\t____________________________________________________________\n");
        for (int i = 0; i < tasks.size(); i++) {
            int serialNumber = i + 1;
            Task task = tasks.get(i);
            System.out.println("\t" + serialNumber + "." + task);
        }
        System.out.println("\t____________________________________________________________\n");
    }

    public static void addedTaskDescription(List<Task> tasks, Task newTask) {
        System.out.println("\t____________________________________________________________\n");
        System.out.println("\tGot it. I've added this task:\n");
        System.out.println("\t\t" + newTask + "\n");
        System.out.println("\tNow you have " + tasks.size() + " tasks in the list.\n");
        System.out.println("\t____________________________________________________________\n");
    }

    public static void doneTaskDescription(Task doneTask) {
        System.out.println("\t____________________________________________________________\n");
        System.out.println("\tNice! I've marked this task as done:\n");
        System.out.println("\t" + doneTask);
        System.out.println("\t____________________________________________________________\n");
    }

    public static void deletedTaskDescription(List<Task> tasks, Task deletedTask) {
        System.out.println("\t____________________________________________________________\n");
        System.out.println("\tNoted. I've removed this task:\n");
        System.out.println("\t\t" + deletedTask + "\n");
        System.out.println("\tNow you have " + tasks.size() + " tasks in the list.\n");
        System.out.println("\t____________________________________________________________\n");
    }
}