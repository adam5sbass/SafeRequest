package com.company.saferequest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|request,createdBy")
@Table(name = "SAFEREQUEST_SAFE_REQUEST")
@Entity(name = "saferequest_SafeRequest")
public class SafeRequest extends StandardEntity {
    private static final long serialVersionUID = -7279474727887313895L;

    @NotNull
    @Column(name = "REQUEST", nullable = false)
    protected String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}