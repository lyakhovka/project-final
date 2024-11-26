package com.javarush.jira.bugtracking.task.tag;

import com.javarush.jira.bugtracking.task.Task;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskTagService {
    @Autowired
    private TaskTagRepository taskTagRepository;

    @Transactional
    public void addTagsToTask(Task task, List<String> tags) {
        tags.forEach(tag -> {
            TaskTag taskTag = new TaskTag();
            taskTag.setTask(task);
            taskTag.setTag(tag);
            taskTagRepository.save(taskTag);
        });
    }
}
