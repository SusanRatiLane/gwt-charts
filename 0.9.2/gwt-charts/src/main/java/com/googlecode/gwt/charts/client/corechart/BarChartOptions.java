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
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JsArray;

import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.FocusTarget;
import com.googlecode.gwt.charts.client.options.HAxis;

public class BarChartOptions extends CoreOptions {
	public static BarChartOptions create() {
		return createObject().cast();
	}

	protected BarChartOptions() {
	}

	public final void setFocusTarget(FocusTarget focusTarget) {
		setFocusTarget(focusTarget);
	}

	public final native void setHAxes(JsArray<HAxis> hAxes) /*-{
		this.hAxes = hAxes;
	}-*/;

	public final native void setIsStacked(boolean isStacked) /*-{
		this.isStacked = isStacked;
	}-*/;

	public final native void setReverseCategories(boolean reverseCategories) /*-{
		this.reverseCategories = reverseCategories;
	}-*/;

	public final native void setSeries(JsArray<BarChartSeries> series) /*-{
		this.series = series;
	}-*/;

	private final native void setFocusTarget(String focusTarget) /*-{
		this.focusTarget = focusTarget;
	}-*/;

}
