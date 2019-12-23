package com.mindtree.gooddeed.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.gooddeed.dto.CampusMindDto;
import com.mindtree.gooddeed.dto.GoodDeedDto;
import com.mindtree.gooddeed.dto.SuperviserDto;
import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.entity.Superviser;
import com.mindtree.gooddeed.repository.CampusMindRepository;
import com.mindtree.gooddeed.repository.GoodDeedsRepository;
import com.mindtree.gooddeed.repository.SuperviserRepository;
import com.mindtree.gooddeed.service.GoodDeedService;

@Service
public class GoodDeedServiceImpl implements GoodDeedService {
	@Autowired
	CampusMindRepository cmr;
	@Autowired
	GoodDeedsRepository gdr;
	@Autowired
	SuperviserRepository svr;

  public String AssignMindsToDeedToDB(int deedId, CampusMindDto mindDto) {
	  List<CampusMind> res=new ArrayList<>();
			CampusMind mind = new CampusMind();
			mind.setMid(mindDto.getMidDto());
			mind.setName(mindDto.getNameDto());
			res.add(mind);
		Optional<GoodDeed> gd = gdr.findById(deedId);
		GoodDeed deed = gd.get();
		deed.setMind(res);
		gdr.save(deed);
		for (CampusMind campusMind : res) {
			campusMind.setGooddeed(deed);
			cmr.save(campusMind);
		}
		return "Inserted";	
	}
  
  public List <CampusMindDto> getCampusMind (int deedId){
	  List <CampusMindDto> mindsDto=new ArrayList<>();
	  Optional<GoodDeed> gd = gdr.findById(deedId);
		GoodDeed deed = gd.get();
		List <CampusMind> minds=deed.getMind();
		for (CampusMind cm : minds) {
			CampusMindDto cmd = new CampusMindDto();
			cmd.setMidDto(cm.getMid());
			cmd.setNameDto(cm.getName());
			mindsDto.add(cmd);
		}
	  return mindsDto;
  }
  public List <GoodDeedDto> takeGoodDeeds(){
	  List <GoodDeedDto> deedsDto=new ArrayList<>();
	  List <GoodDeed> deeds=new ArrayList<>();
	  List <GoodDeed> allDeeds=gdr.findAll();
	  for (GoodDeed goodDeed : allDeeds) {
		if(goodDeed.getMind().size()<3) {
			deeds.add(goodDeed);	
		}
	  }
	  for (GoodDeed gd : deeds) {
		  GoodDeedDto deed = new GoodDeedDto();
			deed.setDeedIdDto(gd.getMid());
			deed.setDeedNameDto(gd.getName());
			deedsDto.add(deed);
	}
	  return deedsDto;
  }
  public GoodDeedDto getDeedBySup(int sId){
	  
	  Optional<Superviser> sup =svr.findById(sId);
	  Superviser superviser = sup.get();
	  
	  GoodDeed deed = superviser.getGooddeed();
	  GoodDeedDto deedDto=new GoodDeedDto();
	  
	  deedDto.setDeedIdDto(deed.getMid());
	  deedDto.setDeedNameDto(deed.getName());
	  
	  SuperviserDto supervisers = new SuperviserDto();
	  supervisers.setSupervisorIDDto(deed.getSuperviser().getSupervisorID());
	  supervisers.setSupervisorNameDto(deed.getSuperviser().getSupervisorName());
	  
	  deedDto.setSuperviserDto(supervisers);
	  
	  List <CampusMindDto> mindsD=new ArrayList<>();
	  for (CampusMind mind: deed.getMind()) {
		  CampusMindDto mDto =new CampusMindDto();
		  mDto.setMidDto(mind.getMid());
		  mDto.setNameDto(mind.getName());
		  mindsD.add(mDto);
	}
	  deedDto.setMindDto(mindsD);
		
	
	  return deedDto;
  }
}
