package com.trend.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.trend.entities.*;
public interface TrendRepository extends JpaRepository<Trend,Long>{

}
