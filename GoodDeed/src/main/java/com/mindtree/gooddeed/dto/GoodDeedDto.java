package com.mindtree.gooddeed.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class GoodDeedDto {

	private int deedIdDto ;
	private String deedNameDto;
	
	@JsonIgnoreProperties("goodDeedDto")
	private SuperviserDto superviserDto;
	
	@JsonIgnoreProperties("gooddeedDto")
	private List<CampusMindDto> mindDto;

	public GoodDeedDto() {
		super();
	}

	public GoodDeedDto(int deedIdDto, String deedNameDto, SuperviserDto superviserDto, List<CampusMindDto> mindDto) {
		super();
		this.deedIdDto = deedIdDto;
		this.deedNameDto = deedNameDto;
		this.superviserDto = superviserDto;
		this.mindDto = mindDto;
	}

	public GoodDeedDto(int deedIdDto, String deedNameDto) {
		super();
		this.deedIdDto = deedIdDto;
		this.deedNameDto = deedNameDto;
	}

	public int getDeedIdDto() {
		return deedIdDto;
	}

	public void setDeedIdDto(int deedIdDto) {
		this.deedIdDto = deedIdDto;
	}

	public String getDeedNameDto() {
		return deedNameDto;
	}

	public void setDeedNameDto(String deedNameDto) {
		this.deedNameDto = deedNameDto;
	}

	public SuperviserDto getSuperviserDto() {
		return superviserDto;
	}

	public void setSuperviserDto(SuperviserDto superviserDto) {
		this.superviserDto = superviserDto;
	}

	public List<CampusMindDto> getMindDto() {
		return mindDto;
	}

	public void setMindDto(List<CampusMindDto> mindDto) {
		this.mindDto = mindDto;
	}
	
}
