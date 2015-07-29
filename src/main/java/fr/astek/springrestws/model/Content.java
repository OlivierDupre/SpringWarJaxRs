package fr.astek.springrestws.model;


/**
 * @author odupre
 * @version $Id: $
 */
public class Content {

    private final long id;
    private final String name;
    private final int size;
    private final int version;

    public Content(long id, String name, int size, int version) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.version = version;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getVersion() {
        return version;
    }

}
