package com.br.jogo_dos_times.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.jogo_dos_times.model.Time;

@Service("timeService")
public class TimeService  implements ITimeService {
private static List<Time> timeList = new ArrayList<Time>();

	@Override
    public List<Time> getAllTimes() {
        return timeList;
    }

    @Override
    public void addTime(Time time) {
        timeList.add(time);
    }
}
