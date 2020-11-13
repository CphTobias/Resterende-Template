package infrastructure.database;

import api.factories.TemplateFactory;
import domain.Template;
import domain.TemplateRepository;
import exceptions.NoSuchTemplateExists;
import infrastructure.dbsetup.Database;

import java.util.List;

public class DBTemplate implements TemplateRepository {
    private final Database db;

    public DBTemplate(Database db) {
        this.db = db;
    }

    @Override
    public List<Template> findAll() {
        return null;
    }

    @Override
    public Template find(int id) throws NoSuchTemplateExists {
        return null;
    }

    @Override
    public Template create(TemplateFactory factory) {
        return null;
    }
}
