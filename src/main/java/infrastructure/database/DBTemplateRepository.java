package infrastructure.database;

import api.factories.TemplateFactory;
import domain.Template;
import domain.TemplateRepository;
import exceptions.NoSuchTemplateExists;
import infrastructure.dbsetup.Database;

import java.sql.PreparedStatement;
import java.util.List;

public class DBTemplateRepository implements TemplateRepository {

    /**
     * Implements an interface it choosing.
     * In here you can call the database.
     */

    private final Database db;

    public DBTemplateRepository(Database db) {
        this.db = db;
    }

    @Override
    public List<Template> findAll() {
        return null;
    }

    @Override
    public Template findById(int id) throws NoSuchTemplateExists {
        return null;
    }

    @Override
    public Template create(TemplateFactory factory) {
        return null;
    }
}
