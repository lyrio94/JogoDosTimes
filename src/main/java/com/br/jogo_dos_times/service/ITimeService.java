package com.br.jogo_dos_times.service;

import java.util.List;

import com.br.jogo_dos_times.model.Time;

public interface ITimeService {

	List<Time> getAllTimes();

	void addTime(Time time);

}
