package com.mindtree.gooddeed.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class SuperviserDto {

	private int supervisorIDDto;
	private String supervisorNameDto;
	
	@JsonIgnoreProperties("superviserDto")
	private GoodDeedDto goodDeedDto;

	public SuperviserDto() {
		super();
	}

	public SuperviserDto(int supervisorIDDto, String supervisorNameDto, GoodDeedDto goodDeedDto) {
		super();
		this.supervisorIDDto = supervisorIDDto;
		this.supervisorNameDto = supervisorNameDto;
		this.goodDeedDto = goodDeedDto;
	}

	public SuperviserDto(int supervisorIDDto, String supervisorNameDto) {
		super();
		this.supervisorIDDto = supervisorIDDto;
		this.supervisorNameDto = supervisorNameDto;
	}

	public int getSupervisorIDDto() {
		return supervisorIDDto;
	}

	public void setSupervisorIDDto(int supervisorIDDto) {
		this.supervisorIDDto = supervisorIDDto;
	}

	public String getSupervisorNameDto() {
		return supervisorNameDto;
	}

	public void setSupervisorNameDto(String supervisorNameDto) {
		this.supervisorNameDto = supervisorNameDto;
	}

	public GoodDeedDto getGoodDeedDto() {
		return goodDeedDto;
	}

	public void setGoodDeedDto(GoodDeedDto goodDeedDto) {
		this.goodDeedDto = goodDeedDto;
	}
	
}
