package programme;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import programme.entities.*;

import java.util.List;

@RestController
@RequestMapping(value="/agenda")
public class AgendaController {
    @Autowired
    private ProgrammeStoreBean programmeStoreBean;

    @RequestMapping(value="/")
    public List<AgendaEntry> getAllEntries() {
	return this.programmeStoreBean.getAllAgendaEntries();
    }
}
