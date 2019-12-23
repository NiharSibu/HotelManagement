package com.mindtree.gooddeed.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class CampusMindDto {

	private String midDto;
	private String nameDto;
	
	@JsonIgnoreProperties("mindDto")
	private GoodDeedDto gooddeedDto;

	public CampusMindDto() {
		super();
	}

	public CampusMindDto(String midDto, String nameDto, GoodDeedDto gooddeedDto) {
		super();
		this.midDto = midDto;
		this.nameDto = nameDto;
		this.gooddeedDto = gooddeedDto;
	}

	public CampusMindDto(String midDto, String nameDto) {
		super();
		this.midDto = midDto;
		this.nameDto = nameDto;
	}

	public String getMidDto() {
		return midDto;
	}

	public void setMidDto(String midDto) {
		this.midDto = midDto;
	}

	public String getNameDto() {
		return nameDto;
	}

	public void setNameDto(String nameDto) {
		this.nameDto = nameDto;
	}

	public GoodDeedDto getGooddeedDto() {
		return gooddeedDto;
	}

	public void setGooddeedDto(GoodDeedDto gooddeedDto) {
		this.gooddeedDto = gooddeedDto;
	}
		
}
