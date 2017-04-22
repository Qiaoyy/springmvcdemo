package com.test.controller;

import com.test.model.HouseEntity;
import com.test.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Qiaoyy on 2017/4/19.
 */
@Controller
public class HouseController {
    @Autowired
    HouseRepository houseRepository;
    @RequestMapping(value = "/house/houses", method = RequestMethod.GET)
    public String getHouses(ModelMap modelMap) {
        // 查询role表中所有记录
        List<HouseEntity> houseList = houseRepository.findAll();

        modelMap.addAttribute("houseList", houseList);

        return "/house/houses";
    }
}
