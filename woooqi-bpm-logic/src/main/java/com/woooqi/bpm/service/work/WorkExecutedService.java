package com.woooqi.bpm.service.work;

import java.util.List;

import com.titan.entity.bpm.bpm.DoneTask;

public interface WorkExecutedService {
	
	public List<DoneTask> getAllDoneTasks();
}
