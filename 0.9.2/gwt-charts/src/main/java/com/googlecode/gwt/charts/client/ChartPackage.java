/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client;

/**
 * A definition of available packages
 */
public enum ChartPackage {
	/**
	 * Use for area, bar, bubble, candlestick, column, combo, line, pie, scatter and stepped area charts
	 */
	CORECHART("corechart"),
	/**
	 * Exclusive use for gauge charts
	 */
	GAUGE("gauge"),
	/**
	 * Exclusive use for geochart charts
	 */
	GEOCHART("geochart"),
	/**
	 * Exclusive use for tables
	 */
	TABLE("table"),
	/**
	 * Exclusive use for treemap charts
	 */
	TREEMAP("treemap"),
	/**
	 * Used for controls and dashboards
	 */
	CONTROLS("controls");

	/**
	 * Get a ChartPackage by providing its name.
	 * 
	 * @param name the ChartPackage name.
	 * @return a ChartPackage corresponding to the provided name.
	 */
	public static ChartPackage findByName(String name) {
		for (ChartPackage chartPackage : ChartPackage.values()) {
			if (chartPackage.getName().equals(name)) {
				return chartPackage;
			}
		}
		return null;
	}

	private final String name;

	private ChartPackage(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ChartPackage.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
