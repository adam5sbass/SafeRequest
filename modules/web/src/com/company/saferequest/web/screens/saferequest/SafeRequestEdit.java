package com.company.saferequest.web.screens.saferequest;

import com.haulmont.cuba.gui.screen.*;
import com.company.saferequest.entity.SafeRequest;

@UiController("saferequest_SafeRequest.edit")
@UiDescriptor("safe-request-edit.xml")
@EditedEntityContainer("safeRequestDc")
@LoadDataBeforeShow
public class SafeRequestEdit extends StandardEditor<SafeRequest> {
}