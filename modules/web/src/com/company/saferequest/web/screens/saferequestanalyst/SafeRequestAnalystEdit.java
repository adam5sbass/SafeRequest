package com.company.saferequest.web.screens.saferequestanalyst;

import com.haulmont.cuba.gui.screen.*;
import com.company.saferequest.entity.SafeRequest;

@UiController("saferequest_SafeRequestAnalyst.edit")
@UiDescriptor("safe-request-analyst-edit.xml")
@EditedEntityContainer("safeRequestDc")
@LoadDataBeforeShow
public class SafeRequestAnalystEdit extends StandardEditor<SafeRequest> {
}