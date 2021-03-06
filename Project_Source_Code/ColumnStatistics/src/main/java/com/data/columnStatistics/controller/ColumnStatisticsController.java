package com.data.columnStatistics.controller;

import java.text.ParseException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.columnStatistics.service.ColumnStatisticsService;
import com.data.columnStatistics.service.MultiColumnStatisticsService;
import com.data.columnStatistics.service.WreakedDataEvaluatorService;

@RestController
@RequestMapping("/columnStatistics")
public class ColumnStatisticsController {
	
	@Autowired
	ColumnStatisticsService columnStatisticsService;
	
	@Autowired
	MultiColumnStatisticsService multiColumnStatisticsService;
	
	@Autowired
	WreakedDataEvaluatorService wreakedDataEvaluatorService;
	@GetMapping("/getColumnStats")
	public String getColumnStatistics(@RequestParam String fileName) throws ParseException {
		String dateFormat="dd-MM-yy";
		String booleanTrueValue="True";
		String booleanFalseValue="False";
		String status = columnStatisticsService.getColumnStatistics(fileName,dateFormat, booleanTrueValue, booleanFalseValue);
		if(status.equals("Success")) {
			return "Success";
		}else {
			return "Error";
		}
	}
	
	@GetMapping("/wreakedDataEvaluation")
	public String wreakedDataEvaluation(@RequestParam String fileName) throws JSONException {
		return wreakedDataEvaluatorService.wreakedDataEvaluation(fileName);
		
	}
	
	@GetMapping("/multiColumnStats")
	public String multiColumnStats(@RequestParam String fileName) throws JSONException {
		return multiColumnStatisticsService.multiColumnDataEvaluation(fileName);
		
	}
	
}
