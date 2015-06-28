package programme.entities;

import java.util.Date;

public class AgendaEntry {
    private String id;
    private String title;
    private Date date;
    private boolean favorite;
    private Tag[] tags;

    public AgendaEntry() {
    }

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

    public void setTitle(String title) {
	this.title = title;
    }

    public Date getDate() {
	return this.date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public boolean isFavorite() {
	return this.favorite;
    }

    public void setFavorite(boolean favorite) {
	this.favorite = favorite;
    }

    public Tag[] getTags() {
	return this.tags;
    }

    public void setTags(Tag[] tags) {
	this.tags = tags;
    }

    @Override
    public String toString() {
	return "AgendaEntry [id=" + id + ", title=" + title +
	    ", favorite=" + favorite + ", tags=" +
	    this.tags + "]";
    }
}
