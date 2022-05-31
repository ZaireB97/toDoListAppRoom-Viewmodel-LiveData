package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

/*it extends from viemodel instead because of factory */
public class AddTaskViewModel extends ViewModel {

    
    private LiveData<TaskEntry> task;

    public AddTaskViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }

    
    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
