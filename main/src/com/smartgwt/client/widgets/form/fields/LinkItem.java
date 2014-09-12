/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
/* sgwtgen */
 
package com.smartgwt.client.widgets.form.fields;


import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.tools.*;
import com.smartgwt.client.bean.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.rte.*;
import com.smartgwt.client.widgets.rte.events.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A FormItem that displays an HTML URL. In read-only mode (canEdit:false) the URL is shown as a link; in editable mode the
 * URL is shown in a textbox. <P> The link to open is specified as the item value with {@link
 * com.smartgwt.client.widgets.form.fields.FormItem#setValue FormItem.setValue} or  {@link
 * com.smartgwt.client.widgets.form.fields.FormItem#getDefaultValue defaultValue}. The link title defaults to the URL
 * unless {@link com.smartgwt.client.widgets.form.fields.LinkItem#getLinkTitle linkTitle} is specified. <P> Additionally, a
 * custom action can be triggered when the link is clicked: see {@link
 * com.smartgwt.client.widgets.form.fields.LinkItem#getTarget target} for details.
 */
@BeanFactory.FrameworkClass
public class LinkItem extends StaticTextItem {

    public static LinkItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);

		if(obj != null && JSOHelper.getAttribute(jsObj,"__ref")==null) {
            return com.smartgwt.client.util.ObjectFactory.createFormItem("LinkItem",jsObj);

        } else
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (LinkItem) obj;
        } else {
            return new LinkItem(jsObj);
        }
    }


    /**
     * Changes the defaults for Canvas AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults Canvas defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, Canvas defaults) /*-{
        $wnd.isc.LinkItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
    }-*/;

    /**
     * Changes the defaults for FormItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults FormItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, FormItem defaults) /*-{
        $wnd.isc.LinkItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;
    /**
     * Changes the defaults for DrawItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults DrawItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, DrawItem defaults) /*-{
        $wnd.isc.LinkItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.drawing.DrawItem::getJsObj()());
    }-*/;

    public static native void changePickerIconDefaults(FormItemIcon defaults) /*-{
        $wnd.isc.LinkItem.changeDefaults("pickerIconDefaults", defaults.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    public LinkItem(){
        setAttribute("editorType", "LinkItem");
    }

    public LinkItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public LinkItem(String name) {
        setName(name);
                setAttribute("editorType", "LinkItem");
    }


    // ********************* Properties / Attributes ***********************

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to false, should {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getIcons icons} be disabled by default? <P> This may also be specified
     * at the icon level. See {@link com.smartgwt.client.widgets.form.fields.FormItemIcon#getDisableOnReadOnly
     * disableOnReadOnly}.
     *
     * @param disableIconsOnReadOnly  Default value is false
     */
    public void setDisableIconsOnReadOnly(Boolean disableIconsOnReadOnly) {
        setAttribute("disableIconsOnReadOnly", disableIconsOnReadOnly);
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to false, should {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getIcons icons} be disabled by default? <P> This may also be specified
     * at the icon level. See {@link com.smartgwt.client.widgets.form.fields.FormItemIcon#getDisableOnReadOnly
     * disableOnReadOnly}.
     *
     * @return Boolean
     */
    public Boolean getDisableIconsOnReadOnly()  {
        Boolean result = getAttributeAsBoolean("disableIconsOnReadOnly", true);
        return result == null ? false : result;
    }
    

    /**
     * Optional title HTML to display for this item's link. If unspecified the value of the item will be the title text as well
     * as the target of the link.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Method to set the linkTitle for this item
     *
     * @param linkTitle new linkTitle for this item See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is null
     */
    public void setLinkTitle(String linkTitle) {
        setAttribute("linkTitle", linkTitle);
    }

    /**
     * Optional title HTML to display for this item's link. If unspecified the value of the item will be the title text as well
     * as the target of the link.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getLinkTitle()  {
        return getAttributeAsString("linkTitle");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to <code>false</code>, how should
     * this item be displayed to the user? <P> LinkItems are, by default, canEdit: false and only <code>disabled</code>
     * appearance has an effect - for other appearances, the item remains active.
     *
     * @param readOnlyDisplay  Default value is "readOnly"
     */
    public void setReadOnlyDisplay(ReadOnlyDisplayAppearance readOnlyDisplay) {
        setAttribute("readOnlyDisplay", readOnlyDisplay == null ? null : readOnlyDisplay.getValue());
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to <code>false</code>, how should
     * this item be displayed to the user? <P> LinkItems are, by default, canEdit: false and only <code>disabled</code>
     * appearance has an effect - for other appearances, the item remains active.
     *
     * @return ReadOnlyDisplayAppearance
     */
    public ReadOnlyDisplayAppearance getReadOnlyDisplay()  {
        return EnumUtil.getEnum(ReadOnlyDisplayAppearance.values(), getAttribute("readOnlyDisplay"));
    }
    

    /**
     * By default, clicking a link rendered by this item opens it in a new browser window.  You  can alter this behavior by
     * setting this property.  The value of this property will be  passed as the value to the <code>target</code> attribute of
     * the anchor tag used to render  the link. <P> If you set linkItem.target to "javascript", the default behaviour is to
     * catch and consume mouse-clicks that would result in the link being followed.  Instead, the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#addClickHandler FormItem.click} event is fired.
     *
     * @param target  Default value is "_blank"
     */
    public void setTarget(String target) {
        setAttribute("target", target);
    }

    /**
     * By default, clicking a link rendered by this item opens it in a new browser window.  You  can alter this behavior by
     * setting this property.  The value of this property will be  passed as the value to the <code>target</code> attribute of
     * the anchor tag used to render  the link. <P> If you set linkItem.target to "javascript", the default behaviour is to
     * catch and consume mouse-clicks that would result in the link being followed.  Instead, the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#addClickHandler FormItem.click} event is fired.
     *
     * @return String
     */
    public String getTarget()  {
        return getAttributeAsString("target");
    }
    

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties of the class instance passed to this function.
     * This is a powerful feature that eliminates the need for users to create a separate
     * hierarchy of subclasses that only alter the default properties of this class. Can also
     * be used for skinning / styling purposes.  <P> <b>Note:</b> This method is intended for
     * setting default attributes only and will affect all instances of the underlying class
     * (including those automatically generated in JavaScript).  This method should not be used
     * to apply standard EventHandlers or override methods for a class - use a custom subclass
     * instead.  Calling this method after instances have been created can result in undefined
     * behavior, since it bypasses any setters and a class instance may have already examined 
     * a particular property and not be expecting any changes through this route.
     *
     * @param linkItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(LinkItem linkItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},linkItemProperties.@com.smartgwt.client.core.RefDataClass::getJsObj()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.LinkItem.addProperties(properties);
    }-*/;

    // ***********************************************************


    public HandlerRegistration addClickHandler(com.smartgwt.client.widgets.form.fields.events.ClickHandler handler) {
        setTarget("javascript");
        return super.addClickHandler(handler);
    }

}


