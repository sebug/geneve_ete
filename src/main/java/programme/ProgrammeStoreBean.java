package programme;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.data.mongodb.core.query.Query;

import programme.entities.*;
import java.util.List;

@Component
public class ProgrammeStoreBean {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public ProgrammeStoreBean(MongoTemplate mongoTemplate) {
	this.mongoTemplate = mongoTemplate;
    }

    public List<AgendaEntry> getAllAgendaEntries() {
	return this.mongoTemplate.findAll(AgendaEntry.class);
    }

    public void storeAgendaEntry(AgendaEntry ae) {
	this.mongoTemplate.insert(ae);
    }
}
