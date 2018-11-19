package com.example.demo.contronller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.pojo.Area;
import com.example.demo.seriver.AreaSeriver;
import com.example.unitl.BaseResponse;

@RestController
@RequestMapping("/seriver/position")
public class AreaContronller {
	
	@Autowired
	private AreaSeriver areaSeriver;
	
	  @ResponseBody
	  @RequestMapping(value = "getcity", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	  public BaseResponse<List<Area>> getCity(HttpServletRequest request){
		return areaSeriver.getCity();
		  
	  }
	  
	  @RequestMapping(value = "getarea", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	  public BaseResponse<List<Area>> getArea(@RequestParam("city") String areaNo,HttpServletRequest request){
		return areaSeriver.getArea(areaNo);
		  
	  }
	  
	  @RequestMapping(value = "getstreet", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	  public BaseResponse<List<Area>> getStreet(@RequestParam("area") String streetNo,HttpServletRequest request){
		return areaSeriver.getStreet(streetNo);
		  
	  }

}
