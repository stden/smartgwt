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
 
package com.smartgwt.client.widgets.grid.events;
import com.google.gwt.event.shared.EventHandler;

public interface FilterEditorSubmitHandler extends EventHandler {
    /**
     * Optional notification  fired when the  user performs a filter by modifying the filter editor criteria. Will be fired on
     * keypress if filterOnKeypress is true otherwise when the user clicks the filter button or on enter keypress
     *
     * @param event the event
     */
    void onFilterEditorSubmit(com.smartgwt.client.widgets.grid.events.FilterEditorSubmitEvent event);
}
