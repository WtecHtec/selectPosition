package com.example.demo.seriver;

import java.util.List;

import com.example.demo.dao.pojo.Area;
import com.example.unitl.BaseResponse;

public interface AreaSeriver {
	
	BaseResponse<List<Area>> getCity();
	
	BaseResponse<List<Area>> getArea(String areaNo);
	
	BaseResponse<List<Area>> getStreet( String streetNo);
}
