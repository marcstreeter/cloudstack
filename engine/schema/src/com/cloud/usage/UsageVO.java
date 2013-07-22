// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.usage;

import org.apache.cloudstack.api.InternalIdentity;
import org.apache.cloudstack.usage.Usage;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cloud_usage")
public class UsageVO implements Usage, InternalIdentity {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id = null;

    @Column(name="zone_id")
    private Long zoneId = null;

    @Column(name="account_id")
	private Long accountId = null;

    @Column(name="domain_id")
    private Long domainId = null;

	@Column(name="description")
    private String description = null;
	
	@Column(name="usage_display")
    private String usageDisplay = null;

	@Column(name="usage_type")
	private int usageType;
	
    @Column(name="raw_usage")
    private Double rawUsage = null;

    @Column(name="vm_instance_id")
    private Long vmInstanceId;

    @Column(name="vm_name")
    private String vmName = null;

    @Column(name="offering_id")
    private Long offeringId = null;

    @Column(name="template_id")
    private Long templateId = null;

    @Column(name="usage_id")
    private Long usageId = null;
    
    @Column(name="type")
    private String type = null;

    @Column(name="size")
    private Long size = null;

    @Column(name="virtual_size")
    private Long virtualSize;

    @Column(name="network_id")
    private Long networkId = null;

    
	@Column(name="start_date")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date startDate = null;
	
    @Column(name="end_date")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date endDate = null;

    public UsageVO() {
	}

	public UsageVO(Long zoneId, Long accountId, Long domainId, String description, String usageDisplay, 
	               int usageType, Double rawUsage, Long vmId, String vmName, Long offeringId, Long templateId, 
	               Long usageId, Long size, Date startDate, Date endDate) {
		this.zoneId = zoneId;
        this.accountId = accountId;
		this.domainId = domainId;
		this.description = description;
		this.usageDisplay = usageDisplay;
		this.usageType = usageType;
        this.rawUsage = rawUsage;
        this.vmInstanceId = vmId;
        this.vmName = vmName;
		this.offeringId = offeringId;
		this.templateId = templateId;
		this.usageId = usageId;
		this.size = size;
		this.startDate = startDate;
		this.endDate = endDate;
	}

    public UsageVO(Long zoneId, Long accountId, Long domainId, String description, String usageDisplay,
            int usageType, Double rawUsage, Long vmId, String vmName, Long offeringId, Long templateId,
            Long usageId, Long size, Long virtualSize, Date startDate, Date endDate) {
        this.zoneId = zoneId;
        this.accountId = accountId;
        this.domainId = domainId;
        this.description = description;
        this.usageDisplay = usageDisplay;
        this.usageType = usageType;
        this.rawUsage = rawUsage;
        this.vmInstanceId = vmId;
        this.vmName = vmName;
        this.offeringId = offeringId;
        this.templateId = templateId;
        this.usageId = usageId;
        this.size = size;
        this.virtualSize = virtualSize;
        this.startDate = startDate;
        this.endDate = endDate;
}

	public UsageVO(Long zoneId, Long accountId, Long domainId, String description, String usageDisplay, 
	        int usageType, Double rawUsage, Long usageId, String type, Long networkId, Date startDate, Date endDate) {
	    this.zoneId = zoneId;
	    this.accountId = accountId;
	    this.domainId = domainId;
	    this.description = description;
	    this.usageDisplay = usageDisplay;
	    this.usageType = usageType;
	    this.rawUsage = rawUsage;
	    this.usageId = usageId;
	    this.type = type;
	    this.networkId = networkId;
	    this.startDate = startDate;
	    this.endDate = endDate;
	}

	public UsageVO(Long zoneId, Long accountId, Long domainId, String description, String usageDisplay, 
	        int usageType, Double rawUsage, Long vmId, String vmName, Long offeringId, Long templateId, 
	        Long usageId, Date startDate, Date endDate, String type) {
	    this.zoneId = zoneId;
	    this.accountId = accountId;
	    this.domainId = domainId;
	    this.description = description;
	    this.usageDisplay = usageDisplay;
	    this.usageType = usageType;
	    this.rawUsage = rawUsage;
	    this.vmInstanceId = vmId;
	    this.vmName = vmName;
	    this.offeringId = offeringId;
	    this.templateId = templateId;
	    this.usageId = usageId;
	    this.type = type;
	    this.startDate = startDate;
	    this.endDate = endDate;
	}

	//IPAddress Usage
	public UsageVO(Long zoneId, Long accountId, Long domainId, String description, String usageDisplay, 
	        int usageType, Double rawUsage, Long usageId, long size, String type, Date startDate, Date endDate) {
	    this.zoneId = zoneId;
	    this.accountId = accountId;
	    this.domainId = domainId;
	    this.description = description;
	    this.usageDisplay = usageDisplay;
	    this.usageType = usageType;
	    this.rawUsage = rawUsage;
	    this.usageId = usageId;
	    this.size = size;
	    this.type = type;
	    this.startDate = startDate;
	    this.endDate = endDate;
	}
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public Long getZoneId() {
	    return zoneId;
	}

	@Override
	public Long getAccountId() {
		return accountId;
	}

	@Override
    public Long getDomainId() {
        return domainId;
    }

	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public String getUsageDisplay() {
		return usageDisplay;
	}

	@Override
	public int getUsageType() {
	    return usageType;
	}

	@Override
    public Double getRawUsage() {
        return rawUsage;
    }

	@Override
    public Long getVmInstanceId() {
        return vmInstanceId;
    }

	@Override
    public String getVmName() {
        return vmName;
    }

	@Override
    public Long getOfferingId() {
        return offeringId;
    }

	@Override
    public Long getTemplateId() {
        return templateId;
    }

	@Override
    public Long getUsageId() {
        return usageId;
    }
    
	@Override
    public String getType() {
        return type;
    }
    
	@Override
    public Long getNetworkId() {
        return networkId;
    }

	@Override
    public Long getSize() {
        return size;
    }

    public Long getVirtualSize() {
        return virtualSize;
    }

	@Override
	public Date getStartDate() {
		return startDate;
	}

	@Override
	public Date getEndDate() {
        return endDate;
    }
}
