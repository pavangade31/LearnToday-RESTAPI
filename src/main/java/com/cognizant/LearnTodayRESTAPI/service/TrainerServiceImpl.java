package com.cognizant.learntodayrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.learntodayrestapi.dao.TrainerDao;
import com.cognizant.learntodayrestapi.model.Trainer;

@Service
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	TrainerDao trainerDao;
	
	@Override
	public boolean trainerSignUp(Trainer t) {
		return trainerDao.trainerSignUp(t);
	}

	@Override
	public String updatePassword(int id, Trainer t) {
		return trainerDao.updatePassword(id, t);
	}

}
