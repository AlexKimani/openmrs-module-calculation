/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation.result;

import java.util.Date;

/**
 * Superclass of {@link Result}s that need to keep track of when the evaluation of the associated
 * calculation occurred
 */
public abstract class DateBasedResult extends BaseResult {
	
	/**
	 * Returns the date when the evaluation of this result's calculation occurred
	 * 
	 * @return the date when the calculation occurred
	 */
	public abstract Date getDateOfResult();
}
