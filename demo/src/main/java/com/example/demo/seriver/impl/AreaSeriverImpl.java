package com.example.demo.seriver.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.AreaMapper;
import com.example.demo.dao.pojo.Area;
import com.example.demo.seriver.AreaSeriver;
import com.example.unitl.BaseResponse;

@Service
public class AreaSeriverImpl implements AreaSeriver{

	@Autowired
	private AreaMapper areaMapper;
	
	@Override
	public BaseResponse<List<Area>> getCity() {
		// TODO Auto-generated method stub
		BaseResponse<List<Area>>  result = new BaseResponse<>();
		List<Area> areas = new ArrayList<>();
		areas = areaMapper.getCitys();
		result.setResponseData(areas);
		return result;
	}

	@Override
	public BaseResponse<List<Area>> getArea(String areaNo) {
		// TODO Auto-generated method stub
		BaseResponse<List<Area>>  result = new BaseResponse<>();
		List<Area> areas = new ArrayList<>();
		areas = areaMapper.getAreas(areaNo);
		result.setResponseData(areas);
		return result;
	}

	@Override
	public BaseResponse<List<Area>> getStreet(String streetNo) {
		// TODO Auto-generated method stub
		BaseResponse<List<Area>>  result = new BaseResponse<>();
		List<Area> areas = new ArrayList<>();
		areas = areaMapper.getStreets(streetNo);
		result.setResponseData(areas);
		return result;
	}

}
