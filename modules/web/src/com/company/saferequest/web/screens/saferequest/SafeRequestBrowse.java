package com.company.saferequest.web.screens.saferequest;

import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.saferequest.entity.SafeRequest;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;

@UiController("saferequest_SafeRequest.browse")
@UiDescriptor("safe-request-browse.xml")
@LookupComponent("safeRequestsTable")
@LoadDataBeforeShow
public class SafeRequestBrowse extends StandardLookup<SafeRequest> {
    @Inject
    private CollectionLoader<SafeRequest> safeRequestsDl;
    @Inject
    private UserSession userSession;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        safeRequestsDl.setParameters(ParamsMap.of("userLogin", userSession.getUser().getLogin()));
        safeRequestsDl.load();
    }

}