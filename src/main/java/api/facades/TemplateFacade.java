package api.facades;

import infrastructure.database.DBTemplate;

public class TemplateFacade {

    private static TemplateFacade instance;
    private final DBTemplate dbTemplate;

    public TemplateFacade(DBTemplate dbTemplate) {
        this.dbTemplate = dbTemplate;
    }

    public static TemplateFacade getInstance(){
        if(instance == null){
            instance = new TemplateFacade(new DBTemplate());
        }
        return instance;
    }
}
