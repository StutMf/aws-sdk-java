/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the application to update.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * New name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * New description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * List of server groups in the application to update.
     * </p>
     */
    private java.util.List<ServerGroup> serverGroups;
    /**
     * <p>
     * List of tags to associate with the application.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * ID of the application to update.
     * </p>
     * 
     * @param appId
     *        ID of the application to update.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * ID of the application to update.
     * </p>
     * 
     * @return ID of the application to update.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * ID of the application to update.
     * </p>
     * 
     * @param appId
     *        ID of the application to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * New name of the application.
     * </p>
     * 
     * @param name
     *        New name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * New name of the application.
     * </p>
     * 
     * @return New name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * New name of the application.
     * </p>
     * 
     * @param name
     *        New name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * New description of the application.
     * </p>
     * 
     * @param description
     *        New description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * New description of the application.
     * </p>
     * 
     * @return New description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * New description of the application.
     * </p>
     * 
     * @param description
     *        New description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        Name of the service role in the customer's account used by AWS SMS.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @return Name of the service role in the customer's account used by AWS SMS.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * Name of the service role in the customer's account used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        Name of the service role in the customer's account used by AWS SMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * List of server groups in the application to update.
     * </p>
     * 
     * @return List of server groups in the application to update.
     */

    public java.util.List<ServerGroup> getServerGroups() {
        return serverGroups;
    }

    /**
     * <p>
     * List of server groups in the application to update.
     * </p>
     * 
     * @param serverGroups
     *        List of server groups in the application to update.
     */

    public void setServerGroups(java.util.Collection<ServerGroup> serverGroups) {
        if (serverGroups == null) {
            this.serverGroups = null;
            return;
        }

        this.serverGroups = new java.util.ArrayList<ServerGroup>(serverGroups);
    }

    /**
     * <p>
     * List of server groups in the application to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerGroups(java.util.Collection)} or {@link #withServerGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serverGroups
     *        List of server groups in the application to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withServerGroups(ServerGroup... serverGroups) {
        if (this.serverGroups == null) {
            setServerGroups(new java.util.ArrayList<ServerGroup>(serverGroups.length));
        }
        for (ServerGroup ele : serverGroups) {
            this.serverGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of server groups in the application to update.
     * </p>
     * 
     * @param serverGroups
     *        List of server groups in the application to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withServerGroups(java.util.Collection<ServerGroup> serverGroups) {
        setServerGroups(serverGroups);
        return this;
    }

    /**
     * <p>
     * List of tags to associate with the application.
     * </p>
     * 
     * @return List of tags to associate with the application.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * List of tags to associate with the application.
     * </p>
     * 
     * @param tags
     *        List of tags to associate with the application.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * List of tags to associate with the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        List of tags to associate with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of tags to associate with the application.
     * </p>
     * 
     * @param tags
     *        List of tags to associate with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getServerGroups() != null)
            sb.append("ServerGroups: ").append(getServerGroups()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppRequest == false)
            return false;
        UpdateAppRequest other = (UpdateAppRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getServerGroups() == null ^ this.getServerGroups() == null)
            return false;
        if (other.getServerGroups() != null && other.getServerGroups().equals(this.getServerGroups()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getServerGroups() == null) ? 0 : getServerGroups().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppRequest clone() {
        return (UpdateAppRequest) super.clone();
    }

}
