package programme.entities;

import java.util.Date;

public class AgendaEntry {
    private String id;
    private String title;
    private Date date;
    private boolean favorite;
    private Tag[] tags;

    public AgendaEntry(String title, Date date, boolean favorite, Tag[] tags) {
	this.title = title;
	this.date = date;
	this.favorite = favorite;
	this.tags = tags;
    }

    public String getId() {
	return id;
    }

    public String getTitle() {
	return this.title;
    }

    public Date getDate() {
	return this.date;
    }

    public boolean isFavorite() {
	return this.favorite;
    }

    public Tag[] getTags() {
	return this.tags;
    }

    @Override
    public String toString() {
	return "AgendaEntry [id=" + id + ", title=" + title +
	    ", favorite=" + favorite + ", tags=" +
	    this.tags + "]";
    }
}
