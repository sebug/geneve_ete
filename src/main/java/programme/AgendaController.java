package programme;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import programme.entities.*;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@RestController
@RequestMapping(value="/agenda")
public class AgendaController {
    @Autowired
    private ProgrammeStoreBean programmeStoreBean;

    private Log log = LogFactory.getLog(AgendaController.class);

    @RequestMapping(value="/")
    public List<AgendaEntry> getAllEntries() {
	log.info("Calling getAllEntries");
	return this.programmeStoreBean.getAllAgendaEntries();
    }
}
