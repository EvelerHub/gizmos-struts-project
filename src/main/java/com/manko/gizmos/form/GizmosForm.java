package com.manko.gizmos.form;

import org.apache.struts.action.ActionForm;

/**
 * @author Alexander Eveler, alexander.eveler@gmail.com
 * @since 13.01.18
 */
public class GizmosForm extends ActionForm {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
