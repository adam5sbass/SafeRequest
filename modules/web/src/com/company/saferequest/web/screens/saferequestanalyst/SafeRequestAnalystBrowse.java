package com.company.saferequest.web.screens.saferequestanalyst;

import com.haulmont.cuba.gui.screen.*;
import com.company.saferequest.entity.SafeRequest;

@UiController("saferequest_SafeRequestAnalyst.browse")
@UiDescriptor("safe-request-analyst-browse.xml")
@LookupComponent("safeRequestsTable")
@LoadDataBeforeShow
public class SafeRequestAnalystBrowse extends StandardLookup<SafeRequest> {
}