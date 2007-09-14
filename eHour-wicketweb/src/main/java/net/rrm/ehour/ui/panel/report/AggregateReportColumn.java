/**
 * Created on Sep 12, 2007
 * Created by Thies Edeling
 * Created by Thies Edeling
 * Copyright (C) 2007 TE-CON, All Rights Reserved.
 *
 * This Software is copyright TE-CON 2007. This Software is not open source by definition. The source of the Software is available for educational purposes.
 * TE-CON holds all the ownership rights on the Software.
 * TE-CON freely grants the right to use the Software. Any reproduction or modification of this Software, whether for commercial use or open source,
 * is subject to obtaining the prior express authorization of TE-CON.
 * 
 * thies@te-con.nl
 * TE-CON
 * Legmeerstraat 4-2h, 1058ND, AMSTERDAM, The Netherlands
 *
 */

package net.rrm.ehour.ui.panel.report;

import java.io.Serializable;

import org.apache.wicket.model.IModel;

/**
 * Report column
 * 
 * The conversionModelArgs may look iffy, cloning a model could as well be accomplished
 * with a clone() however that also means that for each model the constructor args should
 * be stored globally in the object. Now reflection is cpu wise more costly while storing
 * constructor args is more memory costly. May matter with large reports 
 **/

public class AggregateReportColumn implements Serializable
{
	public static enum ColumnType { OTHER, HOUR, TURNOVER };
	
	private static final long serialVersionUID = -6736366461333244457L;
	private boolean						visible = true;
	private	String						columnHeaderResourceKey;
	private Class<? extends IModel>		conversionModel;
	private Object[]					conversionModelConstructorParams;
	
	private ColumnType	columnType = ColumnType.OTHER;
	
	
	public AggregateReportColumn()
	{
	}

	public AggregateReportColumn(String columnHeaderResourceKey)
	{
		this(columnHeaderResourceKey, true);
	}

	public AggregateReportColumn(String columnHeaderResourceKey, ColumnType columnType)
	{
		this(columnHeaderResourceKey, null, null, true, columnType);
	}

	public AggregateReportColumn(String columnHeaderResourceKey, boolean visible)
	{
		this(columnHeaderResourceKey, null, null, visible);
	}

	public AggregateReportColumn(String columnHeaderResourceKey, Class<? extends IModel> conversionModel)
	{
		this(columnHeaderResourceKey, conversionModel, null, true);
	}

	public AggregateReportColumn(String columnHeaderResourceKey, Class<? extends IModel> conversionModel, Object[] conversionModelArgs, boolean visible)
	{
		this(columnHeaderResourceKey, conversionModel, conversionModelArgs, visible, ColumnType.OTHER);
	}
	
	public AggregateReportColumn(String columnHeaderResourceKey, Class<? extends IModel> conversionModel, Object[] conversionModelArgs, boolean visible, ColumnType columnType)
	{
		this.columnHeaderResourceKey = columnHeaderResourceKey;
		this.conversionModel = conversionModel;
		this.visible = visible;
		this.columnType = columnType;
		this.conversionModelConstructorParams = conversionModelArgs;
	}
	
	/**
	 * @return the visible
	 */
	public boolean isVisible()
	{
		return visible;
	}
	/**
	 * @param visible the visible to set
	 */
	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}
	/**
	 * @return the columnHeaderResourceKey
	 */
	public String getColumnHeaderResourceKey()
	{
		return columnHeaderResourceKey;
	}
	/**
	 * @param columnHeaderResourceKey the columnHeaderResourceKey to set
	 */
	public void setColumnHeaderResourceKey(String columnHeaderResourceKey)
	{
		this.columnHeaderResourceKey = columnHeaderResourceKey;
	}
	/**
	 * @return the conversionModel
	 */
	public Class<? extends IModel> getConversionModel()
	{
		return conversionModel;
	}
	/**
	 * @param conversionModel the conversionModel to set
	 */
	public void setConversionModel(Class<? extends IModel> conversionModel)
	{
		this.conversionModel = conversionModel;
	}

	/**
	 * @return the columnType
	 */
	public ColumnType getColumnType()
	{
		return columnType;
	}

	/**
	 * @param columnType the columnType to set
	 */
	public void setColumnType(ColumnType columnType)
	{
		this.columnType = columnType;
	}

	/**
	 * @return the conversionModelConstructorParams
	 */
	public Object[] getConversionModelConstructorParams()
	{
		return conversionModelConstructorParams;
	}

	/**
	 * @param conversionModelConstructorParams the conversionModelConstructorParams to set
	 */
	public void setConversionModelConstructorParams(Object[] conversionModelConstructorParams)
	{
		this.conversionModelConstructorParams = conversionModelConstructorParams;
	}
}
