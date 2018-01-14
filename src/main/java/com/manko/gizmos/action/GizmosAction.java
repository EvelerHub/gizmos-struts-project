package com.manko.gizmos.action;

import com.manko.gizmos.form.GizmosForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alexander Eveler, alexander.eveler@gmail.com
 * @since 13.01.18
 */
public class GizmosAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {

        GizmosForm gizmosForm = (GizmosForm) form;
        gizmosForm.setMessage("Hello world");

        return mapping.findForward("success");
    }
}
