package com.trend.service;
import java.util.List;

import com.trend.entities.*;
public interface TrendService {
	Trend addTrend(Trend trend);
	List<Trend> getAllTrend();
	Trend getTrendById(Long id);
	Trend updateTrend(Long id, Trend trend);
	void deleteTrend(Long id);
	
	

}
