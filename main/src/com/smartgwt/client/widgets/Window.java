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
 
package com.smartgwt.client.widgets;


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
import com.smartgwt.logicalstructure.core.*;
import com.smartgwt.logicalstructure.widgets.*;
import com.smartgwt.logicalstructure.widgets.drawing.*;
import com.smartgwt.logicalstructure.widgets.plugins.*;
import com.smartgwt.logicalstructure.widgets.form.*;
import com.smartgwt.logicalstructure.widgets.tile.*;
import com.smartgwt.logicalstructure.widgets.grid.*;
import com.smartgwt.logicalstructure.widgets.chart.*;
import com.smartgwt.logicalstructure.widgets.layout.*;
import com.smartgwt.logicalstructure.widgets.menu.*;
import com.smartgwt.logicalstructure.widgets.rte.*;
import com.smartgwt.logicalstructure.widgets.tab.*;
import com.smartgwt.logicalstructure.widgets.tableview.*;
import com.smartgwt.logicalstructure.widgets.toolbar.*;
import com.smartgwt.logicalstructure.widgets.tree.*;
import com.smartgwt.logicalstructure.widgets.viewer.*;
import com.smartgwt.logicalstructure.widgets.calendar.*;
import com.smartgwt.logicalstructure.widgets.cube.*;
import com.smartgwt.logicalstructure.widgets.tools.*;

