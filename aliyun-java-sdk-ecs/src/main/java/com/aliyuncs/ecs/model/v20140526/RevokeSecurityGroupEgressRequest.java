/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RevokeSecurityGroupEgressRequest extends RpcAcsRequest<RevokeSecurityGroupEgressResponse> {
	
	public RevokeSecurityGroupEgressRequest() {
		super("Ecs", "2014-05-26", "RevokeSecurityGroupEgress", "ecs");
	}

	private String nicType;

	private Long resourceOwnerId;

	private String sourcePortRange;

	private String clientToken;

	private String securityGroupId;

	private String description;

	private Long callerUid;

	private String policy;

	private String portRange;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String ownerAccount;

	private String sourceCidrIp;

	private String callerBid;

	private String destGroupId;

	private Long ownerId;

	private String destGroupOwnerAccount;

	private String priority;

	private String destCidrIp;

	private Long destGroupOwnerId;

	public String getNicType() {
		return this.nicType;
	}

	public void setNicType(String nicType) {
		this.nicType = nicType;
		if(nicType != null){
			putQueryParameter("NicType", nicType);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSourcePortRange() {
		return this.sourcePortRange;
	}

	public void setSourcePortRange(String sourcePortRange) {
		this.sourcePortRange = sourcePortRange;
		if(sourcePortRange != null){
			putQueryParameter("SourcePortRange", sourcePortRange);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(Long callerUid) {
		this.callerUid = callerUid;
		if(callerUid != null){
			putQueryParameter("callerUid", callerUid.toString());
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public String getPortRange() {
		return this.portRange;
	}

	public void setPortRange(String portRange) {
		this.portRange = portRange;
		if(portRange != null){
			putQueryParameter("PortRange", portRange);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getSourceCidrIp() {
		return this.sourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		this.sourceCidrIp = sourceCidrIp;
		if(sourceCidrIp != null){
			putQueryParameter("SourceCidrIp", sourceCidrIp);
		}
	}

	public String getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(String callerBid) {
		this.callerBid = callerBid;
		if(callerBid != null){
			putQueryParameter("callerBid", callerBid);
		}
	}

	public String getDestGroupId() {
		return this.destGroupId;
	}

	public void setDestGroupId(String destGroupId) {
		this.destGroupId = destGroupId;
		if(destGroupId != null){
			putQueryParameter("DestGroupId", destGroupId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDestGroupOwnerAccount() {
		return this.destGroupOwnerAccount;
	}

	public void setDestGroupOwnerAccount(String destGroupOwnerAccount) {
		this.destGroupOwnerAccount = destGroupOwnerAccount;
		if(destGroupOwnerAccount != null){
			putQueryParameter("DestGroupOwnerAccount", destGroupOwnerAccount);
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public String getDestCidrIp() {
		return this.destCidrIp;
	}

	public void setDestCidrIp(String destCidrIp) {
		this.destCidrIp = destCidrIp;
		if(destCidrIp != null){
			putQueryParameter("DestCidrIp", destCidrIp);
		}
	}

	public Long getDestGroupOwnerId() {
		return this.destGroupOwnerId;
	}

	public void setDestGroupOwnerId(Long destGroupOwnerId) {
		this.destGroupOwnerId = destGroupOwnerId;
		if(destGroupOwnerId != null){
			putQueryParameter("DestGroupOwnerId", destGroupOwnerId.toString());
		}
	}

	@Override
	public Class<RevokeSecurityGroupEgressResponse> getResponseClass() {
		return RevokeSecurityGroupEgressResponse.class;
	}

}
