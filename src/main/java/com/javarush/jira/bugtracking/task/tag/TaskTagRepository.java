package com.javarush.jira.bugtracking.task.tag;

import com.javarush.jira.common.BaseRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskTagRepository extends BaseRepository<TaskTag> {
    @Query("SELECT t FROM TaskTag t WHERE t.task =:task_id")
    List<TaskTag> findByTask(long task_id);
}
