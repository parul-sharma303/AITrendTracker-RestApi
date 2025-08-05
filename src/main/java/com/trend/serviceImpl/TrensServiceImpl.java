package com.trend.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trend.entities.Trend;
import com.trend.repo.TrendRepository;
import com.trend.service.TrendService;
import com.trend.exception.*;
@Service
public class TrensServiceImpl implements TrendService {
	private final TrendRepository repo;
	
	
	
	

	public TrensServiceImpl(TrendRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Trend addTrend(Trend trend) {
		
		return repo.save(trend);
	}

	@Override
	public List<Trend> getAllTrend() {
		
		return repo.findAll();
	}

	@Override
	public Trend getTrendById(Long id) {
		
		return repo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Trend not Found "));
	}

	@Override
	public Trend updateTrend(Long id, Trend trend) {
		Trend trend1 = getTrendById(id);
		trend1.setTopic(trend1.getTopic());
		trend1.setCategory(trend1.getCategory());
		trend1.setPopularityScore(trend1.getPopularityScore());
		return repo.save(trend1);
	}

	@Override
	public void deleteTrend(Long id) {
		repo.deleteById(id);
		
	}

}
