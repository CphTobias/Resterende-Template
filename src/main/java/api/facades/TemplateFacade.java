package api.facades;

import api.factories.TemplateFactory;
import domain.Template;
import domain.TemplateRepository;
import exceptions.NoSuchTemplateExists;
import infrastructure.dbsetup.Database;
import infrastructure.database.DBTemplateRepository;

import java.util.List;

public class TemplateFacade {

    /**
     * We use a facade pattern inside our api because it splits up the code so we get a better overview of the methods.
     */

    private static TemplateFacade instance;
    private final TemplateRepository repo;

    public TemplateFacade(TemplateRepository repo) {
        this.repo = repo;
    }

    public static TemplateFacade getInstance() {
        if (instance == null) {
            Database db = new Database();
            TemplateRepository templateRepository = new DBTemplateRepository(db);
            instance = new TemplateFacade(templateRepository);
        }
        return instance;
    }

    public Template create(TemplateFactory factory) {
        return null;
    }

    public Template find(int id) throws NoSuchTemplateExists {
        return null;
    }

    public List<Template> findAll() {
        return null;
    }

}
