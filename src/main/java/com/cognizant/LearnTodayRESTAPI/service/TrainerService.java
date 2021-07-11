package com.cognizant.learntodayrestapi.service;

import com.cognizant.learntodayrestapi.model.Trainer;

public interface TrainerService {

public boolean trainerSignUp(Trainer t);
	
	public String updatePassword(int id, Trainer t);

}