/**
 * A general purpose Window class for implementing dialogs, portlets, alerts, prompts, wizards and desktop-like windowing
 * interfaces. <P> Windows can contain arbitrary Smart GWT components, configured via the {@link
 * com.smartgwt.client.widgets.Window#getItems items} property.  Windows may be {@link
 * com.smartgwt.client.widgets.Window#getIsModal modal} or non-modal. <P> Windows provide a series of highly configurable
 * and skinnable {@link com.smartgwt.client.types.AutoChild autoChildren} including a header, various header controls,
 * footer, and corner resizer. <P> The more specialized {@link com.smartgwt.client.widgets.Dialog} subclass of Window has
 * additional functionality targetted at simple prompts and confirmations, such as buttons with default actions, and
 * single-method {@link com.smartgwt.client.util.isc#warn shortcuts} for common application dialogs.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("Window")
public class Window extends VLayout implements com.smartgwt.client.widgets.events.HasCloseClickHandlers, com.smartgwt.client.widgets.events.HasMaximizeClickHandlers, com.smartgwt.client.widgets.events.HasMinimizeClickHandlers, com.smartgwt.client.widgets.events.HasRestoreClickHandlers {

    public static Window getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new Window(jsObj);
        } else {
            assert refInstance instanceof Window;
            return (Window)refInstance;
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
        $wnd.isc.Window.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.Window.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public Window(){
        setShowHeaderIcon(false);scClassName = "Window";
    }

    public Window(JavaScriptObject jsObj){
        scClassName = "Window";
        setJavaScriptObject(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var scClassName = this.@com.smartgwt.client.widgets.BaseWidget::scClassName;
        var widget = $wnd.isc[scClassName].create(config);
        if ($wnd.isc.keepGlobals) this.@com.smartgwt.client.widgets.BaseWidget::internalSetID(Lcom/google/gwt/core/client/JavaScriptObject;)(widget);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;

    // ********************* Properties / Attributes ***********************

    /**
     * Should this window minimize, maximize, and restore as an animation, or as a  simple 1-step transition?
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param animateMinimize  Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_minimize" target="examples">Window Minimize Example</a>
     */
    public void setAnimateMinimize(Boolean animateMinimize) {
        setAttribute("animateMinimize", animateMinimize, true);
    }

    /**
     * Should this window minimize, maximize, and restore as an animation, or as a  simple 1-step transition?
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_minimize" target="examples">Window Minimize Example</a>
     */
    public Boolean getAnimateMinimize()  {
        return getAttributeAsBoolean("animateMinimize");
    }
    

    /**
     * If true, this Window widget will automatically be centered on the page when shown.      If false, it will show up in the
     * last position it was placed (either programmatically,      or by user interaction).
     *
     * @param autoCenter  Default value is autoCenter
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setAutoCenter(Boolean autoCenter) {
        setAttribute("autoCenter", autoCenter, true);
    }

    /**
     * If true, this Window widget will automatically be centered on the page when shown.      If false, it will show up in the
     * last position it was placed (either programmatically,      or by user interaction).
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getAutoCenter()  {
        return getAttributeAsBoolean("autoCenter");
    }
    

    /**
     * If true, the window is resized automatically to accommodate the contents   of the body, if they would otherwise require
     * scrolling.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Setter for {@link com.smartgwt.client.widgets.Window#getAutoSize autoSize}
     *
     * @param autoSize true if the window should auto-size to its content. Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_windows_autosize" target="examples">Auto Size Example</a>
     */
    public void setAutoSize(Boolean autoSize) {
        setAttribute("autoSize", autoSize, true);
    }

    /**
     * If true, the window is resized automatically to accommodate the contents   of the body, if they would otherwise require
     * scrolling.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_windows_autosize" target="examples">Auto Size Example</a>
     */
    public Boolean getAutoSize()  {
        Boolean result = getAttributeAsBoolean("autoSize");
        return result == null ? false : result;
    }
    

    /**
     * Body of the Window, where {@link com.smartgwt.client.docs.Items contained components} or {@link
     * com.smartgwt.client.widgets.Window#getSrc loaded content} is shown.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Canvas
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Canvas getBody() throws IllegalStateException {
        errorIfNotCreated("body");
        return (Canvas)Canvas.getByJSObject(getAttributeAsJavaScriptObject("body"));
    }
    

    /**
     * Color of the Window body. Overrides the background color specified in the style.
     *
     * @param bodyColor  Default value is "#FFFFFF"
     * @see com.smartgwt.client.widgets.Window#flash
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setBodyColor(String bodyColor) {
        setAttribute("bodyColor", bodyColor, true);
    }

    /**
     * Color of the Window body. Overrides the background color specified in the style.
     *
     * @return String
     * @see com.smartgwt.client.widgets.Window#flash
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getBodyColor()  {
        return getAttributeAsString("bodyColor");
    }
    
    

    /**
     * Default properties for the body of the Window<br> You can change the class-level bodyDefaults for all Windows by
     * changing this item or set  instance.body to be another object of properties to override for your instance only
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param bodyDefaults  Default value is ...
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setBodyDefaults(Map bodyDefaults) {
        setAttribute("bodyDefaults", bodyDefaults, true);
    }
    

    /**
     * Style of the Window body.
     *
     * @param bodyStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "windowBody"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setBodyStyle(String bodyStyle) {
        setAttribute("bodyStyle", bodyStyle, true);
    }

    /**
     * Style of the Window body.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getBodyStyle()  {
        return getAttributeAsString("bodyStyle");
    }
    

    /**
     * Should this window automatically be shown at the top of the page's z-order and be brought to front via {@link
     * com.smartgwt.client.widgets.Canvas#bringToFront Canvas.bringToFront} whenever the user clicks it? <P> If {@link
     * com.smartgwt.client.widgets.Window#getIsModal isModal} is true for this window, this setting will have no effect - we
     * always bring the window to the front on initial display and on mouseDown. By default we also do this for non-modal
     * windows (which matches user expectation for most standard interfaces - think of switching between OS-level application
     * windows), but  this may be disabled for cases where it is not appropriate by setting this attribute to
     * <code>false</code>
     *
     * @param bringToFrontOnMouseUp  Default value is true
     */
    public void setBringToFrontOnMouseUp(boolean bringToFrontOnMouseUp) {
        setAttribute("bringToFrontOnMouseUp", bringToFrontOnMouseUp, true);
    }

    /**
     * Should this window automatically be shown at the top of the page's z-order and be brought to front via {@link
     * com.smartgwt.client.widgets.Canvas#bringToFront Canvas.bringToFront} whenever the user clicks it? <P> If {@link
     * com.smartgwt.client.widgets.Window#getIsModal isModal} is true for this window, this setting will have no effect - we
     * always bring the window to the front on initial display and on mouseDown. By default we also do this for non-modal
     * windows (which matches user expectation for most standard interfaces - think of switching between OS-level application
     * windows), but  this may be disabled for cases where it is not appropriate by setting this attribute to
     * <code>false</code>
     *
     * @return boolean
     */
    public boolean getBringToFrontOnMouseUp()  {
        Boolean result = getAttributeAsBoolean("bringToFrontOnMouseUp");
        return result == null ? true : result;
    }
    

    /**
     * If true, this Window may be moved around by the user by dragging on the Window header.   Note that if the header is not
     * showing, the Window can't be drag-repositioned regardless of this setting.
     *
     * @param canDragReposition  Default value is true
     * @see com.smartgwt.client.widgets.Window#setShowHeader
     */
    public void setCanDragReposition(Boolean canDragReposition) {
        setAttribute("canDragReposition", canDragReposition, true);
    }

    /**
     * If true, this Window may be moved around by the user by dragging on the Window header.   Note that if the header is not
     * showing, the Window can't be drag-repositioned regardless of this setting.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.Window#getShowHeader
     */
    public Boolean getCanDragReposition()  {
        Boolean result = getAttributeAsBoolean("canDragReposition");
        return result == null ? true : result;
    }
    

    /**
     * Can the window be drag-resized? If true the window may be drag resized from its edges, and if showing, via the resizer
     * icon in the footer.
     *
     * @param canDragResize  Default value is false
     * @see com.smartgwt.client.widgets.Window#setShowResizer
     */
    public void setCanDragResize(Boolean canDragResize) {
        setAttribute("canDragResize", canDragResize, true);
    }

    /**
     * Can the window be drag-resized? If true the window may be drag resized from its edges, and if showing, via the resizer
     * icon in the footer.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.Window#getShowResizer
     */
    public Boolean getCanDragResize()  {
        Boolean result = getAttributeAsBoolean("canDragResize");
        return result == null ? false : result;
    }
    

    /**
     * If true, the user can give the header buttons keyboard focus (by clicking on      them and including them in the
     * tabOrder)
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param canFocusInHeaderButtons  Default value is false
     * @see com.smartgwt.client.docs.Focus Focus overview and related methods
     */
    public void setCanFocusInHeaderButtons(Boolean canFocusInHeaderButtons) {
        setAttribute("canFocusInHeaderButtons", canFocusInHeaderButtons, true);
    }

    /**
     * If true, the user can give the header buttons keyboard focus (by clicking on      them and including them in the
     * tabOrder)
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Focus Focus overview and related methods
     */
    public Boolean getCanFocusInHeaderButtons()  {
        Boolean result = getAttributeAsBoolean("canFocusInHeaderButtons");
        return result == null ? false : result;
    }
    

    /**
     * Button show in the header that will close this Window by calling {@link
     * com.smartgwt.client.widgets.Window#addCloseClickHandler Window.closeClick}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getCloseButton() throws IllegalStateException {
        errorIfNotCreated("closeButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("closeButton"));
    }
    

    /**
     * The layout policy that should be used for widgets within the Window body. <P> Valid values are "vertical", "horizontal",
     * "none".  If the body is a Layout, this controls how the items are stacked in the body by setting {@link
     * com.smartgwt.client.widgets.layout.Layout#getVertical vertical}.   See {@link
     * com.smartgwt.client.widgets.Window#getBodyConstructor bodyConstructor} for details.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param contentLayout  Default value is "vertical"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setContentLayout(String contentLayout) {
        setAttribute("contentLayout", contentLayout, true);
    }

    /**
     * The layout policy that should be used for widgets within the Window body. <P> Valid values are "vertical", "horizontal",
     * "none".  If the body is a Layout, this controls how the items are stacked in the body by setting {@link
     * com.smartgwt.client.widgets.layout.Layout#getVertical vertical}.   See {@link
     * com.smartgwt.client.widgets.Window#getBodyConstructor bodyConstructor} for details.
     *
     * @return String
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getContentLayout()  {
        return getAttributeAsString("contentLayout");
    }
    

    /**
     * If this window has {@link com.smartgwt.client.widgets.Window#getSrc src} specified, this property can be used to
     * indicate whether the source is a standalone HTML page or an HTML fragment. <P> This is similar to the {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsType contentsType} property - be sure to read the HTMLFlow documentation
     * to understand circumstances where contentsType:"page" is <b>unsafe and not recommended</b>.
     *
     * @param contentsType  Default value is "page"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.Window#setSrc
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setContentsType(String contentsType)  throws IllegalStateException {
        setAttribute("contentsType", contentsType, false);
    }

    /**
     * If this window has {@link com.smartgwt.client.widgets.Window#getSrc src} specified, this property can be used to
     * indicate whether the source is a standalone HTML page or an HTML fragment. <P> This is similar to the {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsType contentsType} property - be sure to read the HTMLFlow documentation
     * to understand circumstances where contentsType:"page" is <b>unsafe and not recommended</b>.
     *
     * @return String
     * @see com.smartgwt.client.widgets.Window#getSrc
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getContentsType()  {
        return getAttributeAsString("contentsType");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.Window#getMinimizeHeight minimizeHeight} is unset, by the window will shrink to
     * the height of the header when minimized. <BR> If there is no header, the <code>defaultMinimizeHeight</code> will be used
     * instead.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param defaultMinimizeHeight  Default value is 16
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setDefaultMinimizeHeight(int defaultMinimizeHeight) {
        setAttribute("defaultMinimizeHeight", defaultMinimizeHeight, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.Window#getMinimizeHeight minimizeHeight} is unset, by the window will shrink to
     * the height of the header when minimized. <BR> If there is no header, the <code>defaultMinimizeHeight</code> will be used
     * instead.
     *
     * @return int
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public int getDefaultMinimizeHeight()  {
        return getAttributeAsInt("defaultMinimizeHeight");
    }
    

    /**
     * Should this window be dismissed (same effect as pressing the "Cancel" button) when the  user presses the "Escape" key?
     * Behavior will only occur while the window or one of its descendants has focus, and does not cancel the Escape keypress.
     * <P> If unset default behavior depends on whether a close / cancel button is visible for this item.
     *
     * @param dismissOnEscape  Default value is null
     * @see com.smartgwt.client.widgets.Window#shouldDismissOnEscape
     */
    public void setDismissOnEscape(Boolean dismissOnEscape) {
        setAttribute("dismissOnEscape", dismissOnEscape, true);
    }

    /**
     * Should this window be dismissed (same effect as pressing the "Cancel" button) when the  user presses the "Escape" key?
     * Behavior will only occur while the window or one of its descendants has focus, and does not cancel the Escape keypress.
     * <P> If unset default behavior depends on whether a close / cancel button is visible for this item.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.Window#shouldDismissOnEscape
     */
    public Boolean getDismissOnEscape()  {
        return getAttributeAsBoolean("dismissOnEscape");
    }
    

    /**
     * If true, a click outside the bounds of the Window will have the same effect as      pressing its cancel button.<br>     
     * <b>Note:</b> Applies only to modal windows.
     *
     * @param dismissOnOutsideClick  Default value is false
     * @see com.smartgwt.client.widgets.Window#setIsModal
     */
    public void setDismissOnOutsideClick(Boolean dismissOnOutsideClick) {
        setAttribute("dismissOnOutsideClick", dismissOnOutsideClick, true);
    }

    /**
     * If true, a click outside the bounds of the Window will have the same effect as      pressing its cancel button.<br>     
     * <b>Note:</b> Applies only to modal windows.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.Window#getIsModal
     */
    public Boolean getDismissOnOutsideClick()  {
        Boolean result = getAttributeAsBoolean("dismissOnOutsideClick");
        return result == null ? false : result;
    }
    

    /**
     * Default class used to construct {@link com.smartgwt.client.tools.EditProxy} for this component when editMode is enabled.
     *
     * @param editProxyConstructor  See {@link com.smartgwt.client.docs.SCClassName SCClassName} . Default value is "WindowEditProxy"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEditProxyConstructor(String editProxyConstructor)  throws IllegalStateException {
        setAttribute("editProxyConstructor", editProxyConstructor, false);
    }

    /**
     * Default class used to construct {@link com.smartgwt.client.tools.EditProxy} for this component when editMode is enabled.
     *
     * @return  See {@link com.smartgwt.client.docs.SCClassName SCClassName} 
     */
    public String getEditProxyConstructor()  {
        return getAttributeAsString("editProxyConstructor");
    }
    

    /**
     * Alternative style for the window used whenever {@link com.smartgwt.client.widgets.Window#getPlacement placement}
     * settings indicate the menu will be filling a portion of the screen or a panel.  Generally this alternative style should
     * not have rounded or excessively large edges.
     *
     * @param fillSpaceStyleName  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "windowBackgroundFill"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setFillSpaceStyleName(String fillSpaceStyleName)  throws IllegalStateException {
        setAttribute("fillSpaceStyleName", fillSpaceStyleName, false);
    }

    /**
     * Alternative style for the window used whenever {@link com.smartgwt.client.widgets.Window#getPlacement placement}
     * settings indicate the menu will be filling a portion of the screen or a panel.  Generally this alternative style should
     * not have rounded or excessively large edges.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getFillSpaceStyleName()  {
        return getAttributeAsString("fillSpaceStyleName");
    }
    

    /**
     * Optional footer for the window, providing space for controls such as the resizer and  status bar.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return HLayout
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public HLayout getFooter() throws IllegalStateException {
        errorIfNotCreated("footer");
        return (HLayout)HLayout.getByJSObject(getAttributeAsJavaScriptObject("footer"));
    }
    
    

    /**
     * The height of the footer, in pixels.
     *
     * @param footerHeight  Default value is 18
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setFooterHeight(int footerHeight)  throws IllegalStateException {
        setAttribute("footerHeight", footerHeight, false);
    }

    /**
     * The height of the footer, in pixels.
     *
     * @return int
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public int getFooterHeight()  {
        return getAttributeAsInt("footerHeight");
    }
    

    /**
     * Header for the Window, based on an HLayout. The header contains the title and some standard controls for the window,
     * which may be configured via {@link com.smartgwt.client.widgets.Window#getHeaderControls headerControls}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return HLayout
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public HLayout getHeader() throws IllegalStateException {
        errorIfNotCreated("header");
        return (HLayout)HLayout.getByJSObject(getAttributeAsJavaScriptObject("header"));
    }
    

    /**
     * Img background component for the header, for gradient or image-based display
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Img
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Img getHeaderBackground() throws IllegalStateException {
        errorIfNotCreated("headerBackground");
        return (Img)Img.getByJSObject(getAttributeAsJavaScriptObject("headerBackground"));
    }
    
    

    /**
     * Header icon shown at left end of header by default.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Img
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Img getHeaderIcon() throws IllegalStateException {
        errorIfNotCreated("headerIcon");
        return (Img)Img.getByJSObject(getAttributeAsJavaScriptObject("headerIcon"));
    }
    

    /**
     * This is an object literal property block specifying the various properties of the headerIcon - the icon that appears at
     * the top left of the window and is by default the Isomorphic logo.  Overrideable defaults are as follows: <ul> <li>width
     * - default to <code>16</code> and specifies the width of the headerIcon. <li>height - default to <code>14</code> and
     * specifies the height of the headerIcon. <li>src - defaults to <code>"[SKIN]/Window/minimize.gif"</code> and specifies
     * the image for the headerIcon. </ul> You can override the the above properties by calling  Class.changeDefaults.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param headerIconDefaults  Default value is ...
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setHeaderIconDefaults(Map headerIconDefaults) {
        setAttribute("headerIconDefaults", headerIconDefaults, true);
    }
    

    /**
     * Label that shows Window title in header. <p> The following {@link com.smartgwt.client.docs.AutoChildUsage passthrough}
     * applies: {@link com.smartgwt.client.widgets.Window#getTitle title} for {@link
     * com.smartgwt.client.widgets.Label#getContents contents}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Label
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Label getHeaderLabel() throws IllegalStateException {
        errorIfNotCreated("headerLabel");
        return (Label)Label.getByJSObject(getAttributeAsJavaScriptObject("headerLabel"));
    }
    
    

    /**
     * If {@link com.smartgwt.client.widgets.Window#getShowHeaderBackground showHeaderBackground} is <code>true</code>, this
     * property provides the URL of the background image for the header.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param headerSrc  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]Window/headerGradient.gif" | null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setHeaderSrc(String headerSrc) {
        setAttribute("headerSrc", headerSrc, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.Window#getShowHeaderBackground showHeaderBackground} is <code>true</code>, this
     * property provides the URL of the background image for the header.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getHeaderSrc()  {
        return getAttributeAsString("headerSrc");
    }
    

    /**
     * Style for the Window header.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param headerStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "WindowHeader"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setHeaderStyle(String headerStyle) {
        setAttribute("headerStyle", headerStyle, true);
    }

    /**
     * Style for the Window header.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getHeaderStyle()  {
        return getAttributeAsString("headerStyle");
    }
    

    /**
     * Highlight color for the Window body (shown when the body is flashed).
     *
     * @param hiliteBodyColor  Default value is "#EEEEEE"
     * @see com.smartgwt.client.widgets.Window#flash
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setHiliteBodyColor(String hiliteBodyColor) {
        setAttribute("hiliteBodyColor", hiliteBodyColor, true);
    }

    /**
     * Highlight color for the Window body (shown when the body is flashed).
     *
     * @return String
     * @see com.smartgwt.client.widgets.Window#flash
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getHiliteBodyColor()  {
        return getAttributeAsString("hiliteBodyColor");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.Window#getShowHeaderBackground showHeaderBackground} is true, this governs the URL
     * of the image to  use in the header's highlighted state when the window is {@link
     * com.smartgwt.client.widgets.Window#flash flashed}
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param hiliteHeaderSrc  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]Window/headerGradient_hilite.gif" | null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setHiliteHeaderSrc(String hiliteHeaderSrc) {
        setAttribute("hiliteHeaderSrc", hiliteHeaderSrc, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.Window#getShowHeaderBackground showHeaderBackground} is true, this governs the URL
     * of the image to  use in the header's highlighted state when the window is {@link
     * com.smartgwt.client.widgets.Window#flash flashed}
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getHiliteHeaderSrc()  {
        return getAttributeAsString("hiliteHeaderSrc");
    }
    

    /**
     * Highlight style for the Window header. Displayed when a window  is {@link com.smartgwt.client.widgets.Window#flash
     * flashed}
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param hiliteHeaderStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "WindowHeader"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setHiliteHeaderStyle(String hiliteHeaderStyle) {
        setAttribute("hiliteHeaderStyle", hiliteHeaderStyle, true);
    }

    /**
     * Highlight style for the Window header. Displayed when a window  is {@link com.smartgwt.client.widgets.Window#flash
     * flashed}
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getHiliteHeaderStyle()  {
        return getAttributeAsString("hiliteHeaderStyle");
    }
    

    /**
     * If true, when shown this Window will intercept and block events to all other existing components on the page. <P> Use
     * {@link com.smartgwt.client.widgets.Window#getShowModalMask showModalMask} to darken all other elements on the screen
     * when a modal dialog is showing. <P> Chained modal windows - that is, modal windows that launch other modal windows - are
     * allowed.  You can accomplish this by simply creating a second modal Window while a modal Window is showing. <P> Note
     * only top-level Windows (Windows without parents) can be modal.
     *
     * @param isModal  Default value is false
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_windows_modality" target="examples">Modality Example</a>
     */
    public void setIsModal(Boolean isModal) {
        setAttribute("isModal", isModal, true);
    }

    /**
     * If true, when shown this Window will intercept and block events to all other existing components on the page. <P> Use
     * {@link com.smartgwt.client.widgets.Window#getShowModalMask showModalMask} to darken all other elements on the screen
     * when a modal dialog is showing. <P> Chained modal windows - that is, modal windows that launch other modal windows - are
     * allowed.  You can accomplish this by simply creating a second modal Window while a modal Window is showing. <P> Note
     * only top-level Windows (Windows without parents) can be modal.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_windows_modality" target="examples">Modality Example</a>
     */
    public Boolean getIsModal()  {
        Boolean result = getAttributeAsBoolean("isModal");
        return result == null ? false : result;
    }
    
    
    

    /**
     * Button that will make this Window fill the browser via {@link com.smartgwt.client.widgets.Window#maximize
     * Window.maximize}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getMaximizeButton() throws IllegalStateException {
        errorIfNotCreated("maximizeButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("maximizeButton"));
    }
    

    /**
     * Is this window maximized. If true at init time, the window will be drawn maximized. To set this property at runtime use
     * {@link com.smartgwt.client.widgets.Window#maximize Window.maximize} or {@link com.smartgwt.client.widgets.Window#restore
     * Window.restore}.
     *
     * @param maximized  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setMaximized(Boolean maximized) {
        setAttribute("maximized", maximized, true);
    }

    /**
     * Is this window maximized. If true at init time, the window will be drawn maximized. To set this property at runtime use
     * {@link com.smartgwt.client.widgets.Window#maximize Window.maximize} or {@link com.smartgwt.client.widgets.Window#restore
     * Window.restore}.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getMaximized()  {
        Boolean result = getAttributeAsBoolean("maximized");
        return result == null ? false : result;
    }
    

    /**
     * Default acceleration function for performing an animated minimize / maximize.  If unset, 
     * <code>this.animateAcceleration</code> will be used by default instead
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param minimizeAcceleration  Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setMinimizeAcceleration(AnimationAcceleration minimizeAcceleration) {
        setAttribute("minimizeAcceleration", minimizeAcceleration == null ? null : minimizeAcceleration.getValue(), true);
    }

    /**
     * Default acceleration function for performing an animated minimize / maximize.  If unset, 
     * <code>this.animateAcceleration</code> will be used by default instead
     *
     * @return AnimationAcceleration
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public AnimationAcceleration getMinimizeAcceleration()  {
        return EnumUtil.getEnum(AnimationAcceleration.values(), getAttribute("minimizeAcceleration"));
    }
    

    /**
     * ImgButton shown in the header that will minimize this Window by calling {@link
     * com.smartgwt.client.widgets.Window#minimize Window.minimize}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getMinimizeButton() throws IllegalStateException {
        errorIfNotCreated("minimizeButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("minimizeButton"));
    }
    

    /**
     * Is this window minimized. If true at init time, the window will be drawn minimized. To set this property at runtime use
     * {@link com.smartgwt.client.widgets.Window#minimize Window.minimize} or {@link com.smartgwt.client.widgets.Window#restore
     * Window.restore}.
     *
     * @param minimized  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setMinimized(Boolean minimized) {
        setAttribute("minimized", minimized, true);
    }

    /**
     * Is this window minimized. If true at init time, the window will be drawn minimized. To set this property at runtime use
     * {@link com.smartgwt.client.widgets.Window#minimize Window.minimize} or {@link com.smartgwt.client.widgets.Window#restore
     * Window.restore}.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getMinimized()  {
        Boolean result = getAttributeAsBoolean("minimized");
        return result == null ? false : result;
    }
    

    /**
     * Height for the window when minimized. If unset the window will shrink to the height of the header, if present, otherwise
     * {@link com.smartgwt.client.widgets.Window#getDefaultMinimizeHeight this.defaultMinimizeHeight}
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param minimizeHeight  Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setMinimizeHeight(Integer minimizeHeight) {
        setAttribute("minimizeHeight", minimizeHeight, true);
    }

    /**
     * Height for the window when minimized. If unset the window will shrink to the height of the header, if present, otherwise
     * {@link com.smartgwt.client.widgets.Window#getDefaultMinimizeHeight this.defaultMinimizeHeight}
     *
     * @return Integer
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Integer getMinimizeHeight()  {
        return getAttributeAsInt("minimizeHeight");
    }
    

    /**
     * If this window is minimizeable, and animateMinimize is true, what should the duration of  the minimize / maximize be (in
     * ms)? If unset defaults to <code>canvas.animationTime</code>.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param minimizeTime  Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_minimize" target="examples">Window Minimize Example</a>
     */
    public void setMinimizeTime(Integer minimizeTime) {
        setAttribute("minimizeTime", minimizeTime, true);
    }

    /**
     * If this window is minimizeable, and animateMinimize is true, what should the duration of  the minimize / maximize be (in
     * ms)? If unset defaults to <code>canvas.animationTime</code>.
     *
     * @return Integer
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_minimize" target="examples">Window Minimize Example</a>
     */
    public Integer getMinimizeTime()  {
        return getAttributeAsInt("minimizeTime");
    }
    

    /**
     * A ScreenSpan instance used to darken the rest of a page when a modal window is active. To use, set {@link
     * com.smartgwt.client.widgets.Window#getShowModalMask showModalMask} to true, add a CSS style  "modalMask" to the active
     * skin (generally with background-color set),  and adjust {@link com.smartgwt.client.widgets.Window#getModalMaskOpacity
     * modalMaskOpacity}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Canvas
     * @throws IllegalStateException if this widget has not yet been rendered.
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Canvas getModalMask() throws IllegalStateException {
        errorIfNotCreated("modalMask");
        return (Canvas)Canvas.getByJSObject(getAttributeAsJavaScriptObject("modalMask"));
    }
    

    /**
     * Controls the opacity of the modal mask displayed behind modal windows.
     *
     * @param modalMaskOpacity  Default value is 50
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.Window#setModalMask
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setModalMaskOpacity(int modalMaskOpacity)  throws IllegalStateException {
        setAttribute("modalMaskOpacity", modalMaskOpacity, false);
    }

    /**
     * Controls the opacity of the modal mask displayed behind modal windows.
     *
     * @return int
     * @see com.smartgwt.client.widgets.Window#getModalMask
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public int getModalMaskOpacity()  {
        return getAttributeAsInt("modalMaskOpacity");
    }
    

    /**
     * Specifies the CSS style for the modal mask.
     *
     * @param modalMaskStyle  Default value is "modalMask"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.Window#setModalMask
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setModalMaskStyle(String modalMaskStyle)  throws IllegalStateException {
        setAttribute("modalMaskStyle", modalMaskStyle, false);
    }

    /**
     * Specifies the CSS style for the modal mask.
     *
     * @return String
     * @see com.smartgwt.client.widgets.Window#getModalMask
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getModalMaskStyle()  {
        return getAttributeAsString("modalMaskStyle");
    }
    

    /**
     * Renders the widget to be partly transparent. A widget's opacity property may be set to any number between 0
     * (transparent) to 100 (opaque). Null means don't specify opacity directly, 100 is fully opaque. Note that heavy use of
     * opacity may have a performance impact on some older browsers. <P> In older versions of Internet Explorer (Pre IE9 /
     * HTML5), opacity is achieved through proprietary filters. If  {@link com.smartgwt.client.widgets.Canvas#neverUseFilters
     * filters have been disabled} within this application developers must set {@link
     * com.smartgwt.client.widgets.Canvas#getUseOpacityFilter useOpacityFilter} to true for specific components on which
     * opacity support is required. <P> Also note that opacity is incompatible  with {@link
     * com.smartgwt.client.widgets.Canvas#getUseBackMask backMasks}, and that this property is enabled by default for Window
     * instances.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param opacity  Default value is null
     */
    public void setOpacity(Integer opacity) {
        setAttribute("opacity", opacity, true);
    }

    /**
     * Renders the widget to be partly transparent. A widget's opacity property may be set to any number between 0
     * (transparent) to 100 (opaque). Null means don't specify opacity directly, 100 is fully opaque. Note that heavy use of
     * opacity may have a performance impact on some older browsers. <P> In older versions of Internet Explorer (Pre IE9 /
     * HTML5), opacity is achieved through proprietary filters. If  {@link com.smartgwt.client.widgets.Canvas#neverUseFilters
     * filters have been disabled} within this application developers must set {@link
     * com.smartgwt.client.widgets.Canvas#getUseOpacityFilter useOpacityFilter} to true for specific components on which
     * opacity support is required. <P> Also note that opacity is incompatible  with {@link
     * com.smartgwt.client.widgets.Canvas#getUseBackMask backMasks}, and that this property is enabled by default for Window
     * instances.
     *
     * @return Integer
     */
    public Integer getOpacity()  {
        return getAttributeAsInt("opacity");
    }
    

    /**
     * Where should the window be placed on the screen? <p> Default is to use {@link com.smartgwt.client.types.PanelPlacement}
     * "fillScreen" if {@link com.smartgwt.client.util.Browser#isHandset isHandset}.  In any non-handset device,
     * left/top/width/height or settings such as {@link com.smartgwt.client.widgets.Window#getAutoCenter autoCenter} apply as
     * usual.
     *
     * @param placement  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setPlacement(PanelPlacement placement)  throws IllegalStateException {
        setAttribute("placement", placement == null ? null : placement.getValue(), false);
    }

    /**
     * Where should the window be placed on the screen? <p> Default is to use {@link com.smartgwt.client.types.PanelPlacement}
     * "fillScreen" if {@link com.smartgwt.client.util.Browser#isHandset isHandset}.  In any non-handset device,
     * left/top/width/height or settings such as {@link com.smartgwt.client.widgets.Window#getAutoCenter autoCenter} apply as
     * usual.
     *
     * @return PanelPlacement
     */
    public PanelPlacement getPlacement()  {
        return EnumUtil.getEnum(PanelPlacement.values(), getAttribute("placement"));
    }
    

    /**
     * Style for the Window body in printed output.
     *
     * @param printBodyStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "printHeader"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setPrintBodyStyle(String printBodyStyle)  throws IllegalStateException {
        setAttribute("printBodyStyle", printBodyStyle, false);
    }

    /**
     * Style for the Window body in printed output.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getPrintBodyStyle()  {
        return getAttributeAsString("printBodyStyle");
    }
    

    /**
     * CSS Style for header in printed output
     *
     * @param printHeaderStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "printHeader"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setPrintHeaderStyle(String printHeaderStyle)  throws IllegalStateException {
        setAttribute("printHeaderStyle", printHeaderStyle, false);
    }

    /**
     * CSS Style for header in printed output
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getPrintHeaderStyle()  {
        return getAttributeAsString("printHeaderStyle");
    }
    

    /**
     * ImgButton-based resizer, shown in the footer.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getResizer() throws IllegalStateException {
        errorIfNotCreated("resizer");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("resizer"));
    }
    

    /**
     * ImgButton that restores the Window via {@link com.smartgwt.client.widgets.Window#restore Window.restore}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getRestoreButton() throws IllegalStateException {
        errorIfNotCreated("restoreButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("restoreButton"));
    }
    

    /**
     * If true, draw the body contents when this Window is drawn.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showBody  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowBody(Boolean showBody) {
        setAttribute("showBody", showBody, true);
    }

    /**
     * If true, draw the body contents when this Window is drawn.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowBody()  {
        Boolean result = getAttributeAsBoolean("showBody");
        return result == null ? true : result;
    }
    

    /**
     * If true, show a close button in the header, which will dismiss this window by  calling {@link
     * com.smartgwt.client.widgets.Window#addCloseClickHandler Window.closeClick}.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Dynamically update {@link com.smartgwt.client.widgets.Window#getShowCloseButton showCloseButton} to show / hide the closeButton
     *
     * @param showCloseButton  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowCloseButton(Boolean showCloseButton) {
        setAttribute("showCloseButton", showCloseButton, true);
    }

    /**
     * If true, show a close button in the header, which will dismiss this window by  calling {@link
     * com.smartgwt.client.widgets.Window#addCloseClickHandler Window.closeClick}.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowCloseButton()  {
        Boolean result = getAttributeAsBoolean("showCloseButton");
        return result == null ? true : result;
    }
    

    /**
     * <code>showEdges</code> dynamically defaults to false when the {@link com.smartgwt.client.widgets.Window#getPlacement
     * placement} setting indicates the Window will be filling a portion of the screen or a panel.
     *
     * @param showEdges  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowEdges(Boolean showEdges)  throws IllegalStateException {
        setAttribute("showEdges", showEdges, false);
    }

    /**
     * <code>showEdges</code> dynamically defaults to false when the {@link com.smartgwt.client.widgets.Window#getPlacement
     * placement} setting indicates the Window will be filling a portion of the screen or a panel.
     *
     * @return Boolean
     */
    public Boolean getShowEdges()  {
        return getAttributeAsBoolean("showEdges");
    }
    

    /**
     * If true, show a footer for this Window, including resizer, statusBar, etc. This setting is commonly overridden for
     * skinning purposes.
     *
     * @param showFooter  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_windows_footer" target="examples">Footer Example</a>
     */
    public void setShowFooter(Boolean showFooter) {
        setAttribute("showFooter", showFooter, true);
    }

    /**
     * If true, show a footer for this Window, including resizer, statusBar, etc. This setting is commonly overridden for
     * skinning purposes.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_windows_footer" target="examples">Footer Example</a>
     */
    public Boolean getShowFooter()  {
        Boolean result = getAttributeAsBoolean("showFooter");
        return result == null ? true : result;
    }
    

    /**
     * If true, show a {@link com.smartgwt.client.widgets.Window#getHeader header} for this Window. 
     *  <P>
     * Note that in certain Smartclient skins {@link com.smartgwt.client.widgets.Window#getShowHeaderBackground
     * showHeaderBackground} may be set to
     *  <code>false</code> and the header's appearance implemented as part of the
     * window's {@link com.smartgwt.client.widgets.Canvas#getShowEdges edge media}. In this case suppressing the header can be
     * achieved
     *  by overriding the edge media as well as setting this property to false. For example, to
     *  create a headerless window with a similar appearance to a {@link com.smartgwt.client.widgets.menu.Menu} in the
     *  <code><i>TreeFrog</i></code> skin, the following attributes could be used:
     *  <pre>
     *       showHeader:false,
     *       edgeImage:"[SKIN]/Menu/m.png",
     *       edgeSize:10, edgeTop:17, edgeBottom:17,
     *       edgeCenterBackgroundColor:"#F7F7F7"
     *  </pre>
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showHeader  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowHeader(Boolean showHeader)  throws IllegalStateException {
        setAttribute("showHeader", showHeader, false);
    }

    /**
     * If true, show a {@link com.smartgwt.client.widgets.Window#getHeader header} for this Window. 
     *  <P>
     * Note that in certain Smartclient skins {@link com.smartgwt.client.widgets.Window#getShowHeaderBackground
     * showHeaderBackground} may be set to
     *  <code>false</code> and the header's appearance implemented as part of the
     * window's {@link com.smartgwt.client.widgets.Canvas#getShowEdges edge media}. In this case suppressing the header can be
     * achieved
     *  by overriding the edge media as well as setting this property to false. For example, to
     *  create a headerless window with a similar appearance to a {@link com.smartgwt.client.widgets.menu.Menu} in the
     *  <code><i>TreeFrog</i></code> skin, the following attributes could be used:
     *  <pre>
     *       showHeader:false,
     *       edgeImage:"[SKIN]/Menu/m.png",
     *       edgeSize:10, edgeTop:17, edgeBottom:17,
     *       edgeCenterBackgroundColor:"#F7F7F7"
     *  </pre>
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowHeader()  {
        Boolean result = getAttributeAsBoolean("showHeader");
        return result == null ? true : result;
    }
    

    /**
     * Should the window header show a background image? Default value is true for all browsers except for Internet
     * Explorer.<br> If set to true the image source is derived from {@link com.smartgwt.client.widgets.Window#getHeaderSrc
     * headerSrc} and  {@link com.smartgwt.client.widgets.Window#getHiliteHeaderSrc hiliteHeaderSrc}, otherwise the background
     * will be styled according to  {@link com.smartgwt.client.widgets.Window#getHeaderStyle headerStyle} / {@link
     * com.smartgwt.client.widgets.Window#getHiliteHeaderStyle hiliteHeaderStyle}.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showHeaderBackground  Default value is varies
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowHeaderBackground(Boolean showHeaderBackground)  throws IllegalStateException {
        setAttribute("showHeaderBackground", showHeaderBackground, false);
    }

    /**
     * Should the window header show a background image? Default value is true for all browsers except for Internet
     * Explorer.<br> If set to true the image source is derived from {@link com.smartgwt.client.widgets.Window#getHeaderSrc
     * headerSrc} and  {@link com.smartgwt.client.widgets.Window#getHiliteHeaderSrc hiliteHeaderSrc}, otherwise the background
     * will be styled according to  {@link com.smartgwt.client.widgets.Window#getHeaderStyle headerStyle} / {@link
     * com.smartgwt.client.widgets.Window#getHiliteHeaderStyle hiliteHeaderStyle}.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowHeaderBackground()  {
        return getAttributeAsBoolean("showHeaderBackground");
    }
    

    /**
     * If true, we show an icon on the left in the header.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Dynamically update {@link com.smartgwt.client.widgets.Window#getShowHeaderIcon showHeaderIcon} to show / hide the headerIcon
     *
     * @param showHeaderIcon  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowHeaderIcon(Boolean showHeaderIcon) {
        setAttribute("showHeaderIcon", showHeaderIcon, true);
    }

    /**
     * If true, we show an icon on the left in the header.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowHeaderIcon()  {
        Boolean result = getAttributeAsBoolean("showHeaderIcon");
        return result == null ? true : result;
    }
    

    /**
     * If true, show a maximize button in the header - clicking it maximizes the Window
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Dynamically update {@link com.smartgwt.client.widgets.Window#getShowMaximizeButton showMaximizeButton} to show / hide the maximizeButton
     *
     * @param showMaximizeButton  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowMaximizeButton(Boolean showMaximizeButton) {
        setAttribute("showMaximizeButton", showMaximizeButton, true);
    }

    /**
     * If true, show a maximize button in the header - clicking it maximizes the Window
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowMaximizeButton()  {
        Boolean result = getAttributeAsBoolean("showMaximizeButton");
        return result == null ? false : result;
    }
    

    /**
     * If true, show a minimize button in the header--clicking it minimizes the Window.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Dynamically update {@link com.smartgwt.client.widgets.Window#getShowMinimizeButton showMinimizeButton} to show / hide the minimizeButton
     *
     * @param showMinimizeButton  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowMinimizeButton(Boolean showMinimizeButton) {
        setAttribute("showMinimizeButton", showMinimizeButton, true);
    }

    /**
     * If true, show a minimize button in the header--clicking it minimizes the Window.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowMinimizeButton()  {
        Boolean result = getAttributeAsBoolean("showMinimizeButton");
        return result == null ? true : result;
    }
    

    /**
     * If true, displays a translucent mask over the rest of the page when a modal window is displayed.
     *
     * @param showModalMask  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.Window#setModalMask
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowModalMask(Boolean showModalMask)  throws IllegalStateException {
        setAttribute("showModalMask", showModalMask, false);
    }

    /**
     * If true, displays a translucent mask over the rest of the page when a modal window is displayed.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.Window#getModalMask
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowModalMask()  {
        return getAttributeAsBoolean("showModalMask");
    }
    

    /**
     * If true, show a button in the lower right corner that allows users to resize the Window. Note that the resizer will only
     * be displayed if the footer is showing for the window ({@link com.smartgwt.client.widgets.Window#getShowFooter
     * showFooter}) and {@link com.smartgwt.client.widgets.Window#getCanDragResize canDragResize} is true.
     *
     * @param showResizer  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowResizer(Boolean showResizer) {
        setAttribute("showResizer", showResizer, true);
    }

    /**
     * If true, show a button in the lower right corner that allows users to resize the Window. Note that the resizer will only
     * be displayed if the footer is showing for the window ({@link com.smartgwt.client.widgets.Window#getShowFooter
     * showFooter}) and {@link com.smartgwt.client.widgets.Window#getCanDragResize canDragResize} is true.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowResizer()  {
        Boolean result = getAttributeAsBoolean("showResizer");
        return result == null ? true : result;
    }
    

    /**
     * <code>showShadow</code> dynamically defaults to false when the {@link com.smartgwt.client.widgets.Window#getPlacement
     * placement} setting indicates the Window will be filling a portion of the screen or a panel.
     *
     * @param showShadow  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowShadow(Boolean showShadow)  throws IllegalStateException {
        setAttribute("showShadow", showShadow, false);
    }

    /**
     * <code>showShadow</code> dynamically defaults to false when the {@link com.smartgwt.client.widgets.Window#getPlacement
     * placement} setting indicates the Window will be filling a portion of the screen or a panel.
     *
     * @return Boolean
     */
    public Boolean getShowShadow()  {
        return getAttributeAsBoolean("showShadow");
    }
    

    /**
     * If true, show a statusBar for this Window, including resizer.
     *
     * @param showStatusBar  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowStatusBar(Boolean showStatusBar) {
        setAttribute("showStatusBar", showStatusBar, true);
    }

    /**
     * If true, show a statusBar for this Window, including resizer.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowStatusBar()  {
        Boolean result = getAttributeAsBoolean("showStatusBar");
        return result == null ? true : result;
    }
    

    /**
     * Show a title (typically just text) on the header for this window.
     *
     * @param showTitle  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowTitle(Boolean showTitle) {
        setAttribute("showTitle", showTitle, true);
    }

    /**
     * Show a title (typically just text) on the header for this window.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowTitle()  {
        Boolean result = getAttributeAsBoolean("showTitle");
        return result == null ? true : result;
    }
    

    /**
     * A URL to load as content for the Window's body.  If specified, this attribute will take precedence over the items
     * attribute. <P> Note that setting window.src is essentially a shortcut for setting {@link
     * com.smartgwt.client.widgets.Window#getItems items} to a single HTMLflow with a specified {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL}.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the URL of the contents to display in the body of the window, redrawing if necessary.
     *
     * @param src URL of new contents to be displayed in the window body. Default value is null
     * @see com.smartgwt.client.widgets.Window#setContentsType
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setSrc(String src) {
        setAttribute("src", src, true);
    }

    /**
     * A URL to load as content for the Window's body.  If specified, this attribute will take precedence over the items
     * attribute. <P> Note that setting window.src is essentially a shortcut for setting {@link
     * com.smartgwt.client.widgets.Window#getItems items} to a single HTMLflow with a specified {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL}.
     *
     * @return String
     * @see com.smartgwt.client.widgets.Window#getContentsType
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }
    

    /**
     * Text to show in the status bar of the window (if one is visible)
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the text in the status bar of the window, redrawing if necessary.
     *
     * @param status new text for the status bar. Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setStatus(String status) {
        setAttribute("status", status, true);
    }

    /**
     * Text to show in the status bar of the window (if one is visible)
     *
     * @return String
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getStatus()  {
        return getAttributeAsString("status");
    }
    

    /**
     * Simple Canvas-based status bar, shown in the footer.  {@link com.smartgwt.client.widgets.Window#setStatus
     * Window.setStatus} can be used to show text here.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Canvas
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Canvas getStatusBar() throws IllegalStateException {
        errorIfNotCreated("statusBar");
        return (Canvas)Canvas.getByJSObject(getAttributeAsJavaScriptObject("statusBar"));
    }
    

    /**
     * title for this Window, shown in the header (if drawn)
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.Window#getTitle title} that appears in the window {@link com.smartgwt.client.widgets.Window#getHeader header}. The header will be redrawn if necessary.
     *
     * @param title new title. See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Untitled Window"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setTitle(String title) {
        setAttribute("title", title, true);
    }

    /**
     * title for this Window, shown in the header (if drawn)
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getTitle()  {
        return getAttributeAsString("title");
    }
    

    /**
     * By default Windows show a {@link com.smartgwt.client.widgets.Canvas#getUseBackMask backMask} in Internet Explorer
     * versions predating Internet Explorer 9. This is a workaround for a native browser issue whereby certain DOM elements
     * such as <code>IFRAME</code>s (whether rendered within Smart GWT components via features such as {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL} or  explicitly written into the HTML of the page) will
     * not be properly occluded by DOM elements which overlap them but have a higher z-index. <P> A side-effect of this is that
     * the {@link com.smartgwt.client.widgets.Canvas#getOpacity opacity} can not be modified for the entire window. Developers
     * may disable the backmask in order to support opacity in IE versions less than 9 by setting this property to false,
     * however you should be aware that in doing this there is a potential for the "burn through" problem described above.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param useBackMask  Default value is varies
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setUseBackMask(Boolean useBackMask)  throws IllegalStateException {
        setAttribute("useBackMask", useBackMask, false);
    }

    /**
     * By default Windows show a {@link com.smartgwt.client.widgets.Canvas#getUseBackMask backMask} in Internet Explorer
     * versions predating Internet Explorer 9. This is a workaround for a native browser issue whereby certain DOM elements
     * such as <code>IFRAME</code>s (whether rendered within Smart GWT components via features such as {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL} or  explicitly written into the HTML of the page) will
     * not be properly occluded by DOM elements which overlap them but have a higher z-index. <P> A side-effect of this is that
     * the {@link com.smartgwt.client.widgets.Canvas#getOpacity opacity} can not be modified for the entire window. Developers
     * may disable the backmask in order to support opacity in IE versions less than 9 by setting this property to false,
     * however you should be aware that in doing this there is a potential for the "burn through" problem described above.
     *
     * @return Boolean
     */
    public Boolean getUseBackMask()  {
        return getAttributeAsBoolean("useBackMask");
    }
    

    // ********************* Methods ***********************


	/**
     * Same as {@link com.smartgwt.client.widgets.layout.Layout#addMember Layout.addMember}.  Note that in order to add items
     * to {@link com.smartgwt.client.widgets.Window#getBody body}, you use {@link com.smartgwt.client.widgets.Window#addItem
     * Window.addItem} rather than <code>addMember</code>.  Adding a member to  a Window adds the member as a sibling to the
     * header, body and other built-in Window subcomponents.
     * @param newMember the canvas object to be added to the layout
     * @see com.smartgwt.client.widgets.Window#addMembers
     */
    public native void addMember(Canvas newMember) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addMember(newMember.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
    }-*/;


	/**
     * Same as {@link com.smartgwt.client.widgets.layout.Layout#addMember Layout.addMember}.  Note that in order to add items
     * to {@link com.smartgwt.client.widgets.Window#getBody body}, you use {@link com.smartgwt.client.widgets.Window#addItem
     * Window.addItem} rather than <code>addMember</code>.  Adding a member to  a Window adds the member as a sibling to the
     * header, body and other built-in Window subcomponents.
     * @param newMember the canvas object to be added to the layout
     * @param position the position in the layout to place newMember (starts with 0);                            if omitted, it will be added
     * at the last position
     * @see com.smartgwt.client.widgets.Window#addMembers
     */
    public native void addMember(Canvas newMember, Integer position) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addMember(newMember.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), position == null ? null : position.@java.lang.Integer::intValue()());
    }-*/;
	
	/**
     * Centers the Window in the page. This is called automatically in window.show() if Window.autoCenter is true. Note - if
     * the Window is a child of another widget, we center in the parent widget rather than centering in the page.
     * @see com.smartgwt.client.widgets.Window#getAutoCenter
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public native void centerInPage() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.centerInPage();
    }-*/;

	/**
     * Close this window.  This method is fired by the default {@link com.smartgwt.client.widgets.Window#addCloseClickHandler
     * Window.closeClick} implementation. Default implementation will hide the window.
     */
    public native void close() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.close();
    }-*/;

    /**
     * Add a closeClick handler.
     * <p>
     * Handles a click on the close button of this window. The default implementation calls {@link
     * com.smartgwt.client.widgets.Window#close close()} and returns false to prevent bubbling of the click event. <P> 
     * Developers may use <code>addCloseClickHandler()</code> to provide custom handling when the user clicks this button.
     * Custom implementations may call <code>close()</code> to trigger the default behavior.
     *
     * @param handler the closeClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addCloseClickHandler(com.smartgwt.client.widgets.events.CloseClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.CloseClickEvent.getType()) == 0) setupCloseClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.CloseClickEvent.getType());
    }

    private native void setupCloseClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var closeClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.events.CloseClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({closeClick: 
                function () {
                    var param = {};
                    return closeClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.closeClick = 
                function () {
                    var param = {};
                    return closeClick(param) == true;
                }
            ;
        }
   }-*/;
	/**
     * Makes the window header flash if it's visible; if there's no header, or the header          is hidden, makes the window
     * body flash instead.          <p>   This method is executed when users click outside the bounds of a modal window   so
     * they'll notice that they have to do something with the window.
     */
    public native void flash() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.flash();
    }-*/;

	/**
     * Maximize the window. Fired when the user clicks the maximize button if  {@link
     * com.smartgwt.client.widgets.Window#getShowMaximizeButton this.showMaximizeButton} is true.<br> Default implementation
     * moves the window to <code>0, 0</code> and resizes the window to  <code>"100%"</code> on both axes, so it will fill the
     * browser window (or the parent of the Window instance, if appropriate).<br> If {@link
     * com.smartgwt.client.widgets.Window#getAnimateMinimize animateMinimize} is true, the maximize will be animated. A restore
     * button will be displayed in place of the maximize button when the window is  maximized.
     */
    public native void maximize() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.maximize();
    }-*/;

	/**
     * Minimize the window. Fired when the user clicks the minimize button if  {@link
     * com.smartgwt.client.widgets.Window#getShowMinimizeButton this.showMinimizeButton} is true.<br> Default implementation
     * shrinks the window to just the height of the header bar, hiding the body. If {@link
     * com.smartgwt.client.widgets.Window#getAnimateMinimize animateMinimize} is true, the resize will be animated. A restore
     * button will be displayed in place of the minimize button when the window is  minimized.
     */
    public native void minimize() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.minimize();
    }-*/;

    /**
     * Add a maximizeClick handler.
     * <p>
     * Notification method fired when the user clicks the 'maximize' button.
     *
     * @param handler the maximizeClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMaximizeClickHandler(com.smartgwt.client.widgets.events.MaximizeClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.MaximizeClickEvent.getType()) == 0) setupMaximizeClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.MaximizeClickEvent.getType());
    }

    private native void setupMaximizeClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onMaximizeClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.events.MaximizeClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({onMaximizeClick: 
                function () {
                    var param = {};
                    return onMaximizeClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.onMaximizeClick = 
                function () {
                    var param = {};
                    return onMaximizeClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a minimizeClick handler.
     * <p>
     * Notification method fired when the user clicks the 'minimize' button.
     *
     * @param handler the minimizeClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMinimizeClickHandler(com.smartgwt.client.widgets.events.MinimizeClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.MinimizeClickEvent.getType()) == 0) setupMinimizeClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.MinimizeClickEvent.getType());
    }

    private native void setupMinimizeClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onMinimizeClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.events.MinimizeClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({onMinimizeClick: 
                function () {
                    var param = {};
                    return onMinimizeClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.onMinimizeClick = 
                function () {
                    var param = {};
                    return onMinimizeClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a restoreClick handler.
     * <p>
     * Notification method fired when the user clicks the 'restore' button.
     *
     * @param handler the restoreClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addRestoreClickHandler(com.smartgwt.client.widgets.events.RestoreClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.RestoreClickEvent.getType()) == 0) setupRestoreClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.RestoreClickEvent.getType());
    }

    private native void setupRestoreClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onRestoreClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.events.RestoreClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({onRestoreClick: 
                function () {
                    var param = {};
                    return onRestoreClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.onRestoreClick = 
                function () {
                    var param = {};
                    return onRestoreClick(param) == true;
                }
            ;
        }
   }-*/;
	/**
     * Restores the window to its specified height and width after a call to {@link com.smartgwt.client.widgets.Window#minimize
     * Window.minimize} or  {@link com.smartgwt.client.widgets.Window#maximize Window.maximize}. Called from a click on the
     * restore button shown in place of the  minimize or maximize button when the window is minimized or maximized.<br>
     * Resizing will occur as an animation if {@link com.smartgwt.client.widgets.Window#getAnimateMinimize animateMinimize} is
     * true.
     */
    public native void restore() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.restore();
    }-*/;

	/**
     * Should this window be dismissed (same effect as pressing the "Cancel" button) when the  user presses the "Escape"
     * key?<br> Default behavior: if {@link com.smartgwt.client.widgets.Window#getDismissOnEscape dismissOnEscape} is set, just
     * return it. Otherwise return true if this window is showing a "close" control in the header  (see {@link
     * com.smartgwt.client.widgets.Window#getHeaderControls headerControls}).
     *
     * @return true if the window should be dismissed when the user hits escape
     */
    public native Boolean shouldDismissOnEscape() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.shouldDismissOnEscape();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(ret);
    }-*/;


    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties set on the SmartGWT class instance passed to this function before its
     * underlying SmartClient JS object was created.
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
     * @param windowProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(Window windowProperties) /*-{
    	var properties = $wnd.isc.addProperties({},windowProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.Window.addProperties(properties);
    }-*/;

    // ***********************************************************


    /**
     * Adds a widget to the window.
     *
     * @param widget the widget to be added
     */
    public void addItem(Widget widget) {
        if (widget instanceof Canvas) {
            addItem((Canvas) widget);
        } else {
            addItem(new WidgetCanvas(widget));
        }
    }

    /**
     * Adds a widget to the window.
     *
     * @param component the widget to be added
     */
    public void addItem(Canvas component) {
        JavaScriptObject componentJS = component.getOrCreateJsObj();
        if (isCreated()) {
            addItemPostCreate(componentJS);

        } else {
            addItemPreCreate(componentJS);
        }
    }

    private native void addItemPreCreate(JavaScriptObject componentJS) /*-{
		var config = this.@com.smartgwt.client.widgets.BaseWidget::config;

        if(!config.items) {
            config.items = @com.smartgwt.client.util.JSOHelper::createJavaScriptArray()();
        }
        config.items.push(componentJS);
    }-*/;

    private native void addItemPostCreate(JavaScriptObject componentJS) /*-{
        var container = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        container.addItem(componentJS);
    }-*/;

    /**
     * Removes a widget from the window.
     *
     * @param component the widget to be removed
     */
    public native void removeItem(Canvas component) /*-{
        var container = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var componentJS = component.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        container.removeItem(componentJS);
    }-*/;

    /**
     * If Window.canDragReposition or Window.canDragResize is true, should the windows size and position be constrained
     * such that it remains within the viewport of its parent element (or for top level windows, within the viewport of
     * the browser window)?
     * <p/>
     * <br> Note: keepInParentRect affects only user drag interactions, not programmatic moves.
     *
     * @param keepInParentRect true to keepInParentRect
     */
    public void setKeepInParentRect(Boolean keepInParentRect) {
        setAttribute("keepInParentRect", keepInParentRect, true);
    }

    public void setHeaderIconProperties(Map headerIconProperties) {
        setAttribute("headerIconProperties", headerIconProperties, true);
        setShowHeaderIcon(true);
    }

    /**
     * Sets the Window header icon.
     *
     * @param imgSrc the icon image source
     */
    public void setHeaderIcon(String imgSrc) {
        Map map = new HashMap();
        map.put("src", imgSrc);
        setHeaderIconProperties(map);
    }

    /**
     * Sets the Window header icon.
     *
     * @param imgSrc the icon image source
     * @param width  the icon width. default 16
     * @param height the icon height. default 14
     */
    public void setHeaderIcon(String imgSrc, int width, int height) {
        Map map = new HashMap();
        map.put("src", imgSrc);
        map.put("width", width);
        map.put("height", height);
        setHeaderIconProperties(map);
    }

    /**
     * Array of members to show in the Window header. <pb> The default value of headerControls is an Array of {@link
     * com.smartgwt.client.types.HeaderControls} listing the standard header controls in their default order: <br>
     * headerControls : [HeaderControls.HEADER_ICON, HeaderControls.HEADER_LABEL, HeaderControls.MINIMIZE_BUTTON,
     * HeaderControls.MAXIMIZE_BUTTON, HeaderControls.CLOSE_BUTTON] <br>
     * <p/>
     * You can set headerControls to change the order of standard controls in the header. You can also omit standard
     * controls this way, although it more efficient to use the related "show" property if available (eg
     * Window.showMinimizeButton). <br> By embedding a Canvas directly in this list you can add arbitrary additional
     * controls to the header, for example, an additional button (eg return to dock) or a DynamicForm with various kinds
     * of input controls. Tip: custom controls need to set layoutAlign:"center" to appear vertically centered.
     *
     * @param headerControls an array containing either HeaderControl enums values or Canvas instances
     * @see com.smartgwt.client.types.HeaderControls
     */
    public void setHeaderControls(Object... headerControls) {
        setAttribute("headerControls", headerControls, false);
    }
    /**
     * Array of members to show in the Window footer. <pb> The default value of headerControls is an Array of {@link
     * com.smartgwt.client.types.FooterControls} listing the standard footer controls in their default order: <br>
     * headerControls : [HeaderControls.SPACER, HeaderControls.RESIZER] <br>
     * <p/>
     * You can set footerControls to change the order of standard controls in the footer. You can also omit standard
     * controls this way, although it more efficient to use the related "show" property if available (eg
     * Window.showResizer). <br> By embedding a Canvas directly in this list you can add arbitrary additional
     * controls to the footer.<br> Note that the statusBar is not part of the set of footer controls - it is a
     * separate canvas rendered behind all footer controls. If you include some custom status bar
     * directly in the footerControls you may want to set +link{window.showFooter} to false.
     * Tip: custom controls need to set layoutAlign:"center" to appear vertically centered.
     *
     * @param footerControls an array containing either FooterControl enums values or Canvas instances
     * @see com.smartgwt.client.types.FooterControls
     */
    public void setFooterControls(Object... footerControls) {
        setAttribute("footerControls", footerControls, false);
    }

    /**
     * If Window.canDragReposition or Window.canDragRShowcaseDataesize is true, should the windows size and position be
     * constrained such that it remains within the viewport of its parent element (or for top level windows, within the
     * viewport of the browser window)? Can also be set to an array denoting an arbitrary Rectangle beyond which the
     * window cannot be moved. <br> Note: keepInParentRect affects only user drag interactions, not programmatic moves.
     *
     * @param rectangle the rectangle bounds
     */
    public void setKeepInParentRect(Rectangle rectangle) {
        setAttribute("keepInParentRect", rectangle.getAsJSArray(), true);
    }

    /**
     * The contents of the Window body. Can be specified three different ways: <ul>
     * <li>an Array of Canvases that will become the children of the Window's body when it is initialized; the canvases in this array should be created, but not drawn (autodraw: false).</li>
     * <li>a single canvas that will become a child of the Window body.</li>
     * <li>a string that will be set as the body's contents.</li>
     * </ul>
     *
     * @return items
     */
    public Canvas[] getItems() {
        return com.smartgwt.client.util.ConvertTo.arrayOfCanvas(getAttributeAsJavaScriptObject("items"));
    }

    /**
     * Preload primary window skin images
     */
    public static native void preloadImages() /*-{
        var skinImgDir = $wnd.isc.Window.getInstanceProperty('skinImgDir');
        var canvasSkinImgDir = $wnd.isc.Canvas.getInstanceProperty('skinImgDir');
        if($wnd.isc.Window.getInstanceProperty('showEdges')) {
            var edgeEdgeImage = $wnd.isc.Window.getInstanceProperty('edgeImage');
            @com.smartgwt.client.util.FileLoader::cacheEdgeImages(Ljava/lang/String;Ljava/lang/String;)(skinImgDir,edgeEdgeImage)
        }
        if($wnd.isc.Window.getInstanceProperty('headerIconDefaults').src) {
            @com.smartgwt.client.util.FileLoader::cacheImg(Ljava/lang/String;Ljava/lang/String;)(canvasSkinImgDir, $wnd.isc.Window.getInstanceProperty('headerIconDefaults').src);
        }
        if($wnd.isc.Window.getInstanceProperty('restoreButtonDefaults').src) {
            @com.smartgwt.client.util.FileLoader::cacheImg(Ljava/lang/String;Ljava/lang/String;)(canvasSkinImgDir,$wnd.isc.Window.getInstanceProperty('restoreButtonDefaults').src);
        }
        if($wnd.isc.Window.getInstanceProperty('closeButtonDefaults').src) {
            @com.smartgwt.client.util.FileLoader::cacheImg(Ljava/lang/String;Ljava/lang/String;)(canvasSkinImgDir,$wnd.isc.Window.getInstanceProperty('closeButtonDefaults').src);
        }
        if($wnd.isc.Window.getInstanceProperty('maximizeButtonDefaults').src) {
            @com.smartgwt.client.util.FileLoader::cacheImg(Ljava/lang/String;Ljava/lang/String;)(canvasSkinImgDir,$wnd.isc.Window.getInstanceProperty('maximizeButtonDefaults').src);
        }
        if($wnd.isc.Window.getInstanceProperty('minimizeButtonDefaults').src) {
            @com.smartgwt.client.util.FileLoader::cacheImg(Ljava/lang/String;Ljava/lang/String;)(canvasSkinImgDir,$wnd.isc.Window.getInstanceProperty('minimizeButtonDefaults').src);
        }
    }-*/;

    public LogicalStructureObject setLogicalStructure(WindowLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.animateMinimize = getAttributeAsString("animateMinimize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.animateMinimize:" + t.getMessage() + "\n";
        }
        try {
            s.autoCenter = getAttributeAsString("autoCenter");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.autoCenter:" + t.getMessage() + "\n";
        }
        try {
            s.autoSize = getAttributeAsString("autoSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.autoSize:" + t.getMessage() + "\n";
        }
        try {
            s.bodyColor = getAttributeAsString("bodyColor");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.bodyColor:" + t.getMessage() + "\n";
        }
        try {
            s.bodyStyle = getAttributeAsString("bodyStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.bodyStyle:" + t.getMessage() + "\n";
        }
        try {
            s.bringToFrontOnMouseUp = getAttributeAsString("bringToFrontOnMouseUp");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.bringToFrontOnMouseUp:" + t.getMessage() + "\n";
        }
        try {
            s.canDragReposition = getAttributeAsString("canDragReposition");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.canDragReposition:" + t.getMessage() + "\n";
        }
        try {
            s.canDragResize = getAttributeAsString("canDragResize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.canDragResize:" + t.getMessage() + "\n";
        }
        try {
            s.canFocusInHeaderButtons = getAttributeAsString("canFocusInHeaderButtons");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.canFocusInHeaderButtons:" + t.getMessage() + "\n";
        }
        try {
            s.contentLayout = getAttributeAsString("contentLayout");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.contentLayout:" + t.getMessage() + "\n";
        }
        try {
            s.contentsType = getAttributeAsString("contentsType");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.contentsType:" + t.getMessage() + "\n";
        }
        try {
            s.defaultMinimizeHeight = getAttributeAsString("defaultMinimizeHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.defaultMinimizeHeight:" + t.getMessage() + "\n";
        }
        try {
            s.dismissOnEscape = getAttributeAsString("dismissOnEscape");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.dismissOnEscape:" + t.getMessage() + "\n";
        }
        try {
            s.dismissOnOutsideClick = getAttributeAsString("dismissOnOutsideClick");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.dismissOnOutsideClick:" + t.getMessage() + "\n";
        }
        try {
            s.editProxyConstructor = getAttributeAsString("editProxyConstructor");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.editProxyConstructor:" + t.getMessage() + "\n";
        }
        try {
            s.fillSpaceStyleName = getAttributeAsString("fillSpaceStyleName");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.fillSpaceStyleName:" + t.getMessage() + "\n";
        }
        try {
            s.footerControls = getAttributeAsStringArray("footerControls");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.footerControlsArray:" + t.getMessage() + "\n";
        }
        try {
            s.footerHeight = getAttributeAsString("footerHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.footerHeight:" + t.getMessage() + "\n";
        }
        try {
            s.headerControls = getAttributeAsStringArray("headerControls");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.headerControlsArray:" + t.getMessage() + "\n";
        }
        try {
            s.headerSrc = getAttributeAsString("headerSrc");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.headerSrc:" + t.getMessage() + "\n";
        }
        try {
            s.headerStyle = getAttributeAsString("headerStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.headerStyle:" + t.getMessage() + "\n";
        }
        try {
            s.hiliteBodyColor = getAttributeAsString("hiliteBodyColor");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.hiliteBodyColor:" + t.getMessage() + "\n";
        }
        try {
            s.hiliteHeaderSrc = getAttributeAsString("hiliteHeaderSrc");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.hiliteHeaderSrc:" + t.getMessage() + "\n";
        }
        try {
            s.hiliteHeaderStyle = getAttributeAsString("hiliteHeaderStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.hiliteHeaderStyle:" + t.getMessage() + "\n";
        }
        try {
            s.isModal = getAttributeAsString("isModal");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.isModal:" + t.getMessage() + "\n";
        }
        try {
            s.keepInParentRectAsString = getAttributeAsString("keepInParentRect");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.keepInParentRectAsString:" + t.getMessage() + "\n";
        }
        try {
            s.maximized = getAttributeAsString("maximized");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.maximized:" + t.getMessage() + "\n";
        }
        try {
            s.minimizeAcceleration = getAttributeAsString("minimizeAcceleration");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.minimizeAcceleration:" + t.getMessage() + "\n";
        }
        try {
            s.minimized = getAttributeAsString("minimized");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.minimized:" + t.getMessage() + "\n";
        }
        try {
            s.minimizeHeight = getAttributeAsString("minimizeHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.minimizeHeight:" + t.getMessage() + "\n";
        }
        try {
            s.minimizeTime = getAttributeAsString("minimizeTime");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.minimizeTime:" + t.getMessage() + "\n";
        }
        try {
            s.modalMaskOpacity = getAttributeAsString("modalMaskOpacity");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.modalMaskOpacity:" + t.getMessage() + "\n";
        }
        try {
            s.modalMaskStyle = getAttributeAsString("modalMaskStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.modalMaskStyle:" + t.getMessage() + "\n";
        }
        try {
            s.opacity = getAttributeAsString("opacity");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.opacity:" + t.getMessage() + "\n";
        }
        try {
            s.placement = getAttributeAsString("placement");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.placement:" + t.getMessage() + "\n";
        }
        try {
            s.printBodyStyle = getAttributeAsString("printBodyStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.printBodyStyle:" + t.getMessage() + "\n";
        }
        try {
            s.printHeaderStyle = getAttributeAsString("printHeaderStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.printHeaderStyle:" + t.getMessage() + "\n";
        }
        try {
            s.showBody = getAttributeAsString("showBody");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showBody:" + t.getMessage() + "\n";
        }
        try {
            s.showCloseButton = getAttributeAsString("showCloseButton");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showCloseButton:" + t.getMessage() + "\n";
        }
        try {
            s.showEdges = getAttributeAsString("showEdges");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showEdges:" + t.getMessage() + "\n";
        }
        try {
            s.showFooter = getAttributeAsString("showFooter");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showFooter:" + t.getMessage() + "\n";
        }
        try {
            s.showHeader = getAttributeAsString("showHeader");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showHeader:" + t.getMessage() + "\n";
        }
        try {
            s.showHeaderBackground = getAttributeAsString("showHeaderBackground");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showHeaderBackground:" + t.getMessage() + "\n";
        }
        try {
            s.showHeaderIcon = getAttributeAsString("showHeaderIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showHeaderIcon:" + t.getMessage() + "\n";
        }
        try {
            s.showMaximizeButton = getAttributeAsString("showMaximizeButton");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showMaximizeButton:" + t.getMessage() + "\n";
        }
        try {
            s.showMinimizeButton = getAttributeAsString("showMinimizeButton");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showMinimizeButton:" + t.getMessage() + "\n";
        }
        try {
            s.showModalMask = getAttributeAsString("showModalMask");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showModalMask:" + t.getMessage() + "\n";
        }
        try {
            s.showResizer = getAttributeAsString("showResizer");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showResizer:" + t.getMessage() + "\n";
        }
        try {
            s.showShadow = getAttributeAsString("showShadow");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showShadow:" + t.getMessage() + "\n";
        }
        try {
            s.showStatusBar = getAttributeAsString("showStatusBar");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showStatusBar:" + t.getMessage() + "\n";
        }
        try {
            s.showTitle = getAttributeAsString("showTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.showTitle:" + t.getMessage() + "\n";
        }
        try {
            s.src = getAttributeAsString("src");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.src:" + t.getMessage() + "\n";
        }
        try {
            s.status = getAttributeAsString("status");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.status:" + t.getMessage() + "\n";
        }
        try {
            s.title = getAttributeAsString("title");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.title:" + t.getMessage() + "\n";
        }
        try {
            s.useBackMask = getAttributeAsString("useBackMask");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Window.useBackMask:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        WindowLogicalStructure s = new WindowLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}

