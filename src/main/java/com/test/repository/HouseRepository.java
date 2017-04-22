package com.test.repository;

import com.test.model.HouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Qiaoyy on 2017/4/20.
 */
public interface HouseRepository extends JpaRepository<HouseEntity,Integer> {
}
