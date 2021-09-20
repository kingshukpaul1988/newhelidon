/*
 * Copyright (c) 2019, 2020 Oracle and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.oracle.labs.helidon.storefront.exceptions;

public class UnknownItemException extends StorefrontException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4559615175063915485L;

	public UnknownItemException() {
		super();
	}

	public UnknownItemException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UnknownItemException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnknownItemException(String message) {
		super(message);
	}

	public UnknownItemException(Throwable cause) {
		super(cause);
	}
}
