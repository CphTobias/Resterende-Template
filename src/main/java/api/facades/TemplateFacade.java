package api.facades;

import api.factories.TemplateFactory;
import domain.Template;
import domain.TemplateRepository;
import infrastructure.dbsetup.Database;
import infrastructure.database.DBTemplate;

import java.util.List;

public class TemplateFacade {

    private static TemplateFacade instance;
    private final TemplateRepository repo;

    public TemplateFacade(TemplateRepository repo) {
        this.repo = repo;
    }

    public static TemplateFacade getInstance(){
        TemplateRepository templateRepository = new DBTemplate(new Database());
        if(instance == null){
            instance = new TemplateFacade(templateRepository);
        }
        return instance;
    }

    public Template create(TemplateFactory factory){
        return null;
    }

    public Template find(int id){
        return null;
    }

    public List<Template> findAll(){
        return null;
    }

}
