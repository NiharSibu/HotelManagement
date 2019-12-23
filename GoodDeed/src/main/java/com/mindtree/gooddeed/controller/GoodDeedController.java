package com.mindtree.gooddeed.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.gooddeed.dto.CampusMindDto;
import com.mindtree.gooddeed.dto.GoodDeedDto;
import com.mindtree.gooddeed.service.serviceimpl.GoodDeedServiceImpl;

@RestController
public class GoodDeedController {
	@Autowired
	private GoodDeedServiceImpl deedService;

	@PostMapping ("/insert-mind/{deedId}")
	private String AssignMindsToDeed(@PathVariable int deedId, @RequestBody CampusMindDto minds) {
		String str = deedService.AssignMindsToDeedToDB(deedId, minds);
		return str;	
	}
	@GetMapping ("/insert-deedid/{deedId}")
	private List<CampusMindDto> sendMind(@PathVariable int deedId){
		return deedService.getCampusMind(deedId);
	}
	@GetMapping("/displyDeeds")
	private List<GoodDeedDto> sendDeeds(){
		return deedService.takeGoodDeeds();
	}
	@GetMapping("/getdeeds/{sId}")
	private GoodDeedDto getDeeds(@PathVariable int sId){
		GoodDeedDto res=deedService.getDeedBySup(sId);
		return res;
	}
}
