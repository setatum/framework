/*
 * Copyright 2000-2016 Vaadin Ltd.
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

package com.vaadin.legacy.data.util.converter;

import java.io.Serializable;

/**
 * Factory interface for providing Converters based on a presentation type and a
 * model type.
 *
 * @author Vaadin Ltd.
 * @since 7.0
 *
 */
public interface LegacyConverterFactory extends Serializable {
    public <PRESENTATION, MODEL> LegacyConverter<PRESENTATION, MODEL> createConverter(
            Class<PRESENTATION> presentationType, Class<MODEL> modelType);

}
