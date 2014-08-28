package com.googlecode.gwt.charts.showcase.client.corechart;

import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.ComboChart;
import com.googlecode.gwt.charts.client.corechart.ComboChartOptions;
import com.googlecode.gwt.charts.client.corechart.ComboChartSeries;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.SeriesType;
import com.googlecode.gwt.charts.client.options.VAxis;
import com.googlecode.gwt.charts.client.util.ChartHelper;

public class ComboChartExample extends DockLayoutPanel {
	private ComboChart chart;
	
	public ComboChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new ComboChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		JsArrayMixed dataArray = JsonUtils
				.unsafeEval("[['Month', 'Bolivia', 'Ecuador', 'Madagascar', 'Papua  Guinea', 'Rwanda', 'Average'],['2004/05', 165, 938, 522, 998, 450, 614.6],['2005/06', 135, 1120, 599, 1268, 288, 682],['2006/07', 157, 1167, 587, 807, 397, 623],['2007/08', 139, 1110, 615, 968, 215, 609.4],['2008/09', 136, 691, 629, 1026, 366, 569.6]]");

		// Prepare the data
		DataTable dataTable = ChartHelper.arrayToDataTable(dataArray);

		// Set options
		ComboChartOptions options = ComboChartOptions.create();
		options.setFontName("Tahoma");
		options.setTitle("Monthly Coffee Production by Country");
		options.setHAxis(HAxis.create("Cups"));
		options.setVAxis(VAxis.create("Month"));
		options.setSeriesType(SeriesType.BARS);
		ComboChartSeries series = ComboChartSeries.create();
		series.setType(SeriesType.LINE);
		options.setSeries(5, series);

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
