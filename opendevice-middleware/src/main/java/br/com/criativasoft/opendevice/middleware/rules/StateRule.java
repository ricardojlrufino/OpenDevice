/*
 * *****************************************************************************
 * Copyright (c) 2013-2014 CriativaSoft (www.criativasoft.com.br)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Ricardo JL Rufino - Initial API and Implementation
 * *****************************************************************************
 */

package br.com.criativasoft.opendevice.middleware.rules;

import br.com.criativasoft.opendevice.core.model.Device;
import br.com.criativasoft.opendevice.middleware.model.rules.StateRuleSpec;

/**
 *
 * @author Ricardo JL Rufino
 * @date 03/11/16
 */
public class StateRule extends AbstractRule<StateRuleSpec> implements IResourceRule {

    private Device device;

    public void setResource(Device device) {
        this.device = device;
    }

    @Override
    public boolean check() {

        long value = getSpec().getValue();

        return device.getValue() == value;
    }

}
