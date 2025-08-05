package com.trend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trend.entities.Trend;
import com.trend.serviceImpl.TrensServiceImpl;

@RestController
@RequestMapping("/api/trends")
public class TrendController {
	private final TrensServiceImpl trendservice;

	public TrendController(TrensServiceImpl trendservice) {
		super();
		this.trendservice = trendservice;
	}
	@PostMapping
	public Trend createTrend(@RequestBody Trend trend)
	{
		return trendservice.addTrend(trend);
	}
	@GetMapping
	public List<Trend> getAllTrend()
	{
		return trendservice.getAllTrend();
	}
	@GetMapping("/{id}")
	public Trend getTrend(@PathVariable Long id)
	{
		return trendservice.getTrendById(id);
	}
	@PutMapping("/{id}")
	public Trend updateTrend(@PathVariable Long id,@RequestBody Trend trend)
	{
		return trendservice.updateTrend(id, trend);
		
	}
	 @DeleteMapping("/{id}")
	 public void deleteTrend(@PathVariable Long id)
	 {
		  trendservice.deleteTrend(id);
	 }

}
