package com.data.wrecker.validityDimension.service;

import com.data.wrecker.validityDimension.model.DatasetStats;

public interface WaysToAffectValidityService {

	public String generateJunkValues(String colValue);
	
	public String shuffleString(String colValue);
	
	public String generateStringAndSpecialChars(String colValue);

	public int convertIntToOppositeSign(int colValue);
	
	public String convertBoolIntoPositiveNegative(String colValue);
	
	public String applayValidityForZeroandOnes(int colValue);

	public String invalidateInteger(int colValue);
	
	public String addYearsToDate(DatasetStats datasetStats, String date);
}