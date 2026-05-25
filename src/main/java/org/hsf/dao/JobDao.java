package org.hsf.dao;

import org.hsf.entities.Job;

import java.util.List;

public interface JobDao {
    Job createJob(Job job);

    List<Job> findByTitle(String title);
}
