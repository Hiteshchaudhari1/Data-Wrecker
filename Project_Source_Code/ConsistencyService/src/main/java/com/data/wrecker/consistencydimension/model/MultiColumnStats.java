package com.data.wrecker.consistencydimension.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MultiColumnStats {

	List<String> dependantColumnNames;
	
}
