package api;

import api.facades.TemplateFacade;

public class Template {

    /**
     * Generates the api, and is created in the ICommand class
     */

    private final TemplateFacade templateFacade;

    public Template(TemplateFacade templateFacade) {
        this.templateFacade = templateFacade;
    }

    public TemplateFacade getTemplateFacade() {
        return templateFacade;
    }
}
