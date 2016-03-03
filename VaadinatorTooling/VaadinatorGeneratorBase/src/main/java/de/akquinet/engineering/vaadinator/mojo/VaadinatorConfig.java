/*
 * Copyright 2016 Daniel Norhoff-Vergien
 *  
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.akquinet.engineering.vaadinator.mojo;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.akquinet.engineering.vaadinator.model.BeanDescription;

public class VaadinatorConfig {
	public static enum GenType {
		SOURCES, RESOURCES, ALL, NONE
	}

	public static enum ArtifactType {
		PLAIN, EJB, ALL, NONE
	}

	private String projectName;
	private String basePckg;
	private List<BeanDescription> beanDescriptions;
	private ArtifactType artifactTypeEn;
	private GenType genTypeEn;
	private File targetFolderBaseStart;
	private File targetFolderSrcStart;
	private File targetFolderResStart;
	private Map<String, Object> commonMap;
	private Set<String> displayProfileNames;
	private boolean genServletBase;
	private boolean hasDisplayBeans;
	private boolean hasServiceBeans;

	public VaadinatorConfig(String projectName, String basePckg, List<BeanDescription> beanDescriptions,
			ArtifactType artifactTypeEn, GenType genTypeEn, File targetFolderBaseStart, File targetFolderSrcStart,
			File targetFolderResStart, Map<String, Object> commonMap, Set<String> displayProfileNames,
			boolean genServletBase, boolean hasDisplayBeans, boolean hasServiceBeans) {
		this.projectName = projectName;
		this.basePckg = basePckg;
		this.beanDescriptions = beanDescriptions;
		this.artifactTypeEn = artifactTypeEn;
		this.genTypeEn = genTypeEn;
		this.targetFolderBaseStart = targetFolderBaseStart;
		this.targetFolderSrcStart = targetFolderSrcStart;
		this.targetFolderResStart = targetFolderResStart;
		this.commonMap = commonMap;
		this.displayProfileNames = displayProfileNames;
		this.genServletBase = genServletBase;
		this.hasDisplayBeans = hasDisplayBeans;
		this.hasServiceBeans = hasServiceBeans;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBasePckg() {
		return basePckg;
	}

	public void setBasePckg(String basePckg) {
		this.basePckg = basePckg;
	}

	public List<BeanDescription> getBeanDescriptions() {
		return beanDescriptions;
	}

	public void setBeanDescriptions(List<BeanDescription> beanDescriptions) {
		this.beanDescriptions = beanDescriptions;
	}

	public ArtifactType getArtifactTypeEn() {
		return artifactTypeEn;
	}

	public void setArtifactTypeEn(ArtifactType artifactTypeEn) {
		this.artifactTypeEn = artifactTypeEn;
	}

	public GenType getGenTypeEn() {
		return genTypeEn;
	}

	public void setGenTypeEn(GenType genTypeEn) {
		this.genTypeEn = genTypeEn;
	}

	public File getTargetFolderBaseStart() {
		return targetFolderBaseStart;
	}

	public void setTargetFolderBaseStart(File targetFolderBaseStart) {
		this.targetFolderBaseStart = targetFolderBaseStart;
	}

	public File getTargetFolderSrcStart() {
		return targetFolderSrcStart;
	}

	public void setTargetFolderSrcStart(File targetFolderSrcStart) {
		this.targetFolderSrcStart = targetFolderSrcStart;
	}

	public File getTargetFolderResStart() {
		return targetFolderResStart;
	}

	public void setTargetFolderResStart(File targetFolderResStart) {
		this.targetFolderResStart = targetFolderResStart;
	}

	public Map<String, Object> getCommonMap() {
		return commonMap;
	}

	public void setCommonMap(Map<String, Object> commonMap) {
		this.commonMap = commonMap;
	}

	public Set<String> getDisplayProfileNames() {
		return displayProfileNames;
	}

	public void setDisplayProfileNames(Set<String> displayProfileNames) {
		this.displayProfileNames = displayProfileNames;
	}

	public boolean isGenServletBase() {
		return genServletBase;
	}

	public void setGenServletBase(boolean genServletBase) {
		this.genServletBase = genServletBase;
	}

	public boolean isHasDisplayBeans() {
		return hasDisplayBeans;
	}

	public void setHasDisplayBeans(boolean hasDisplayBeans) {
		this.hasDisplayBeans = hasDisplayBeans;
	}

	public boolean isHasServiceBeans() {
		return hasServiceBeans;
	}

	public void setHasServiceBeans(boolean hasServiceBeans) {
		this.hasServiceBeans = hasServiceBeans;
	}
}