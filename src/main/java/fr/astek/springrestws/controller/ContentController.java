package fr.astek.springrestws.controller;

import fr.astek.springrestws.model.Content;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author odupre
 * @version $Id: $
 */
@RestController
public class ContentController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = GET, value = "/list")
    public Content list(@RequestParam(value = "pattern", defaultValue = "*", required = false) String pattern) {
        return new Content(counter.incrementAndGet(), "fileName", 2048, 3);
    }
}
