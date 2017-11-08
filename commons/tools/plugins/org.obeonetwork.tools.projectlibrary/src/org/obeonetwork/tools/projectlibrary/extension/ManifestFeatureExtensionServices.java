/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.tools.projectlibrary.extension;


import org.eclipse.sirius.business.api.featureextensions.AbstractFeatureExtensionServices;
import org.eclipse.sirius.viewpoint.DFeatureExtension;
import org.eclipse.sirius.viewpoint.description.FeatureExtensionDescription;
import org.obeonetwork.dsl.manifest.MImportExportData;

/**
 * Feature extension services used to set the EClass to be saved within the aird resource
 * @author <a href="mailto:stephane.thibaudeau@obeo.fr">Stephane Thibaudeau</a>
 *
 */
public class ManifestFeatureExtensionServices extends AbstractFeatureExtensionServices {

	@Override
	protected Class<? extends DFeatureExtension> getFeatureExtensionClass() {
		return MImportExportData.class;
	}

	@Override
	protected Class<? extends FeatureExtensionDescription> getFeatureExtensionDescriptionClass() {
		return null;
	}
}
