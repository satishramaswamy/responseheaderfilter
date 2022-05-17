/**
 * Copyright 2009 Avlesh Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.avlesh.web.filter.responseheaderfilter;

/**
 * Constants, mostly DOM node names in the <code>configFile</code> for the filter.
 * @see ConfigProcessor
 * @see ResponseHeaderFilter
 */
public class Constants {
  public static final String RESPONSE_HEADER_MAPPER = "response-header-mapper";
  public static final String MAPPING = "mapping";
  public static final String DEFAULT = "default";
  public static final String CONDITIONAL = "conditional";
  public static final String CONDITIONAL_QUERY_PARAM_NAME = "queryParamName";
  public static final String CONDITIONAL_QUERY_PARAM_VALUE = "queryParamValue";
  public static final String RESPONSE_HEADERS = "response-headers";
  public static final String HEADER = "header";
  public static final String HEADER_KEY = "key";
  public static final String HEADER_VALUE = "value";
}
