/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.fabric8.docker.api.model.HostConfig;
import io.fabric8.docker.api.model.Protocol;
import io.fabric8.docker.api.model.serialize.ExposedPortSerializer;
import io.fabric8.docker.api.model.serialize.MapAsListSerializer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
public class ContainerCreateRequest extends io.fabric8.docker.api.model.ContainerCreateRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1865790464463885807L;
	
	 @JsonIgnore
	    private String name;

	    @JsonProperty("Hostname")
	    private String hostname;

	    @JsonProperty("Domainname")
	    private String domainname;

	    @JsonProperty("User")
	    private String user;

	    @JsonProperty("Memory")
	    private String memory;

	    @JsonProperty("MemorySwap")
	    private String memorySwap;

	    @JsonProperty("MemoryReservation")
	    private String memoryReservation;

	    @JsonProperty("KernelMemory")
	    private String kernelMemory;

	    @JsonProperty("CpuShares")
	    private String cpuShares;

	    @JsonProperty("CpuPeriod")
	    private String cpuPeriod;

	    @JsonProperty("CpuQuota")
	    private String cpuQuota;

	    @JsonProperty("Cpuset")
	    private String cpuset;

	    @JsonProperty("CpusetCpus")
	    private String cpusetCpus;

	    @JsonProperty("CpusetMems")
	    private String cpusetMems;

	    @JsonProperty("BlkioWeight")
	    private Integer blkioWeight;

	    @JsonProperty("MemorySwappiness")
	    private Integer memorySwappiness;

	    @JsonProperty("OomKillDisable")
	    private Boolean oomKillDisable;

	    @JsonProperty("AttachStdin")
	    private Boolean attachStdin;

	    @JsonProperty("AttachStdout")
	    private Boolean attachStdout;

	    @JsonProperty("AttachStderr")
	    private Boolean attachStderr;

	    @JsonProperty("Tty")
	    private Boolean tty;

	    @JsonProperty("OpenStdin")
	    private Boolean openStdin;

	    @JsonProperty("StdinOnce")
	    private Boolean stdinOnce;

	    @JsonProperty("Env")
	    @JsonSerialize(using = MapAsListSerializer.class)
	    private Map<String, String> env;

	    @JsonProperty("Cmd")
	    private List<String> cmd;

	    @JsonProperty("Entrypoint")
	    private String entrypoint;

	    @JsonProperty("Image")
	    private String image;

	    @JsonProperty("Labels")
	    private Map<String, String> labels;

	    @JsonProperty("Volumes")
	    private Map<String, Object> volumes;

	    @JsonProperty("WorkingDir")
	    private String workingDir;

	    @JsonProperty("NetworkDisabled")
	    private Boolean networkDisabled;

	    @JsonProperty("MacAddress")
	    private String macAddress;

	    @JsonProperty("ExposedPorts")
	    @JsonSerialize(using = ExposedPortSerializer.class)
	    private Map<Integer, Protocol> exposedPorts;

	    @JsonProperty("StopSignal")
	    private String stopSignal;

	    @JsonProperty("HostConfig")
	    private HostConfig hostConfig;

	    @JsonIgnore
	    private String ipv4Address;

	    @JsonIgnore
	    private String ipv6Address;
	    
    public ContainerCreateRequest () {
	   super(null, null, null, null, null, null, null, null, null, null,
			   null, null, null, null, null, null, null, null,
			   null, null, null, null, null, null, null, null, null, null, null, null,
			   null, null, null, null, null, null, null);	
    }
	
	public ContainerCreateRequest(String name, String cpuset, String hostname, String domainname, String user,
			String memory, String memorySwap, String memoryReservation, String kernelMemory, String cpuShares,
			String cpuPeriod, String cpuQuota, String cpusetCpus, String cpusetMems, Integer blkioWeight,
			Integer memorySwappiness, Boolean oomKillDisable, Boolean attachStdin, Boolean attachStdout,
			Boolean attachStderr, Boolean tty, Boolean openStdin, Boolean stdinOnce, Map<String, String> env,
			List<String> cmd, String entrypoint, String image, Map<String, String> labels, Map<String, Object> volumes,
			String workingDir, Boolean networkDisabled, String macAddress, Map<Integer, Protocol> exposedPorts,
			String stopSignal, HostConfig hostConfig, String ipv4Address, String ipv6Address) {
		super(name, cpuset, hostname, domainname, user, memory, memorySwap, memoryReservation, kernelMemory, cpuShares,
				cpuPeriod, cpuQuota, cpusetCpus, cpusetMems, blkioWeight, memorySwappiness, oomKillDisable, attachStdin,
				attachStdout, attachStderr, tty, openStdin, stdinOnce, env, cmd, entrypoint, image, labels, volumes, workingDir,
				networkDisabled, macAddress, exposedPorts, stopSignal, hostConfig, ipv4Address, ipv6Address);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getDomainname() {
		return domainname;
	}

	public void setDomainname(String domainname) {
		this.domainname = domainname;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getMemorySwap() {
		return memorySwap;
	}

	public void setMemorySwap(String memorySwap) {
		this.memorySwap = memorySwap;
	}

	public String getMemoryReservation() {
		return memoryReservation;
	}

	public void setMemoryReservation(String memoryReservation) {
		this.memoryReservation = memoryReservation;
	}

	public String getKernelMemory() {
		return kernelMemory;
	}

	public void setKernelMemory(String kernelMemory) {
		this.kernelMemory = kernelMemory;
	}

	public String getCpuShares() {
		return cpuShares;
	}

	public void setCpuShares(String cpuShares) {
		this.cpuShares = cpuShares;
	}

	public String getCpuPeriod() {
		return cpuPeriod;
	}

	public void setCpuPeriod(String cpuPeriod) {
		this.cpuPeriod = cpuPeriod;
	}

	public String getCpuQuota() {
		return cpuQuota;
	}

	public void setCpuQuota(String cpuQuota) {
		this.cpuQuota = cpuQuota;
	}

	public String getCpuset() {
		return cpuset;
	}

	public void setCpuset(String cpuset) {
		this.cpuset = cpuset;
	}

	public String getCpusetCpus() {
		return cpusetCpus;
	}

	public void setCpusetCpus(String cpusetCpus) {
		this.cpusetCpus = cpusetCpus;
	}

	public String getCpusetMems() {
		return cpusetMems;
	}

	public void setCpusetMems(String cpusetMems) {
		this.cpusetMems = cpusetMems;
	}

	public Integer getBlkioWeight() {
		return blkioWeight;
	}

	public void setBlkioWeight(Integer blkioWeight) {
		this.blkioWeight = blkioWeight;
	}

	public Integer getMemorySwappiness() {
		return memorySwappiness;
	}

	public void setMemorySwappiness(Integer memorySwappiness) {
		this.memorySwappiness = memorySwappiness;
	}

	public Boolean getOomKillDisable() {
		return oomKillDisable;
	}

	public void setOomKillDisable(Boolean oomKillDisable) {
		this.oomKillDisable = oomKillDisable;
	}

	public Boolean getAttachStdin() {
		return attachStdin;
	}

	public void setAttachStdin(Boolean attachStdin) {
		this.attachStdin = attachStdin;
	}

	public Boolean getAttachStdout() {
		return attachStdout;
	}

	public void setAttachStdout(Boolean attachStdout) {
		this.attachStdout = attachStdout;
	}

	public Boolean getAttachStderr() {
		return attachStderr;
	}

	public void setAttachStderr(Boolean attachStderr) {
		this.attachStderr = attachStderr;
	}

	public Boolean getTty() {
		return tty;
	}

	public void setTty(Boolean tty) {
		this.tty = tty;
	}

	public Boolean getOpenStdin() {
		return openStdin;
	}

	public void setOpenStdin(Boolean openStdin) {
		this.openStdin = openStdin;
	}

	public Boolean getStdinOnce() {
		return stdinOnce;
	}

	public void setStdinOnce(Boolean stdinOnce) {
		this.stdinOnce = stdinOnce;
	}

	public Map<String, String> getEnv() {
		return env;
	}

	public void setEnv(Map<String, String> env) {
		this.env = env;
	}

	public List<String> getCmd() {
		return cmd;
	}

	public void setCmd(List<String> cmd) {
		this.cmd = cmd;
	}

	public String getEntrypoint() {
		return entrypoint;
	}

	public void setEntrypoint(String entrypoint) {
		this.entrypoint = entrypoint;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Map<String, String> getLabels() {
		return labels;
	}

	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}

	public Map<String, Object> getVolumes() {
		return volumes;
	}

	public void setVolumes(Map<String, Object> volumes) {
		this.volumes = volumes;
	}

	public String getWorkingDir() {
		return workingDir;
	}

	public void setWorkingDir(String workingDir) {
		this.workingDir = workingDir;
	}

	public Boolean getNetworkDisabled() {
		return networkDisabled;
	}

	public void setNetworkDisabled(Boolean networkDisabled) {
		this.networkDisabled = networkDisabled;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Map<Integer, Protocol> getExposedPorts() {
		return exposedPorts;
	}

	public void setExposedPorts(Map<Integer, Protocol> exposedPorts) {
		this.exposedPorts = exposedPorts;
	}

	public String getStopSignal() {
		return stopSignal;
	}

	public void setStopSignal(String stopSignal) {
		this.stopSignal = stopSignal;
	}

	public HostConfig getHostConfig() {
		return hostConfig;
	}

	public void setHostConfig(HostConfig hostConfig) {
		this.hostConfig = hostConfig;
	}

	public String getIpv4Address() {
		return ipv4Address;
	}

	public void setIpv4Address(String ipv4Address) {
		this.ipv4Address = ipv4Address;
	}

	public String getIpv6Address() {
		return ipv6Address;
	}

	public void setIpv6Address(String ipv6Address) {
		this.ipv6Address = ipv6Address;
	}

}
