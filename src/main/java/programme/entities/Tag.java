package programme.entities;

public class Tag {
    private String content;
    private boolean italic;
    private boolean bold;

    public Tag() {
    }

    public Tag(String content, boolean italic, boolean bold) {
	this.content = content;
	this.italic = italic;
	this.bold = bold;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

    public boolean isItalic() {
	return this.italic;
    }

    public void setItalic(boolean italic) {
	this.italic = italic;
    }

    public boolean isBold() {
	return this.bold;
    }

    public void setBold(boolean bold) {
	this.bold = bold;
    }
}
